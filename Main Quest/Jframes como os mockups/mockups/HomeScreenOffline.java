package mockups;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class HomeScreenOffline {

	private JFrame frameHomeScreenOffline;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreenOffline window = new HomeScreenOffline();
					window.frameHomeScreenOffline.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreenOffline() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameHomeScreenOffline = new JFrame();
		frameHomeScreenOffline.setTitle("Home");
		frameHomeScreenOffline.getContentPane().setBackground(new Color(0, 0, 0));
		frameHomeScreenOffline.setResizable(false);
		frameHomeScreenOffline.setBounds(100, 100, 489, 704);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frameHomeScreenOffline.setLocation(dim.width/2-frameHomeScreenOffline.getSize().width/2, dim.height/2-frameHomeScreenOffline.getSize().height/2);

		frameHomeScreenOffline.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameHomeScreenOffline.getContentPane().setLayout(null);
		
		JButton buttonEditDeck = new JButton("Edit Deck");
		buttonEditDeck.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonEditDeck.setBackground(new Color(49, 16, 216));
		buttonEditDeck.setForeground(new Color(255, 255, 255));
		buttonEditDeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditDeck.main(null, "Offline");
				frameHomeScreenOffline.dispose();
			}
		});
		buttonEditDeck.setBounds(0, 616, 483, 53);
		frameHomeScreenOffline.getContentPane().add(buttonEditDeck);
		
		
		JButton buttonLogout = new JButton("Return to Login Menu");
		buttonLogout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonLogout.setBackground(new Color(89, 173, 255));
		buttonLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMenu.main(null);
				frameHomeScreenOffline.dispose();
			}
		});
		buttonLogout.setBounds(261, 0, 222, 60);
		frameHomeScreenOffline.getContentPane().add(buttonLogout);
		
		JButton buttonPlayMatch = new JButton("Play match");
		buttonPlayMatch.setForeground(new Color(0, 0, 0));
		buttonPlayMatch.setBackground(new Color(250, 232, 0));
		buttonPlayMatch.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		buttonPlayMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameRing.main(null, "Offline");
				frameHomeScreenOffline.dispose();
			}
		});
		buttonPlayMatch.setBounds(156, 547, 170, 51);
		frameHomeScreenOffline.getContentPane().add(buttonPlayMatch);
		
		JLabel showDeck = new JLabel("Your current deck:");
		showDeck.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		showDeck.setForeground(new Color(255, 255, 255));
		showDeck.setBounds(141, 95, 213, 48);
		frameHomeScreenOffline.getContentPane().add(showDeck);
		
	}
}
