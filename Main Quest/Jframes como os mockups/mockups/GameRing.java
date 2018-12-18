package mockups;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class GameRing {

	private JFrame frameGameRing;
//	private ArrayList<JPanel> cells;//=new ArrayList<JPanel>();
	private JPanel cells;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String mode) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameRing window = new GameRing(mode);
					window.frameGameRing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameRing(String mode) {
//		cells=new ArrayList<JPanel>();
		initialize(mode);// cells);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String mode) {//, ArrayList<JPanel> cells) {
		frameGameRing = new JFrame();
		frameGameRing.getContentPane().setBackground(new Color(0, 0, 0));
		frameGameRing.setBackground(new Color(0, 0, 0));
		frameGameRing.setResizable(false);
		frameGameRing.setBounds(100, 100, 489, 704);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frameGameRing.setLocation(dim.width/2-frameGameRing.getSize().width/2, dim.height/2-frameGameRing.getSize().height/2);

		frameGameRing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameGameRing.getContentPane().setLayout(null);
		
		JButton buttonBattle = new JButton("Battle");
		buttonBattle.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonBattle.setBackground(new Color(89, 173, 255));
		buttonBattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonBattle.setBounds(24, 604, 86, 39);
		frameGameRing.getContentPane().add(buttonBattle);
		
		JButton buttonEndTurn = new JButton("End Turn");
		buttonEndTurn.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonEndTurn.setBackground(new Color(89, 173, 255));
		buttonEndTurn.setBounds(343, 604, 111, 39);
		frameGameRing.getContentPane().add(buttonEndTurn);
		
		JButton buttonForfeit = new JButton("Forfeit");
		buttonForfeit.setForeground(new Color(255, 255, 255));
		buttonForfeit.setBackground(new Color(139, 0, 0));
		buttonForfeit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonForfeit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(mode=="Online")
					HomeScreenOnline.main(null);
				else if(mode=="Offline")
					HomeScreenOffline.main(null);	
				
				Result.main(null, "lose");

				frameGameRing.dispose();
			}
		});
		buttonForfeit.setBounds(183, 607, 97, 33);
		frameGameRing.getContentPane().add(buttonForfeit);
		
		cells = new JPanel();		
		cells.setLayout(new GridLayout(1, 0, 7,7));
		cells.setBounds(12, 135, 459, 363);
		frameGameRing.getContentPane().add(cells);
	}

}
