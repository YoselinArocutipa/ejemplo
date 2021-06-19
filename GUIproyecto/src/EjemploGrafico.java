import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class EjemploGrafico extends JFrame {

	private JPanel contentPane;
	private JTextField caja1;
	private JTextField caja2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploGrafico frame = new EjemploGrafico();
					frame.setVisible(true);
					// PARA CENTRARLO
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EjemploGrafico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 352);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double n1 = Double.parseDouble(caja1.getText());
				double n2 = Double.parseDouble(caja2.getText());
				double resultado = 0;
				resultado = n1+n2;
				JOptionPane.showMessageDialog(null, "La suma es: "+resultado);
				
			}
		});
		btnNewButton.setBounds(10, 242, 85, 37);
		contentPane.add(btnNewButton);
		
		caja1 = new JTextField();
		caja1.setFont(new Font("Courier New", Font.PLAIN, 25));
		caja1.setBounds(279, 83, 125, 34);
		contentPane.add(caja1);
		caja1.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setFont(new Font("Courier New", Font.PLAIN, 25));
		caja2.setBounds(279, 146, 125, 32);
		contentPane.add(caja2);
		caja2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(caja1.getText());
				double n2 = Double.parseDouble(caja2.getText());
				double resultado = 0;
				resultado = n1-n2;
				JOptionPane.showMessageDialog(null, "La resta es: "+resultado);
			}
		});
		btnNewButton_1.setBounds(118, 242, 85, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(caja1.getText());
				double n2 = Double.parseDouble(caja2.getText());
				double resultado = 0;
				resultado = n1*n2;
				JOptionPane.showMessageDialog(null, "El producto es: "+resultado);
			}
		});
		btnNewButton_2.setBounds(229, 242, 85, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(caja1.getText());
				double n2 = Double.parseDouble(caja2.getText());
				double resultado = 0;
				resultado = n1/n2;
				
				if (n2==0) {
					JOptionPane.showMessageDialog(null, "La division es infinita");
				}
				else {
					JOptionPane.showMessageDialog(null, "La division es: "+resultado);
				}
			}
		});
		btnNewButton_3.setBounds(337, 242, 85, 37);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA");
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 31));
		lblNewLabel.setBounds(112, 21, 221, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese primer n\u00FAmero:");
		lblNewLabel_1.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(24, 92, 263, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese segundo n\u00FAmero:");
		lblNewLabel_2.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(24, 151, 262, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Seleccione operaci\u00F3n a realizar:");
		lblNewLabel_3.setFont(new Font("Courier New", Font.BOLD, 16));
		lblNewLabel_3.setBounds(51, 211, 327, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SUMAR");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_4.setBounds(34, 289, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("MULTIPLICACI\u00D3N");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_5.setBounds(239, 289, 100, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RESTAR");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_6.setBounds(144, 289, 60, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DIVISI\u00D3N");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_7.setBounds(359, 289, 85, 13);
		contentPane.add(lblNewLabel_7);
	}
}
