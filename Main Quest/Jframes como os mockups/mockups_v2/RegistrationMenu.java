package mockups;

import Client.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.SwingConstants;
import java.awt.Font;

public class RegistrationMenu extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7052939490437938520L;
	private JPasswordField getPassword;
	private JPasswordField getConfirmPassword;
	private JTextField getUsername;
	private JTextField getLastName;
	private JTextField getFirstName;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public RegistrationMenu(JFrame j) {
		setBackground(Color.BLACK);
		setBounds(0, 0, 489, 704);
		setVisible(true);
		setLayout(null);
		initialize(j);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JFrame jf) {

		JLabel askFirstName = new JLabel("First Name");
		askFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askFirstName.setVerticalAlignment(SwingConstants.TOP);
		askFirstName.setForeground(Color.WHITE);
		askFirstName.setBounds(45, 32, 138, 31);
		add(askFirstName);
		
		JLabel askLastName = new JLabel("Last Name");
		askLastName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askLastName.setVerticalAlignment(SwingConstants.TOP);
		askLastName.setForeground(Color.WHITE);
		askLastName.setBounds(45, 127, 180, 31);
		add(askLastName);
		
		JLabel askUsername = new JLabel("Username (*)");
		askUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askUsername.setVerticalAlignment(SwingConstants.TOP);
		askUsername.setForeground(new Color(255, 255, 255));
		askUsername.setBounds(45, 234, 138, 31);
		add(askUsername);
		
		JLabel askPassword = new JLabel("Password");
		askPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askPassword.setVerticalAlignment(SwingConstants.TOP);
		askPassword.setForeground(Color.WHITE);
		askPassword.setBounds(45, 347, 138, 31);
		add(askPassword);
		
		JLabel askConfirmPassword = new JLabel("Confirm Password");
		askConfirmPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askConfirmPassword.setForeground(Color.WHITE);
		askConfirmPassword.setVerticalAlignment(SwingConstants.TOP);
		askConfirmPassword.setBounds(45, 448, 199, 29);
		add(askConfirmPassword);
		
		getFirstName = new JTextField();
		getFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getFirstName.setBackground(new Color(211, 211, 211));
		getFirstName.setBounds(45, 63, 399, 41);
		add(getFirstName);
		
		getLastName = new JTextField();
		getLastName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getLastName.setBackground(new Color(211, 211, 211));
		getLastName.setBounds(45, 158, 399, 41);
		add(getLastName);
		
		getUsername = new JTextField();
		getUsername.setBackground(new Color(211, 211, 211));
		getUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getUsername.setBounds(45, 265, 399, 41);
		add(getUsername);
		
		JButton buttonCancel = new JButton("CANCEL");
		buttonCancel.setForeground(new Color(255, 255, 255));
		buttonCancel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonCancel.setBackground(new Color(49, 16, 216));
		buttonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				jf.setTitle("Arcade Duel");
				JPanel login = new LoginMenu(jf);
				add(login);
				repaint();
			}
		});
		
		getPassword = new JPasswordField();
		getPassword.setBackground(new Color(211, 211, 211));
		getPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getPassword.setBounds(45, 378, 399, 41);
		add(getPassword);
		
		getConfirmPassword = new JPasswordField();
		getConfirmPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getConfirmPassword.setBackground(new Color(211, 211, 211));
		getConfirmPassword.setBounds(45, 484, 399, 41);
		add(getConfirmPassword);
		buttonCancel.setBounds(61, 580, 155, 47);
		add(buttonCancel);
		
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
					System.out.println("Password: " + new String(String.valueOf(getPassword.getPassword())));
					System.out.println("Confirm Password: " + new String(getConfirmPassword.getPassword()));
					System.out.println("--------------------");

					
					Thread client = new Thread(new Client("10.227.145.169", 9999, "register", getUsername.getText(), String.valueOf(getPassword.getPassword()), getFirstName.getText(), getLastName.getText()));
					client.start();
					
					
					//if criado com sucesso

					
					JOptionPane.showMessageDialog(null, "You are now registered!", "Registration", JOptionPane.INFORMATION_MESSAGE);
					removeAll();
					jf.setTitle("Arcade Duel");
					JPanel login = new LoginMenu(jf);
					add(login);
					repaint();
				}
			}
		});
		buttonRegister.setBounds(280, 580, 158, 47);
		add(buttonRegister);
		
		JLabel lblNewLabel = new JLabel("(*) Field should be unique");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(25, 638, 383, 24);
		add(lblNewLabel);
	}
}
