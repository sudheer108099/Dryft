package com.Dryft.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

// import com.Dryft.models.User;

public class Addmoney extends JFrame {
	private JTextField addMoney1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addmoney frame = new Addmoney();
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
	public Addmoney() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Amount to be Added :-");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(156, 238, 214, 22);
		getContentPane().add(lblNewLabel_1);
		
		addMoney1 = new JTextField();
		addMoney1.setBounds(409, 230, 256, 27);
		getContentPane().add(addMoney1);
		addMoney1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ADD MONEY");
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblNewLabel_2.setBounds(269, 10, 179, 73);
		getContentPane().add(lblNewLabel_2);
		
		JButton addButton = new JButton("ADD");
		addButton.setForeground(Color.BLUE);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int addMoney= Integer.parseInt(addMoney1.getText());
				JOptionPane.showMessageDialog(null, "An amount of Rs. "+addMoney+" has been added successfully.");
                                addMoney1.setText("");
			}
		});
		addButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
		addButton.setBounds(459, 300, 117, 32);
		getContentPane().add(addButton);
		
		JLabel currentBalance = new JLabel("Constructor");
		currentBalance.setFont(new Font("SansSerif", Font.PLAIN, 16));
		currentBalance.setBounds(409, 153, 256, 27);
		getContentPane().add(currentBalance);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnNewButton_1.setBounds(635, 300, 117, 30);
		getContentPane().add(btnNewButton_1);
		JLabel label = new JLabel("Current Balance :- ");
		label.setFont(new Font("SansSerif", Font.PLAIN, 20));
		label.setBounds(156, 149, 214, 33);
		getContentPane().add(label);
	}
}
