package org.itstep.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;

public class MainWindow extends JFrame{

	private JFrame frame;

	public MainWindow(String Title) {
		setTitle(Title);
		initialize();
	}
	
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(10, 10, 200, 150);
		frame.getContentPane().add(calendar);
		
		JButton btnAddActivity = new JButton("Add activity");
		btnAddActivity.setBounds(220, 130, 100, 30);
		frame.getContentPane().add(btnAddActivity);
		btnAddActivity.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Add plan window
				
			}
		});
		
		JList scheduleDisplay = new JList();
		scheduleDisplay.setBounds(10, 170, 506, 238);
		frame.getContentPane().add(scheduleDisplay);
		
		JButton btnDeleteChosen = new JButton("Delete chosen");
		btnDeleteChosen.setBounds(340, 130, 100, 30);
		frame.getContentPane().add(btnDeleteChosen);
		btnDeleteChosen.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Delete from database
				
			}
		});
	}
}
