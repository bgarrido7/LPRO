package mockups;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Result extends JPanel{

	/**
	 * Launch the application.
	 */


	/**
	 * 
	 */
	private static final long serialVersionUID = -7704744536722194359L;

	/**
	 * Create the application.
	 */
	public Result(String status, String mode, JFrame j) {
		setBackground(Color.BLACK);
		setBounds(0, 0, 489, 704);
		setVisible(true);
		setLayout(null);
		initialize(status, mode, j); //"win" or "loose"
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String win, String mode,JFrame jf) {
		
		JButton buttonNext = new JButton("Next");
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(mode=="Online") {
					removeAll();
					jf.setTitle("Home Screen");
					JPanel home = new HomeScreenOnline(jf);
					add(home);
					repaint();
				}
				else if(mode=="Offline") {
					removeAll();
					jf.setTitle("Home Screen");
					JPanel home = new HomeScreenOffline(jf);
					add(home);
					repaint();
				}
				
			}
		});
		buttonNext.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		buttonNext.setBackground(new Color(250, 232, 0));
		buttonNext.setBounds(166, 610, 147, 46);
		add(buttonNext);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(43, 402, 402, 148);
		add(panel);
		panel.setLayout(null);
		
		if(win.equals("win")) {
			JLabel showWin = new JLabel("WIN");
			showWin.setForeground(new Color(250, 232, 0));
			showWin.setHorizontalAlignment(SwingConstants.CENTER);
			showWin.setVerticalAlignment(SwingConstants.TOP);
			showWin.setFont(new Font("Segoe UI", Font.PLAIN, 31));
			showWin.setBounds(166, 35, 110, 54);
			add(showWin);
		
			JLabel showReward = new JLabel("Reward");
			showReward.setHorizontalAlignment(SwingConstants.CENTER);
			showReward.setFont(new Font("Segoe UI", Font.PLAIN, 19));
			showReward.setForeground(new Color(250, 232, 0));
			showReward.setBounds(244, 0, 123, 46);
			panel.add(showReward);
		}

		else {
			JLabel showLose = new JLabel("LOSE");
			showLose.setForeground(new Color(250, 232, 0));
			showLose.setHorizontalAlignment(SwingConstants.CENTER);
			showLose.setVerticalAlignment(SwingConstants.TOP);
			showLose.setFont(new Font("Segoe UI", Font.PLAIN, 31));
			showLose.setBounds(166, 35, 110, 54);
			add(showLose);
		}
		

	}
}
