package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import semana_03.Consultor;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_3 extends JFrame implements ActionListener {
	
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
					Propuesto_3_3 frame = new Propuesto_3_3();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_3_3() {
		setTitle("Propuesto_3_3");
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
		Consultor c1 = new Consultor(1234, 23, "Erick", 13.9);
				listado(c1);
				Consultor c2 = new Consultor(4321, 18, "Manuel");
				listado(c2);
				Consultor c3 = new Consultor();
				listado(c3);
				imprimir("------------------");
				imprimir("Cantidad\t:  " + Consultor.getCantidad());
				imprimir("Sum.Neto\t:  " + Consultor.getSumaNeto());
				imprimir("AFP porc.\t:  " + Consultor.AFP);
				imprimir("EPS porc.\t:  " + Consultor.EPS);
	}
	void listado(Consultor x) {
		imprimir("Dir. Memoria\t: " + x);
		imprimir("Código\t\t: " + x.getCodigo());
		imprimir("Nombre\t\t: " + x.getNombre());
		imprimir("Horas\t\t: " + x.getTarifa());
		imprimir("Suel.Bruto\t: " + String.format("%.2f", x.sueldoBruto()));
		imprimir("Desc.AFP\t: " + String.format("%.2f", x.descuentoAFP()));
		imprimir("Desc.EPS\t: " + String.format("%.2f", x.descuentoEPS()));
		imprimir("Suel.Neto\t: " + String.format("%.2f", x.sueldoNeto()));
		imprimir();
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}