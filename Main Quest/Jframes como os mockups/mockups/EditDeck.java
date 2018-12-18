package mockups;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;

public class EditDeck {

	private JFrame frameEditDeck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String mode) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditDeck window = new EditDeck(mode);
					window.frameEditDeck.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditDeck(String mode) {
		initialize(mode);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String mode) {
		frameEditDeck = new JFrame();
		frameEditDeck.setResizable(false);
		frameEditDeck.getContentPane().setBackground(new Color(0, 0, 0));
		frameEditDeck.setBounds(100, 100, 489, 704);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frameEditDeck.setLocation(dim.width/2-frameEditDeck.getSize().width/2, dim.height/2-frameEditDeck.getSize().height/2);

		frameEditDeck.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameEditDeck.getContentPane().setLayout(null);
		
		JButton buttonReturn = new JButton("Return to Home Screen");
		buttonReturn.setBackground(new Color(49, 16, 216));
		buttonReturn.setForeground(new Color(255, 255, 255));
		buttonReturn.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mode=="Online")						//escolher se o edit deck vai ser tipo uma janela pop-up, ou se vai ser continuaçao, se for popup nao precisa disto p nada
					HomeScreenOnline.main(null);
				else if(mode=="Offline")
					HomeScreenOffline.main(null);
		
				frameEditDeck.dispose();

			}
		});
		buttonReturn.setBounds(0, 623, 483, 46);
		frameEditDeck.getContentPane().add(buttonReturn);
		
		JButton buttonSaveChanges = new JButton("Save Changes");
		buttonSaveChanges.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonSaveChanges.setBackground(new Color(250, 232, 0));
		buttonSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Changes Saved!", "Saving...", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		buttonSaveChanges.setBounds(158, 577, 151, 33);
		frameEditDeck.getContentPane().add(buttonSaveChanges);
		
		JLabel showWhosDeck = new JLabel("<>'s Deck:");
		showWhosDeck.setVerticalAlignment(SwingConstants.TOP);
		showWhosDeck.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		showWhosDeck.setForeground(new Color(255, 255, 255));
		showWhosDeck.setBounds(13, 11, 131, 18);
		frameEditDeck.getContentPane().add(showWhosDeck);
		
		JButton buttonOrder = new JButton("order by");
		buttonOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		buttonOrder.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		buttonOrder.setBackground(new Color(8, 200, 238));
		buttonOrder.setBounds(12, 583, 92, 25);
		frameEditDeck.getContentPane().add(buttonOrder);
	}
}
