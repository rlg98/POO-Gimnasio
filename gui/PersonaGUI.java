package gui;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class PersonaGUI extends VentanaGUI {
   protected JTextField txtNombre;
   protected JTextField txtPaterno;
   protected JTextField txtMaterno;
   protected JTextField txtEdad;
   protected JTextField txtTelefono;
   protected JTextArea  txaDomicilio;
   
   public PersonaGUI(String pTitulo, Integer pAncho, Integer pLargo) {
      super(pTitulo, pAncho, pLargo);
   }
   
   @Override
   public void componentes() {
      txtId        = texto("Id"      , "1");
      txtNombre    = texto("Nombre"  , "Raúl");
      txtPaterno   = texto("Paterno" , "Lara");
      txtMaterno   = texto("Materno" , "García");
      txtEdad      = texto("Edad"    , "23");
      txtTelefono  = texto("Telefono", "9931173247");
      txaDomicilio = area ("Área"    , "Calle Principal S/N\nColonia Centro");
   }
   protected void limpiar() {
      txtId        .setText("");
      txtNombre    .setText("");
      txtPaterno   .setText("");
      txtMaterno   .setText("");
      txtEdad      .setText("");
      txtTelefono  .setText("");
      txaDomicilio .setText("");
      txtId        .requestFocus();
   }
}