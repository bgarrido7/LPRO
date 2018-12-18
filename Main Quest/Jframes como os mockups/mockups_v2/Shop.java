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

public class Shop extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8697394162490358148L;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Shop(JFrame j) {
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
		
		JButton buttonReturn = new JButton("Return to Home Screen");
		buttonReturn.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonReturn.setBackground(new Color(49, 16, 216));
		buttonReturn.setForeground(new Color(255, 255, 255));
		buttonReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				removeAll();
				jf.setTitle("Home Screen");
				JPanel home = new HomeScreenOnline(jf);
				add(home);
				repaint();
			}
		});
		buttonReturn.setBounds(0, 617, 483, 52);
		add(buttonReturn);
		
		JButton buttonBuy = new JButton("BUY");
		buttonBuy.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		buttonBuy.setBackground(new Color(250, 232, 0));
		buttonBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonBuy.setBounds(187, 569, 111, 35);
		add(buttonBuy);
		
		JLabel showMoney = new JLabel("Money:");
		showMoney.setForeground(new Color(255, 255, 255));
		showMoney.setVerticalAlignment(SwingConstants.TOP);
		showMoney.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		showMoney.setBounds(10, 6, 153, 52);
		add(showMoney);
		
		JButton button = new JButton("order by");
		button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		button.setBackground(new Color(8, 200, 238));
		button.setBounds(26, 579, 92, 25);
		add(button);
		
		JButton btnSellCharacters = new JButton("sell characters");
		btnSellCharacters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnSellCharacters.getText()=="sell characters") {
					buttonBuy.setText("SELL");
					btnSellCharacters.setText("buy characters");
				}
				
				else if(btnSellCharacters.getText()=="buy characters") {
					buttonBuy.setText("BUY");
					btnSellCharacters.setText("sell characters");
				}
			}
		});
		btnSellCharacters.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnSellCharacters.setBackground(new Color(8, 200, 238));
		btnSellCharacters.setBounds(348, 579, 123, 25);
		add(btnSellCharacters);
	}

}
