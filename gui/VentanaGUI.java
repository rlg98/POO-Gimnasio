package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class VentanaGUI extends JFrame implements ActionListener {
	protected Container contenedor;
	protected JPanel central;
	protected JPanel botones;
	protected JTextField txtId;

	public VentanaGUI(String pTitulo, Integer pAncho, Integer pLargo) {
		this(pTitulo, pAncho, pLargo, false);
	}

	public VentanaGUI(String pTitulo, Integer pAncho, Integer pLargo, Boolean pPrincipal) {
		this.setTitle(pTitulo);
		this.setSize(pAncho, pLargo);
		this.setDefaultCloseOperation(pPrincipal ? JFrame.EXIT_ON_CLOSE : JFrame.DISPOSE_ON_CLOSE);
		this.contenedor = this.getContentPane();
		this.contenedor.setLayout(new BorderLayout());
		this.encabezado(pTitulo);
		this.central();
		this.botones();
		this.componentes();
		this.salir();
		this.setVisible(true);
	}

	protected JLabel encabezado(String pEtiqueta) {
		JLabel lbl = new JLabel(pEtiqueta);
		this.contenedor.add(lbl, BorderLayout.NORTH);
		return lbl;
	}

	protected JPanel central() {
		JPanel pnl = new JPanel(new GridLayout(0, 2));
		this.contenedor.add(pnl, BorderLayout.CENTER);
		return pnl;
	}

	protected JPanel botones() {
		JPanel pnl = new JPanel(new GridLayout(1, 0));
		this.contenedor.add(pnl, BorderLayout.SOUTH);
		return pnl;
	}

	protected JButton boton(String pTexto) {
		JButton boton = new JButton(pTexto);
		boton.addActionListener(this);
		this.botones.add(boton);
		return boton;
	}

	protected void salir() {
		JButton btn = new JButton("Salir");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent pE) {
				dispose();
			}
		});
		this.botones.add(btn);
	}

	public abstract void componentes();

	protected void campo(String pEtiqueta, JComponent pComponente) {
		this.etiqueta(pEtiqueta);
		this.central.add(pComponente);
	}

	protected JLabel etiqueta(String pEtiqueta) {
		JLabel lbl = new JLabel(pEtiqueta + ":");
		this.central.add(lbl);
		return lbl;
	}

	protected JTextField texto(String pEtiqueta, String pTexto) {
		JTextField campo = new JTextField(pTexto);
		this.campo(pEtiqueta, campo);
		return campo;
	}

	protected JTextArea area(String pEtiqueta, String pTexto) {
		JTextArea campo = new JTextArea(pTexto, 5, 0);
		this.campo(pEtiqueta, campo);
		return campo;
	}

	protected <T> JComboBox<T> combo(String pEtiqueta, T[] pTextos) {
		JComboBox<T> campo = new JComboBox<T>(pTextos);
		this.campo(pEtiqueta, campo);
		return campo;
	}

	protected JLabel foto(String pEtiqueta, String pNombre) {
		JLabel campo = new JLabel(new ImageIcon(pNombre));
		this.campo(pEtiqueta, campo);
		return campo;
	}

}
