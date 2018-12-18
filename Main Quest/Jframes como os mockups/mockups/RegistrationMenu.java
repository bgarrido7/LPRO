package mockups;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class RegistrationMenu {

	private JFrame frameRegistrationMenu;
	private JPasswordField getPassword;
	private JPasswordField getConfirmPassword;
	private JTextField getUsername;
	private JTextField getLastName;
	private JTextField getFirstName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationMenu window = new RegistrationMenu();
					window.frameRegistrationMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrationMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameRegistrationMenu = new JFrame();
		frameRegistrationMenu.setTitle("Register");
		frameRegistrationMenu.setResizable(false);
		frameRegistrationMenu.getContentPane().setBackground(Color.BLACK);
		frameRegistrationMenu.setBackground(Color.WHITE);
		frameRegistrationMenu.setBounds(100, 100, 489, 704);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frameRegistrationMenu.setLocation(dim.width/2-frameRegistrationMenu.getSize().width/2, dim.height/2-frameRegistrationMenu.getSize().height/2);
		frameRegistrationMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameRegistrationMenu.getContentPane().setLayout(null);
		
		JLabel askFirstName = new JLabel("First Name");
		askFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askFirstName.setVerticalAlignment(SwingConstants.TOP);
		askFirstName.setForeground(Color.WHITE);
		askFirstName.setBounds(45, 32, 138, 31);
		frameRegistrationMenu.getContentPane().add(askFirstName);
		
		JLabel askLastName = new JLabel("Last Name");
		askLastName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askLastName.setVerticalAlignment(SwingConstants.TOP);
		askLastName.setForeground(Color.WHITE);
		askLastName.setBounds(45, 127, 180, 31);
		frameRegistrationMenu.getContentPane().add(askLastName);
		
		JLabel askUsername = new JLabel("Username (*)");
		askUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askUsername.setVerticalAlignment(SwingConstants.TOP);
		askUsername.setForeground(new Color(255, 255, 255));
		askUsername.setBounds(45, 234, 138, 31);
		frameRegistrationMenu.getContentPane().add(askUsername);
		
		JLabel askPassword = new JLabel("Password");
		askPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askPassword.setVerticalAlignment(SwingConstants.TOP);
		askPassword.setForeground(Color.WHITE);
		askPassword.setBounds(45, 347, 138, 31);
		frameRegistrationMenu.getContentPane().add(askPassword);
		
		JLabel askConfirmPassword = new JLabel("Confirm Password");
		askConfirmPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askConfirmPassword.setForeground(Color.WHITE);
		askConfirmPassword.setVerticalAlignment(SwingConstants.TOP);
		askConfirmPassword.setBounds(45, 448, 199, 29);
		frameRegistrationMenu.getContentPane().add(askConfirmPassword);
		
		getFirstName = new JTextField();
		getFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getFirstName.setBackground(new Color(211, 211, 211));
		getFirstName.setBounds(45, 63, 399, 41);
		frameRegistrationMenu.getContentPane().add(getFirstName);
		getFirstName.setColumns(10);
		
		getLastName = new JTextField();
		getLastName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getLastName.setBackground(new Color(211, 211, 211));
		getLastName.setBounds(45, 158, 399, 41);
		frameRegistrationMenu.getContentPane().add(getLastName);
		getLastName.setColumns(10);
		
		getUsername = new JTextField();
		getUsername.setBackground(new Color(211, 211, 211));
		getUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getUsername.setBounds(45, 265, 399, 41);
		frameRegistrationMenu.getContentPane().add(getUsername);
		getUsername.setColumns(10);
		
		JButton buttonCancel = new JButton("CANCEL");
		buttonCancel.setForeground(new Color(255, 255, 255));
		buttonCancel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonCancel.setBackground(new Color(49, 16, 216));
		buttonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMenu.main(null);
				frameRegistrationMenu.dispose();
			}
		});
		
		getPassword = new JPasswordField();
		getPassword.setBackground(new Color(211, 211, 211));
		getPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getPassword.setBounds(45, 378, 399, 41);
		frameRegistrationMenu.getContentPane().add(getPassword);
		
		getConfirmPassword = new JPasswordField();
		getConfirmPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getConfirmPassword.setBackground(new Color(211, 211, 211));
		getConfirmPassword.setBounds(45, 484, 399, 41);
		frameRegistrationMenu.getContentPane().add(getConfirmPassword);
		buttonCancel.setBounds(61, 580, 155, 47);
		frameRegistrationMenu.getContentPane().add(buttonCancel);
		
		JButton buttonRegister = new JButton("REGISTER");
		buttonRegister.setForeground(new Color(255, 255, 255));
		buttonRegister.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonRegister.setBackground(new Color(49, 16, 216));
		buttonRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!(Arrays.equals(getPassword.getPassword(), getConfirmPassword.getPassword()))) {

					JOptionPane.showMessageDialog(null, "Passwords don't correspond!", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				else {
					System.out.println("Register:");
					System.out.println("First Name: " + getFirstName.getText());
					System.out.println("First Last Name: " + getLastName.getText());
					System.out.println("First Username: " + getUsername.getText());
					System.out.println("Password: " + new String(getPassword.getPassword()));
					System.out.println("Confirm Password: " + new String(getConfirmPassword.getPassword()));
					System.out.println("--------------------");

					JOptionPane.showMessageDialog(null, "You are now registered!", "Registration", JOptionPane.INFORMATION_MESSAGE);
					LoginMenu.main(null);
					frameRegistrationMenu.dispose();	
				}
			}
		});
		buttonRegister.setBounds(280, 580, 158, 47);
		frameRegistrationMenu.getContentPane().add(buttonRegister);
		
		JLabel lblNewLabel = new JLabel("(*) Field should be unique");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(25, 638, 383, 24);
		frameRegistrationMenu.getContentPane().add(lblNewLabel);
	}
}
