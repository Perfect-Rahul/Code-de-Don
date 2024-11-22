package com.gsv.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Panel;

public class LoginDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginDemo frame = new LoginDemo();
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
	public LoginDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(52, 28, 140, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(52, 114, 114, 47);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(202, 39, 174, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnNewButton.setBounds(61, 381, 165, 53);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 10, 10);
		contentPane.add(panel);
		btnReset.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnReset.setBackground(Color.CYAN);
		btnReset.setBounds(305, 381, 165, 53);
		contentPane.add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 124, 174, 37);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Captcha");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(52, 229, 94, 37);
		contentPane.add(lblNewLabel_2);
	}
}
