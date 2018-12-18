package mockups;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class EditProfile extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 946220122001980647L;
	private JPasswordField getConfirmPassword;
	private JTextField getLastName;
	private JTextField getFirstName;
	private JPasswordField getPassword;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public EditProfile(JFrame j) {
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
		
		JLabel showProfile = new JLabel("<>'s Profile");
		showProfile.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		showProfile.setForeground(Color.WHITE);
		showProfile.setVerticalAlignment(SwingConstants.TOP);
		showProfile.setBounds(122, 23, 322, 41);
		add(showProfile);
		
		JLabel askFirstName = new JLabel("Change First Name");
		askFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askFirstName.setVerticalAlignment(SwingConstants.TOP);
		askFirstName.setForeground(Color.WHITE);
		askFirstName.setBounds(45, 92, 199, 31);
		add(askFirstName);
		
		JLabel askLastName = new JLabel("Change Last Name");
		askLastName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askLastName.setVerticalAlignment(SwingConstants.TOP);
		askLastName.setForeground(Color.WHITE);
		askLastName.setBounds(45, 177, 180, 31);
		add(askLastName);
		
		JLabel askPassword = new JLabel("Change password");
		askPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askPassword.setVerticalAlignment(SwingConstants.TOP);
		askPassword.setForeground(new Color(255, 255, 255));
		askPassword.setBounds(45, 262, 214, 31);
		add(askPassword);
		
		JLabel askConfirmPassword = new JLabel("Confirm password");
		askConfirmPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askConfirmPassword.setVerticalAlignment(SwingConstants.TOP);
		askConfirmPassword.setForeground(Color.WHITE);
		askConfirmPassword.setBounds(45, 347, 199, 31);
		add(askConfirmPassword);
		
		getFirstName = new JTextField();
		getFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getFirstName.setBackground(new Color(211, 211, 211));
		getFirstName.setBounds(45, 123, 399, 41);
		add(getFirstName);
		
		getLastName = new JTextField();
		getLastName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getLastName.setBackground(new Color(211, 211, 211));
		getLastName.setBounds(45, 208, 399, 41);
		add(getLastName);
		
		JButton buttonReturn = new JButton("Return to home screen");
		buttonReturn.setForeground(new Color(255, 255, 255));
		buttonReturn.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonReturn.setBackground(new Color(49, 16, 216));
		buttonReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				jf.setTitle("Home Screen");
				JPanel home = new HomeScreenOnline(jf);
				add(home);
				repaint();
			}
		});
		
		getPassword = new JPasswordField();
		getPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getPassword.setBackground(new Color(211, 211, 211));
		getPassword.setBounds(45, 293, 399, 41);
		add(getPassword);
		
		getConfirmPassword = new JPasswordField();
		getConfirmPassword.setBackground(new Color(211, 211, 211));
		getConfirmPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getConfirmPassword.setBounds(45, 378, 399, 41);
		add(getConfirmPassword);
		buttonReturn.setBounds(0, 617, 483, 52);
		add(buttonReturn);
		
		JButton buttonConfirm = new JButton("Confirm");
		buttonConfirm.setForeground(new Color(0, 0, 0));
		buttonConfirm.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonConfirm.setBackground(new Color(250, 232, 0));
		buttonConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!(Arrays.equals(getPassword.getPassword(), getConfirmPassword.getPassword()))) {

					JOptionPane.showMessageDialog(null, "Passwords don't correspond!", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				else {
					System.out.println("Edit profile:");
					System.out.println("New First Name: " + getFirstName.getText());	//isto n era suposto ser definitivo e mudar era o username? 
					System.out.println("First Last Name: " + getLastName.getText());
					System.out.println("Password: " + new String(getPassword.getPassword()));
					System.out.println("Confirm Password: " + new String(getConfirmPassword.getPassword()));
					System.out.println("--------------------");

					JOptionPane.showMessageDialog(null, "Profile edited!", "Edit profile", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		buttonConfirm.setBounds(179, 557, 158, 47);
		add(buttonConfirm);
		
		JButton btnChangeAvatarPic = new JButton("Change avatar pic");
		btnChangeAvatarPic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChangeAvatarPic.setForeground(new Color(0, 0, 0));
		btnChangeAvatarPic.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnChangeAvatarPic.setBackground(new Color(8, 200, 238));
		btnChangeAvatarPic.setBounds(45, 465, 177, 37);
		add(btnChangeAvatarPic);
	}
}
