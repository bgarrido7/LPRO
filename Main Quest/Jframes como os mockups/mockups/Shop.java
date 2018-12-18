package mockups;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Shop {

	private JFrame frameShop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop window = new Shop();
					window.frameShop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Shop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameShop = new JFrame();
		frameShop.getContentPane().setBackground(new Color(0, 0, 0));
		frameShop.setBackground(new Color(0, 0, 0));
		frameShop.setResizable(false);
		frameShop.setBounds(100, 100, 489, 704);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frameShop.setLocation(dim.width/2-frameShop.getSize().width/2, dim.height/2-frameShop.getSize().height/2);

		frameShop.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameShop.getContentPane().setLayout(null);
		
		JButton buttonReturn = new JButton("Return to Home Screen");
		buttonReturn.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonReturn.setBackground(new Color(49, 16, 216));
		buttonReturn.setForeground(new Color(255, 255, 255));
		buttonReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreenOnline.main(null);
				frameShop.dispose();
			}
		});
		buttonReturn.setBounds(0, 617, 483, 52);
		frameShop.getContentPane().add(buttonReturn);
		
		JButton buttonBuy = new JButton("BUY");
		buttonBuy.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		buttonBuy.setBackground(new Color(250, 232, 0));
		buttonBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Transaction Completed!", "Saving...", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		buttonBuy.setBounds(187, 569, 111, 35);
		frameShop.getContentPane().add(buttonBuy);
		
		JLabel showMoney = new JLabel("Money:");
		showMoney.setForeground(new Color(255, 255, 255));
		showMoney.setVerticalAlignment(SwingConstants.TOP);
		showMoney.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		showMoney.setBounds(10, 6, 153, 52);
		frameShop.getContentPane().add(showMoney);
		
		JButton button = new JButton("order by");
		button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		button.setBackground(new Color(8, 200, 238));
		button.setBounds(26, 579, 92, 25);
		frameShop.getContentPane().add(button);
		
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
		frameShop.getContentPane().add(btnSellCharacters);
	}

}
