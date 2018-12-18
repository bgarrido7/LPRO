package mockups;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class EditDeck extends JPanel{

	/**
	 * Launch the application.
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = -7183799056656384580L;

	/**
	 * Create the application.
	 */
	public EditDeck(String mode, JFrame j) {
		setBackground(Color.BLACK);
		setBounds(0, 0, 489, 704);
		setVisible(true);
		setLayout(null);
		initialize(mode, j);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String mode, JFrame jf) {

		JButton buttonReturn = new JButton("Return to Home Screen");
		buttonReturn.setBackground(new Color(49, 16, 216));
		buttonReturn.setForeground(new Color(255, 255, 255));
		buttonReturn.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mode=="Online") {						//escolher se o edit deck vai ser tipo uma janela pop-up, ou se vai ser continuaçao, se for popup nao precisa disto p nada
					
					removeAll();
					jf.setTitle("Home Screen");
					JPanel home = new HomeScreenOnline(jf);
					add(home);
					repaint();
				}
				
				else if(mode=="Offline"){
					removeAll();
					jf.setTitle("Home Screen");
					JPanel home = new HomeScreenOffline(jf);
					add(home);
					repaint();
				}
				

			}
		});
		buttonReturn.setBounds(0, 623, 483, 46);
		add(buttonReturn);
		
		JButton buttonSaveChanges = new JButton("Save Changes");
		buttonSaveChanges.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonSaveChanges.setBackground(new Color(250, 232, 0));
		buttonSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Changes Saved!", "Saving...", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		buttonSaveChanges.setBounds(158, 577, 151, 33);
		add(buttonSaveChanges);
		
		JLabel showWhosDeck = new JLabel("<>'s Deck:");
		showWhosDeck.setVerticalAlignment(SwingConstants.TOP);
		showWhosDeck.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		showWhosDeck.setForeground(new Color(255, 255, 255));
		showWhosDeck.setBounds(13, 11, 131, 18);
		add(showWhosDeck);
		
		JButton buttonOrder = new JButton("order by");
		buttonOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		buttonOrder.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		buttonOrder.setBackground(new Color(8, 200, 238));
		buttonOrder.setBounds(12, 583, 92, 25);
		add(buttonOrder);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 82, 429, 417);
		add(panel);
		panel.setLayout(null);
	}
/*
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(wall, x+j*width, y+i*height, this);
	}
*/


}
