package kalkulator;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class kalkulator {
	public static final String TITLE = "Kalkulator";
	

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator window = new kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setSize(380, 270);
		setLocationRelativeTo(null);
																																//	frame.setForeground(Color.black); 																					
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(TITLE);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{49, 52, 49, 36, 49, 49, 0};
		gridBagLayout.rowHeights = new int[]{22, 27, 25, 25, 25, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
	
		textField.setFont(new Font("SansSerif", Font.BOLD, 15));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0,0,0 );
		gbc_textField.gridwidth = 10;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 1;
		frame.getContentPane().add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 1;
		gbc_button_8.gridy = 1;
		frame.getContentPane().add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 1;
		frame.getContentPane().add(button_9, gbc_button_9);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bOperacja = Operacja.DZIELENIE;
				liczba2=Double.parseDouble(textField.getText());
				number=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.BOTH;
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 4;
		gbc_button_14.gridy = 1;
		frame.getContentPane().add(button_14, gbc_button_14);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number=Double.parseDouble(textField.getText());
				liczba2=Double.parseDouble(textField.getText());
				textField.setText("");
				
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 1;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 2;
		frame.getContentPane().add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 1;
		gbc_button_5.gridy = 2;
		frame.getContentPane().add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 2;
		gbc_button_6.gridy = 2;
		frame.getContentPane().add(button_6, gbc_button_6);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bOperacja = Operacja.MNO¯ENIE;
				number=Double.parseDouble(textField.getText());
				liczba2=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.BOTH;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 4;
		gbc_button_13.gridy = 2;
		frame.getContentPane().add(button_13, gbc_button_13);
		
		JButton button_16 = new JButton("%");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bOperacja = Operacja.PROCENT;
				liczba2=Double.parseDouble(textField.getText());
				number=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.fill = GridBagConstraints.BOTH;
		gbc_button_16.insets = new Insets(0, 0, 5, 0);
		gbc_button_16.gridx = 5;
		gbc_button_16.gridy = 2;
		frame.getContentPane().add(button_16, gbc_button_16);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 3;
		frame.getContentPane().add(button, gbc_button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 3;
		frame.getContentPane().add(button_1, gbc_button_1);
																												//frame.setForeground(Color.red);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 3;
		frame.getContentPane().add(button_3, gbc_button_3);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bOperacja = Operacja.ODEJMOWANIE;
				liczba2=Double.parseDouble(textField.getText());
				number=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.BOTH;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 4;
		gbc_button_12.gridy = 3;
		frame.getContentPane().add(button_12, gbc_button_12);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//Double wynik=null;
				double wynik;
				liczba2=Double.parseDouble(textField.getText());
				liczba1=Double.parseDouble(textField.getText());
				
				if (bOperacja==Operacja.DODAWANIE)
					{wynik=number+liczba2;
					textField.setText(""+wynik);}
				else if (bOperacja==Operacja.ODEJMOWANIE)
					{wynik=number-liczba2;
					textField.setText(""+wynik);}
				else if(bOperacja==Operacja.MNO¯ENIE)
					{wynik=number*liczba2;
					textField.setText(""+wynik);}
				else if(bOperacja==Operacja.DZIELENIE)
					{wynik=number/liczba2;
					textField.setText(""+wynik);}
				else if(bOperacja==Operacja.PROCENT)
					{wynik=(number*0.01*liczba2);
					textField.setText(""+wynik);
				}
//	if (wynik != null) textField.setText(""+wynik);
				
			}
		});
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.fill = GridBagConstraints.BOTH;
		gbc_button_15.gridheight = 2;
		gbc_button_15.gridx = 5;
		gbc_button_15.gridy = 3;
		frame.getContentPane().add(button_15, gbc_button_15);
		
		JButton button_2 = new JButton("0");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridwidth = 2;
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 4;
		frame.getContentPane().add(button_2, gbc_button_2);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.BOTH;
		gbc_button_10.insets = new Insets(0, 0, 0, 5);
		gbc_button_10.gridx = 2;
		gbc_button_10.gridy = 4;
		frame.getContentPane().add(button_10, gbc_button_10);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bOperacja = Operacja.DODAWANIE;
				number=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 0, 5);
		gbc_button_11.gridx = 4;
		gbc_button_11.gridy = 4;
		frame.getContentPane().add(button_11, gbc_button_11);
		
	}
	

		private void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		
	}


		boolean clear = false;
		private Double number = null;
		double liczba1,liczba2;
		private enum Operacja {
			BRAK,DODAWANIE,ODEJMOWANIE,MNO¯ENIE,DZIELENIE,PROCENT
		}
		private Operacja bOperacja= Operacja.BRAK;

				
				
}
