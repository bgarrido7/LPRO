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
import javax.swing.SwingConstants;

public class HomeScreenOnline {

	private JFrame frameHomeScreenOnline;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreenOnline window = new HomeScreenOnline();
					window.frameHomeScreenOnline.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreenOnline() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameHomeScreenOnline = new JFrame();
		frameHomeScreenOnline.setTitle("Home");
		frameHomeScreenOnline.getContentPane().setBackground(new Color(0, 0, 0));
		frameHomeScreenOnline.setResizable(false);
		frameHomeScreenOnline.setBounds(100, 100, 489, 704);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frameHomeScreenOnline.setLocation(dim.width/2-frameHomeScreenOnline.getSize().width/2, dim.height/2-frameHomeScreenOnline.getSize().height/2);

		frameHomeScreenOnline.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameHomeScreenOnline.getContentPane().setLayout(null);
		
		JButton buttonEditDeck = new JButton("Edit Deck");
		buttonEditDeck.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonEditDeck.setBackground(new Color(49, 16, 216));
		buttonEditDeck.setForeground(new Color(255, 255, 255));
		buttonEditDeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditDeck.main(null, "Online");
				frameHomeScreenOnline.dispose();
			}
		});
		buttonEditDeck.setBounds(0, 616, 161, 53);
		frameHomeScreenOnline.getContentPane().add(buttonEditDeck);
		
		JButton buttonShop = new JButton("Shop");
		buttonShop.setBackground(new Color(49, 16, 216));
		buttonShop.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonShop.setForeground(new Color(255, 255, 255));
		buttonShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shop.main(null);
				frameHomeScreenOnline.dispose();
			}
		});
		buttonShop.setBounds(161, 616, 161, 53);
		frameHomeScreenOnline.getContentPane().add(buttonShop);
		
		JButton buttonPlayMatch = new JButton("Play match");
		buttonPlayMatch.setForeground(new Color(0, 0, 0));
		buttonPlayMatch.setBackground(new Color(250, 232, 0));
		buttonPlayMatch.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		buttonPlayMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameRing.main(null, "Online");
				frameHomeScreenOnline.dispose();
			}
		});
		buttonPlayMatch.setBounds(156, 547, 170, 51);
		frameHomeScreenOnline.getContentPane().add(buttonPlayMatch);
		
		JButton buttonEditProfile = new JButton("Edit Profile");
		buttonEditProfile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonEditProfile.setBackground(new Color(49, 16, 216));
		buttonEditProfile.setForeground(new Color(255, 255, 255));
		buttonEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditProfile.main(null);
				frameHomeScreenOnline.dispose();
			}
		});
		buttonEditProfile.setBounds(322, 616, 161, 53);
		frameHomeScreenOnline.getContentPane().add(buttonEditProfile);
		
		JButton buttonLogout = new JButton("Logout");
		buttonLogout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonLogout.setBackground(new Color(89, 173, 255));
		buttonLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMenu.main(null);
				frameHomeScreenOnline.dispose();
			}
		});
		buttonLogout.setBounds(361, 0, 122, 37);
		frameHomeScreenOnline.getContentPane().add(buttonLogout);
		
		JLabel showRanking = new JLabel("Ranking:");
		showRanking.setVerticalAlignment(SwingConstants.TOP);
		showRanking.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		showRanking.setForeground(new Color(255, 255, 255));
		showRanking.setBounds(95, 13, 84, 35);
		frameHomeScreenOnline.getContentPane().add(showRanking);
		
		JLabel showMoney = new JLabel("Money:");
		showMoney.setVerticalAlignment(SwingConstants.TOP);
		showMoney.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		showMoney.setForeground(new Color(255, 255, 255));
		showMoney.setBounds(95, 47, 84, 35);
		frameHomeScreenOnline.getContentPane().add(showMoney);
		
		JLabel showDeck = new JLabel("Your current deck:");
		showDeck.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		showDeck.setForeground(new Color(255, 255, 255));
		showDeck.setBounds(141, 95, 213, 48);
		frameHomeScreenOnline.getContentPane().add(showDeck);
		
	}
}
