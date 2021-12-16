package gui;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import cls.Cliente;
import cls.Paquete;
import enu.FormaPago;
import lib.Archivo;
import lib.Util;

public class ClienteGUI extends PersonaGUI {
   private JComboBox<FormaPago> cmbFormaPago;
   private JComboBox<Paquete>   cmbPaquete;
    
   public ClienteGUI() {
      super("Ventana de Clientes", 500, 380);

   }
   @Override
   public void componentes() {
      super.componentes();
      Paquete[] paquetes = {
            new Paquete(1, "Básico", 150),
            new Paquete(2, "Intermedio", 200),
            new Paquete(3, "SemiProfesional", 300),
            new Paquete(4, "Profesional", 400),
      };
      cmbFormaPago = combo("Forma de Pago", FormaPago.values());
      cmbPaquete   = combo("Paquete", paquetes);
      boton("Limpiar");
      boton("Guardar");
      boton("Buscar");
      boton("Listado");
      boton("Imprimir");
   }
   @Override
   public void actionPerformed(ActionEvent pE) {
         switch (pE.getActionCommand()) {
         case "Limpiar":
         limpiar();
         cmbFormaPago.setSelectedIndex(0);
         cmbPaquete.setSelectedIndex(0);
         break;
      
         case "Guardar":
            Cliente c0 = new Cliente(
                  Integer.parseInt(txtId.getText()),
                  txtNombre    .getText(),
                  txtPaterno   .getText(),
                  txtMaterno   .getText(),
                  Integer.parseInt(txtEdad      .getText()),
                  Long.parseLong(txtTelefono  .getText()),
                  txaDomicilio .getText(),
                  (FormaPago)cmbFormaPago.getSelectedItem(),
                  (Paquete)cmbPaquete.getSelectedItem()     
            );
            if(Archivo.busqueda("dat/Cliente.txt", c0.getId()).equals("")) {
               Archivo.escritura("dat/Cliente.txt", c0.toStringArchivo());
            }else{
               Util.mostrar("Cliente", "Este cliente ya esta registrado");
            }
            break;
      
         case "Buscar":
            Cliente c1 = new Cliente(
                  Integer.parseInt(txtId.getText()),
                  txtNombre.getText()
                  );
            String registro = Archivo.busqueda("dat/Cliente.txt", c1.getId());
            if(!registro.equals("")) {
               String[] datos = registro.split("\\|");
               txtId           .setText(datos[ 1].trim());
               txtNombre       .setText(datos[ 2].trim());
               txtPaterno      .setText(datos[ 3].trim());
               txtMaterno      .setText(datos[ 4].trim());
               txtEdad         .setText(datos[ 5].trim());
               txtTelefono     .setText(datos[ 6].trim());
               txaDomicilio    .setText(datos[ 7].trim().replaceAll("!", "\n"));
               cmbFormaPago    .setSelectedItem(FormaPago.valueOf(datos[ 8].trim()));
               String[] datosPaquete = datos[9].trim().split("\\(");
               Integer id = Integer.parseInt(datosPaquete[ 1].trim());
               cmbPaquete      .setSelectedIndex(id-1);
               Util.mostrar("Cliente", "Cliente Registrado");
            }else {
               Util.mostrar("Cliente", "El Cliente no esta Registrado");
            }
            break;
         case "Listado":
            Util.mostrar("Cliente", Archivo.lectura("dat/Cliente.txt"));
            break;
         case "Imprimir":
            Cliente c2 = new Cliente(
                 Integer      .parseInt(txtId.getText()),
                 txtNombre    .getText(),
                 txtPaterno   .getText(),
                 txtMaterno   .getText(),
                 Integer.parseInt(txtEdad      .getText()),
                 Long.parseLong(txtTelefono .getText()),
                 txaDomicilio .getText(),
                 (FormaPago) cmbFormaPago.getSelectedItem(),
                 (Paquete)cmbPaquete.getSelectedItem());
           c2.imprimir();
        }
    }
}

