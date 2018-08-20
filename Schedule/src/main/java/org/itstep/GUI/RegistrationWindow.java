package org.itstep.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistrationWindow extends JFrame{

	private JTextField txtLogin;
	private JTextField txtPassword;
	private JTextField txtConfirm;
	private JTextField txtFirstName;
	private JTextField txtSecondName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;

	public RegistrationWindow(String title) {
		setTitle(title);
		initialize();
	}
	
	public RegistrationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setVisible(true);
		setResizable(false);
		setBounds(100, 100, 300, 375);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setText("Login");
		txtLogin.setBounds(10, 10, 120, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 50, 120, 20);
		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		txtConfirm = new JTextField();
		txtConfirm.setText("Confirm");
		txtConfirm.setBounds(10, 90, 120, 20);
		getContentPane().add(txtConfirm);
		txtConfirm.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First name");
		txtFirstName.setBounds(10, 130, 120, 20);
		getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtSecondName = new JTextField();
		txtSecondName.setText("Second name");
		txtSecondName.setBounds(10, 170, 120, 20);
		getContentPane().add(txtSecondName);
		txtSecondName.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone number");
		txtPhoneNumber.setBounds(10, 210, 120, 20);
		getContentPane().add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		txtEmail.setBounds(10, 250, 120, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setBounds(140, 10, 120, 20);
		getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setBounds(140, 90, 120, 20);
		getContentPane().add(lblPassword);
		
		JLabel lblFName = new JLabel("");
		lblFName.setBounds(140, 130, 120, 20);
		getContentPane().add(lblFName);
		
		JLabel lblSName = new JLabel("");
		lblSName.setBounds(140, 170, 120, 20);
		getContentPane().add(lblSName);
		
		JLabel lblPhone = new JLabel("");
		lblPhone.setBounds(140, 210, 120, 20);
		getContentPane().add(lblPhone);
		
		JLabel lblMail = new JLabel("");
		lblMail.setBounds(140, 250, 120, 20);
		getContentPane().add(lblMail);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(10, 299, 89, 23);
		getContentPane().add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO add fieldcheck, label reporting, sending data
				
			}
		});
	}
}
