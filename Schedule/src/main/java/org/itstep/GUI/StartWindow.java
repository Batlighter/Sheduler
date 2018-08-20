package org.itstep.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import org.itstep.model.User;
import org.itstep.dao.UserDAO;

import javax.swing.JButton;

public class StartWindow extends JFrame{

	
	private JTextField txtLogin;
	private JTextField txtPassword;
	
	public StartWindow() {
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public StartWindow(String Title) {
		setTitle(Title);
		setResizable(false);
		setBounds(100, 100, 270, 230);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogin.setBounds(40, 40, 60, 20);
		getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(40, 90, 60, 20);
		getContentPane().add(lblPassword);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLogin.setBounds(110, 40, 120, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPassword.setBounds(110, 90, 120, 20);
		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(40, 150, 90, 20);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				User Temp = new User();
				UserDAO DBWork = new UserDAO();
				Temp = DBWork.getOne(txtLogin.getText());
				if(Temp.getPassword() == txtPassword.getText()){
					MainWindow window = new MainWindow(Temp.getLogin());
					dispose();
				}
				else {
					setTitle("Invalid credentials");
				}
			}
		});
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(140, 150, 90, 20);
		getContentPane().add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				RegistrationWindow register = new RegistrationWindow("Registration");				
			}
		});
		
		setVisible(true);
	}

}
