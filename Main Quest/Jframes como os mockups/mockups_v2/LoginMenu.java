package mockups;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

import Client.*;

import java.awt.Color;

public class LoginMenu extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3555012613742439778L;
	private JPasswordField getPassword;
	private JTextField getUsername;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 * @param jf 
	 */
	public LoginMenu(JFrame j) {
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

		getPassword = new JPasswordField();
		getPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getPassword.setForeground(new Color(0, 0, 0));
		getPassword.setBackground(new Color(211, 211, 211));
		getPassword.setBounds(45, 392, 399, 41);
		add(getPassword);
		
		JLabel askUsername = new JLabel("Username");
		askUsername.setVerticalAlignment(SwingConstants.TOP);
		askUsername.setHorizontalAlignment(SwingConstants.LEFT);
		askUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askUsername.setForeground(Color.WHITE);
		askUsername.setBounds(45, 241, 138, 31);
		add(askUsername);
		
		JLabel askPassword = new JLabel("Password");
		askPassword.setVerticalAlignment(SwingConstants.TOP);
		askPassword.setForeground(Color.WHITE);
		askPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askPassword.setBounds(45, 352, 144, 34);
		add(askPassword);
		
		getUsername = new JTextField();
		getUsername.setHorizontalAlignment(SwingConstants.LEFT);
		getUsername.setToolTipText("");
		getUsername.setBackground(new Color(211, 211, 211));
		getUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getUsername.setBounds(45, 282, 399, 41);
		add(getUsername);
		
		JButton buttonLogin = new JButton("LOGIN");
		buttonLogin.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonLogin.setBackground(new Color(49, 16, 216	));
		buttonLogin.setForeground(Color.WHITE);
		buttonLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println("Login");
				System.out.println("Username: " + getUsername.getText());
				System.out.println("Password: " + getPassword.getText());
				System.out.println("--------------------");

				
				Thread client = new Thread(new Client("10.227.145.169", 9999, "login", getUsername.getText(), String.valueOf(getPassword.getPassword())));
				client.start();
				
//				if(login valido)
				
				removeAll();
				invalidate();
				jf.setTitle("Home Screen");
				JPanel panelHomeOnline = new HomeScreenOnline(jf);
				add(panelHomeOnline);
				revalidate();
				repaint();

			//	}
				
	//			else
		//			System.out.println("ERRO NO LOGIN");

			}
		});
		buttonLogin.setBounds(45, 459, 164, 47);
		add(buttonLogin);
		
		JButton buttonRegister = new JButton("REGISTER");
		buttonRegister.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonRegister.setBackground(new Color(49, 16, 216));
		buttonRegister.setForeground(Color.WHITE);
		buttonRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				removeAll();
				invalidate();
				jf.setTitle("Register");
				JPanel panelRegister = new RegistrationMenu(jf);
				add(panelRegister);
				revalidate();
				repaint();
			}
		});
		buttonRegister.setBounds(279, 459, 164, 47);
		add(buttonRegister);
		
		JButton buttonQuickPlay = new JButton("Quick Play");
		buttonQuickPlay.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		buttonQuickPlay.setBackground(new Color(250, 232, 0));
		buttonQuickPlay.setForeground(new Color(0, 0, 0));
		buttonQuickPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				invalidate();
				jf.setTitle("Home Screen");
				JPanel panelHomeOffline = new HomeScreenOffline(jf);
				add(panelHomeOffline);
				revalidate();
				repaint();			}
		});
		buttonQuickPlay.setBounds(144, 565, 210, 79);
		add(buttonQuickPlay);
		
		JLabel titleArcade = new JLabel("ARCADE");
		titleArcade.setForeground(Color.WHITE);
		titleArcade.setHorizontalAlignment(SwingConstants.CENTER);
		titleArcade.setFont(new Font("Segoe UI", Font.PLAIN, 72));
		titleArcade.setBounds(45, 35, 398, 85);
		add(titleArcade);
		
		JLabel titleDuel = new JLabel("DUEL");
		titleDuel.setForeground(Color.WHITE);
		titleDuel.setHorizontalAlignment(SwingConstants.CENTER);
		titleDuel.setFont(new Font("Segoe UI", Font.PLAIN, 72));
		titleDuel.setBounds(45, 70, 398, 191);
		add(titleDuel);
	}
}
