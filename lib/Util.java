package lib;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

public class Util {
	public static String fecha(Date pFecha) {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yy");
		SimpleDateFormat f2 = new SimpleDateFormat("dd/MM/yyyy");
		Date d = null;
		try {
			String s = f.format(pFecha);
		    d = f.parse(s);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		return f2.format(d);
	}
	
	@SuppressWarnings("deprecation")
	public static String fecha(int pAnio, int pMes, int pDia) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd");
		return f.format(new Date(pAnio, pMes - 1, pDia));
	}
   
	@SuppressWarnings("deprecation")
	public static Date date(int pAnio, int pMes, int pDia) {
		Date d = null;
		try {
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yy");
			String s = f.format(new Date(pAnio, pMes - 1, pDia));
		    d = f.parse(s);
		} catch (ParseException e) {
		    System.out.println("El Formato de la fecha es incorrecto: " + e.getMessage()); 
		} catch (IllegalArgumentException e) {
			System.out.println("El Formato de la fecha es incorrecto: " + e.getMessage()); 
		} catch (NullPointerException e) {
			System.out.println("El Formato de la fecha es incorrecto: " + e.getMessage()); 
		}
		
		return d;
	}
	
    
   public static void mostrar(String pTitulo, String pTexto){
       Color fondo = Util.colorClaro(), letra = Util.colorOscuro();
       pTexto =  Util.marco(pTexto) + "\n" + pTexto + "\n" + Util.marco(pTexto);
       Integer filas = pTexto.split("\n").length;
       if (filas > 15) {
    	   filas = 15;
       }
       JTextArea area0 = new JTextArea(pTexto, filas, 0);
                 area0.setEditable(false);
                 area0.setBackground(fondo);
                 area0.setForeground(letra);
                 area0.setFont(new Font(Font.MONOSPACED,Font.BOLD,24));
                 area0.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(fondo.darker(), 10), pTitulo, TitledBorder.CENTER, 0, new Font("Sectar", Font.BOLD,24), letra));
       JOptionPane.showMessageDialog(null, new JScrollPane(area0), pTitulo, JOptionPane.INFORMATION_MESSAGE);
   }
   public static Color colorClaro(){
       return new Color(Util.entero(200, 255),Util.entero(200, 255), Util.entero(200, 255));
   }
   public static Color colorOscuro(){
       return new Color(Util.entero(100),Util.entero(100), Util.entero(100));
   }
   
   
   public static String marco(String pTexto){
       int ancho = 0;
       String[] lineas = pTexto.split("\n");
       for (String linea : lineas) {
           if (linea.length() > ancho) {
               ancho = linea.length();
           }
       }
       return Util.replicate("-",ancho);
   }
   public static String replicate(String pTexto,Integer pAncho){
       String cadena = "";
       for(int i = 0; i < pAncho; i++){
           cadena += pTexto;
       } 
       return cadena;
   }
   
   public static int entero(int pMax) { //Genera un entero
      return (int)(Math.random()*pMax);
   }
   public static int entero(int pMin, int pMax) { //Genera un entero
      return (int)(Math.random()*(pMax-pMin))+ pMin;
   }
   public static String nombre() { //Genera un nombre
      String[] nombres = {"Agust�n","Josefa","Ang�lica","Juana","Mar�a","Petra","Susy","Alberta","PRUEBA", "�ngel","Juan" ,"Mario","Pedro","Pablo","Alberto","Luis"};
      return nombres[entero(nombres.length)];
   }
   public static String apellido() { //Genera un apellido
      String[] apellidos = {"Melgar","Escutia","De la Barrera","Montes de Oca", "Dom�nguez","Jes�s","�rias","Cruz" ,"De la Cruz","L�pez","C�rdenas","Ram�rez","Vald�z","Ramos"};
      return apellidos[entero(apellidos.length)];
   }
   public static Image getImagen(String pNombre) {
      return new ImageIcon(pNombre).getImage();
   }
   public static Image getEscalada(String pNombre, int pAncho) {
      return getEscalada(pNombre, pAncho, pAncho);
   }
   public static Image getEscalada(String pNombre, int pAncho, int pLargo) {
      return getImagen(pNombre).getScaledInstance(pAncho, pLargo, Image.SCALE_FAST);
   }
   public static ImageIcon getIcon(String pNombre, int pTamanio) {
      return new ImageIcon(getEscalada(pNombre, pTamanio));
   }
   public static ImageIcon getIcon(String pNombre, int pAncho, int pLargo) {
	   return new ImageIcon(getEscalada(pNombre, pAncho, pLargo));
   }
   public static JLabel etiqueta(String pTexto, String pInfo, int pAncho, int pLargo, int pLetra) {
      JLabel lbl = new JLabel(pTexto);
             lbl.setToolTipText(pInfo);
             lbl.setPreferredSize(new Dimension(pAncho, pLargo));
             lbl.setMaximumSize(new Dimension(pAncho, pLargo));
             lbl.setFont(new Font("Tahoma", Font.PLAIN, pLetra));
             lbl.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
      return lbl;
   }
   public static JButton boton(String pTexto, ActionListener pAccion) {
      return boton(pTexto, pAccion, 32);
   }
   public static JButton boton(String pTexto, ActionListener pAccion, int pLetra) {
      JButton btn = new JButton(pTexto);
              btn.setPreferredSize(new Dimension(300, 50));
              btn.setFont(new Font("Tahoma", Font.PLAIN, pLetra));
              btn.addActionListener(pAccion);
      return btn;
   }
   public static void panelHorizontal(Container pContenedor, int pAncho, int pLargo, Component...pComponentes) {
      pContenedor.setPreferredSize(new Dimension(pAncho, pLargo));
      pContenedor.setLayout(new BoxLayout(pContenedor, BoxLayout.X_AXIS));
      for (Component componente : pComponentes) {
         pContenedor.add(componente);         
      }
   }
   public static <T> JScrollPane panelVertical(String pTitulo, Vector<T> pComponentes) {
      JPanel panel = new JPanel(new GridLayout(0,1));
             panel.setBorder(BorderFactory.createTitledBorder(pTitulo + " (" + pComponentes.size() + ")"));
      for (T componente : pComponentes) {
         panel.add((Component) componente);
      }
      JScrollPane scroll = new JScrollPane(panel);
      scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      return scroll;
   }
   
}