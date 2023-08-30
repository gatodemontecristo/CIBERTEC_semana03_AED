package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Balon;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_3_2 frame = new Propuesto_3_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_3_2() {
		setTitle("Propuesto_3_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		// Creamos 3 objetos
		Balon b1 = new Balon("Umbro", 15.6, 6.7, 25, 90.50);
		listado(b1);
		Balon b2 = new Balon("Wilson", 13.4, 2.9);
		listado(b2);
		Balon b3 = new Balon();
		listado(b3);
		imprimir("------------------");
		imprimir("Cant.Balón\t:  " + Balon.getCantidad());
		imprimir("Sum.Importe\t:  " + Balon.getSuma_importe());
		imprimir("Valor PI\t:  " + Balon.PI);
		imprimir("Valor Desc\t:  " + Balon.DESC);
		
	}

	void listado(Balon x) {
		imprimir("Dir. Memoria\t: " + x);
		imprimir("Marca\t\t: " + x.getMarca());
		imprimir("PesoGr.\t\t: " + x.getPeso_gram());
		imprimir("Pres.Lb.\t: " + x.getPre_libra());
		imprimir("Diam.\t\t: " + x.getDiamentro());
		imprimir("Precio\t\t: " + x.getPrecio());
		imprimir("Radio\t\t: " + String.format("%.2f", x.radio()));
		imprimir("Volumen\t\t: " + String.format("%.2f", x.volumen()));
		imprimir("Descuento\t: " + String.format("%.2f", x.descuento()));
		imprimir("Imp.Pagar\t: " + String.format("%.2f", x.importePagar()));
		imprimir();
	}

	// M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}

	// M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}

}