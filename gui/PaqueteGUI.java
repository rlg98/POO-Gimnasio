package gui;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public class PaqueteGUI extends VentanaGUI {
      protected JTextField txtNombre;
      protected JTextField txtPrecio;
      
   public PaqueteGUI(String pTitulo, Integer pAncho, Integer pLargo) {
      super(pTitulo, pAncho, pLargo);
   }
   @Override
   public void componentes() {
   txtNombre = texto("Nombre", "");
   txtPrecio = texto("Precio", "");
   }
   @Override
   public void actionPerformed(ActionEvent pE) {
   }

  

}
