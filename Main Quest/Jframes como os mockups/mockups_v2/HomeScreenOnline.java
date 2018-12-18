package mockups;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import Client.Client;

public class HomeScreenOnline extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 140020168821984827L;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 * @param jf 
	 */
	public HomeScreenOnline(JFrame j) {
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
		
		JButton buttonEditDeck = new JButton("Edit Deck");
		buttonEditDeck.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonEditDeck.setBackground(new Color(49, 16, 216));
		buttonEditDeck.setForeground(new Color(255, 255, 255));
		buttonEditDeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				removeAll();
				jf.setTitle("Edit Deck");
				JPanel deck = new EditDeck("Online", jf);
				add(deck);
				repaint();
			}
		});
		buttonEditDeck.setBounds(0, 616, 161, 53);
		add(buttonEditDeck);
		
		JButton buttonShop = new JButton("Shop");
		buttonShop.setBackground(new Color(49, 16, 216));
		buttonShop.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonShop.setForeground(new Color(255, 255, 255));
		buttonShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				removeAll();
				jf.setTitle("Shop");
				JPanel shop = new Shop(jf);
				add(shop);
				repaint();
			}
		});
		buttonShop.setBounds(161, 616, 161, 53);
		add(buttonShop);
		
		JButton buttonPlayMatch = new JButton("Play match");
		buttonPlayMatch.setForeground(new Color(0, 0, 0));
		buttonPlayMatch.setBackground(new Color(250, 232, 0));
		buttonPlayMatch.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		buttonPlayMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				removeAll();
				jf.setTitle("Battle");
				JPanel login = new GameRing("Online", jf);
				add(login);
				repaint();
			}
		});
		buttonPlayMatch.setBounds(156, 547, 170, 51);
		add(buttonPlayMatch);
		
		JButton buttonEditProfile = new JButton("Edit Profile");
		buttonEditProfile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonEditProfile.setBackground(new Color(49, 16, 216));
		buttonEditProfile.setForeground(new Color(255, 255, 255));
		buttonEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				jf.setTitle("Edit Profile");
				JPanel edit = new EditProfile(jf);
				add(edit);
				repaint();			
			}
		});
		buttonEditProfile.setBounds(322, 616, 161, 53);
		add(buttonEditProfile);
		
		JButton buttonLogout = new JButton("LOGOUT");
		buttonLogout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonLogout.setBackground(new Color(89, 173, 255));
		buttonLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Thread client = new Thread(new Client("logout"));
				client.start();
				
				removeAll();
				jf.setTitle("Arcade Duel");
				JPanel login = new LoginMenu(jf);
				add(login);
				repaint();
			}
		});
		buttonLogout.setBounds(361, 0, 122, 37);
		add(buttonLogout);
		
		JLabel showRanking = new JLabel("Ranking:");
		showRanking.setVerticalAlignment(SwingConstants.TOP);
		showRanking.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		showRanking.setForeground(new Color(255, 255, 255));
		showRanking.setBounds(95, 13, 84, 35);
		add(showRanking);
		
		JLabel showMoney = new JLabel("Money:");
		showMoney.setVerticalAlignment(SwingConstants.TOP);
		showMoney.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		showMoney.setForeground(new Color(255, 255, 255));
		showMoney.setBounds(95, 47, 84, 35);
		add(showMoney);
		
		JLabel showDeck = new JLabel("Your current deck:");
		showDeck.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		showDeck.setForeground(new Color(255, 255, 255));
		showDeck.setBounds(141, 95, 213, 48);
		add(showDeck);
		
	}
}
