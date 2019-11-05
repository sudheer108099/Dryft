import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class Signup {

	private JFrame frame;
	private JPasswordField pf1;
	private JTextField tf3;
	private JTextField tf2;
	private JPasswordField pf2;
	private JTextField tf1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN UP ");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblNewLabel.setBounds(185, 11, 108, 41);
		frame.getContentPane().add(lblNewLabel);
		
		pf1 = new JPasswordField();
		pf1.setBounds(256, 175, 129, 20);
		frame.getContentPane().add(pf1);
		
		JLabel lblFullName = new JLabel("FULL NAME");
		lblFullName.setBounds(69, 92, 73, 14);
		frame.getContentPane().add(lblFullName);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(69, 175, 83, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblConfirmPassword = new JLabel("CONFIRM PASSWORD");
		lblConfirmPassword.setBounds(69, 217, 177, 20);
		frame.getContentPane().add(lblConfirmPassword);
		
		JLabel lblSex = new JLabel("GENDER");
		lblSex.setBounds(69, 259, 108, 20);
		frame.getContentPane().add(lblSex);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL ID");
		lblNewLabel_2.setBounds(69, 308, 108, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tf3 = new JTextField();
		tf3.setBounds(256, 305, 129, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("MALE");
		buttonGroup.add(rb1);
		rb1.setBounds(256, 258, 73, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("FEMALE");
		buttonGroup.add(rb2);
		rb2.setBounds(347, 258, 109, 23);
		frame.getContentPane().add(rb2);
		
		JLabel lblUserName = new JLabel("USER ID");
		lblUserName.setBounds(69, 131, 73, 14);
		frame.getContentPane().add(lblUserName);
		
		tf2 = new JTextField();
		tf2.setBounds(256, 128, 129, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		pf2 = new JPasswordField();
		pf2.setBounds(256, 217, 129, 20);
		frame.getContentPane().add(pf2);
		
		JRadioButton rb3 = new JRadioButton("New radio button");
		buttonGroup.add(rb3);
		rb3.setBounds(469, 258, 109, 23);
		frame.getContentPane().add(rb3);
		rb3.setVisible(false);
		
		JButton btnSignUp = new JButton("SIGN UP TO DRYFT !");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tf1.getText();
				String user_id=tf2.getText();
				String pwd=pf1.getText();
				String cpwd=pf2.getText();
				String gender,respect="Ma'am";
				String email_id=tf3.getText();
				if(rb1.isSelected()==true)
					{gender="M"; respect="Sir";
					}
					
				else
					gender="F";
			   if(pwd.equals(cpwd)==true && pwd.length()!=0)
			   {
				   JOptionPane.showMessageDialog(null, "Hi " +respect+", your account has been successfully created !!");
			   }
			   else
				   JOptionPane.showMessageDialog(null, "Password confirmation failed. Retry");
					
			}
		});
		btnSignUp.setBounds(69, 364, 154, 23);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 tf1.setText("");
				 tf2.setText("");
				 tf3.setText("");
				 pf1.setText("");
				 pf2.setText("");
				 rb3.setSelected(true);
				 
			}
		});
		btnClear.setBounds(259, 364, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(399, 364, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		tf1 = new JTextField();
		tf1.setBounds(256, 89, 129, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		
	}
}
