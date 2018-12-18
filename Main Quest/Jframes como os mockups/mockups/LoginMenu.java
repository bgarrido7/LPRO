package mockups;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

public class LoginMenu {

	private JFrame frameLoginMenu;
	private JPasswordField getPassword;
	private JTextField getUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	/*	try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMenu window = new LoginMenu();
					window.frameLoginMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLoginMenu = new JFrame();
		frameLoginMenu.setResizable(false);
		frameLoginMenu.setTitle("Arcade Duel");
		frameLoginMenu.getContentPane().setBackground(Color.BLACK);
		frameLoginMenu.setBackground(Color.BLACK);
		frameLoginMenu.setForeground(Color.BLACK);
		frameLoginMenu.getContentPane().setForeground(Color.BLACK);
		frameLoginMenu.setBounds(100, 100, 489, 704);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frameLoginMenu.setLocation(dim.width/2-frameLoginMenu.getSize().width/2, dim.height/2-frameLoginMenu.getSize().height/2);

		frameLoginMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLoginMenu.getContentPane().setLayout(null);
		
		getPassword = new JPasswordField();
		getPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getPassword.setForeground(new Color(0, 0, 0));
		getPassword.setBackground(new Color(211, 211, 211));
		getPassword.setBounds(45, 392, 399, 41);
		frameLoginMenu.getContentPane().add(getPassword);
		
		JLabel askUsername = new JLabel("Username");
		askUsername.setVerticalAlignment(SwingConstants.TOP);
		askUsername.setHorizontalAlignment(SwingConstants.LEFT);
		askUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askUsername.setForeground(Color.WHITE);
		askUsername.setBounds(45, 241, 138, 31);
		frameLoginMenu.getContentPane().add(askUsername);
		
		JLabel askPassword = new JLabel("Password");
		askPassword.setVerticalAlignment(SwingConstants.TOP);
		askPassword.setForeground(Color.WHITE);
		askPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		askPassword.setBounds(45, 352, 144, 34);
		frameLoginMenu.getContentPane().add(askPassword);
		
		getUsername = new JTextField();
		getUsername.setHorizontalAlignment(SwingConstants.LEFT);
		getUsername.setToolTipText("");
		getUsername.setBackground(new Color(211, 211, 211));
		getUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		getUsername.setBounds(45, 282, 399, 41);
		frameLoginMenu.getContentPane().add(getUsername);
		getUsername.setColumns(10);
		
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

				HomeScreenOnline.main(null);
				frameLoginMenu.dispose();
			}
		});
		buttonLogin.setBounds(45, 459, 164, 47);
		frameLoginMenu.getContentPane().add(buttonLogin);
		
		JButton buttonRegister = new JButton("REGISTER");
		buttonRegister.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonRegister.setBackground(new Color(49, 16, 216));
		buttonRegister.setForeground(Color.WHITE);
		buttonRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationMenu.main(null);
				frameLoginMenu.dispose();
			}
		});
		buttonRegister.setBounds(279, 459, 164, 47);
		frameLoginMenu.getContentPane().add(buttonRegister);
		
		JButton buttonQuickPlay = new JButton("Quick Play");
		buttonQuickPlay.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		buttonQuickPlay.setBackground(new Color(250, 232, 0));
		buttonQuickPlay.setForeground(new Color(0, 0, 0));
		buttonQuickPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreenOffline.main(null);
				frameLoginMenu.dispose();
			}
		});
		buttonQuickPlay.setBounds(144, 565, 210, 79);
		frameLoginMenu.getContentPane().add(buttonQuickPlay);
		
		JLabel titleArcade = new JLabel("ARCADE");
		titleArcade.setForeground(Color.WHITE);
		titleArcade.setHorizontalAlignment(SwingConstants.CENTER);
		titleArcade.setFont(new Font("Segoe UI", Font.PLAIN, 72));
		titleArcade.setBounds(45, 35, 398, 85);
		frameLoginMenu.getContentPane().add(titleArcade);
		
		JLabel titleDuel = new JLabel("DUEL");
		titleDuel.setForeground(Color.WHITE);
		titleDuel.setHorizontalAlignment(SwingConstants.CENTER);
		titleDuel.setFont(new Font("Segoe UI", Font.PLAIN, 72));
		titleDuel.setBounds(45, 70, 398, 191);
		frameLoginMenu.getContentPane().add(titleDuel);
	}
}
