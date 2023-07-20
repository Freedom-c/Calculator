package paket1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7916134475533919389L;
	private JPanel contentPane;
	private JTextField textField;
	private double answer,number;
	int operation;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void addInput(String s) {
		textField.setText(textField.getText()+ s);
	}
	
	public void calculate() {
		switch(operation) {
			case 1:
				answer=number+ Double.parseDouble(textField.getText());
				textField.setText(Double.toString(answer));
				break;
			case 2:
				answer=number- Double.parseDouble(textField.getText());
				textField.setText(Double.toString(answer));
				break;
			case 3:
				answer=number* Double.parseDouble(textField.getText());
				textField.setText(Double.toString(answer));
				break;
			case 4:
				answer=number/ Double.parseDouble(textField.getText());
				textField.setText(Double.toString(answer));
				break;
		}
	}
	/**
	 * Create the frame.
	 */

	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 10, 416, 70);
		contentPane.add(screen);
		screen.setLayout(null);
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 23));
		textField.setBounds(0, 26, 416, 34);
		screen.add(textField);
		textField.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 10));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 10, 416, 13);
		screen.add(lbl);
		
		JPanel control = new JPanel();
		control.setBounds(10, 89, 416, 324);
		contentPane.add(control);
		control.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_2.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_3.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=1;
				textField.setText(" ");
				lbl.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		control.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_1.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_9 = new JButton("5");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_9.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_9);
		
		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_6.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("-");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=2;
				textField.setText(" ");
				lbl.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		control.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("3");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_7.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_8.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_10.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_10);
		
		JButton btnNewButton_11_1 = new JButton("x");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=3;
				textField.setText(" ");
				lbl.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_11_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_11_1.setBackground(Color.LIGHT_GRAY);
		control.add(btnNewButton_11_1);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_11.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_11);
		
		JButton btnNewButton_11_2 = new JButton("=");
		btnNewButton_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText(" ");
			}
		});
		btnNewButton_11_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_11_2.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_11_2);
		
		JButton btnNewButton_11_3 = new JButton("C");
		btnNewButton_11_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
			}
		});
		btnNewButton_11_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_11_3.setBackground(new Color(128, 128, 255));
		control.add(btnNewButton_11_3);
		
		JButton btnNewButton_11_4 = new JButton("/");
		btnNewButton_11_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=4;
				textField.setText(" ");
				lbl.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_11_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_11_4.setBackground(Color.LIGHT_GRAY);
		control.add(btnNewButton_11_4);
	}
}
