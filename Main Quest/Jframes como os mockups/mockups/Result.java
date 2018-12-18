package mockups;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Result {

	private JFrame frameResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String str) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result window = new Result(str);
					window.frameResult.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Result(String status) {
		initialize(status); //"win" or "loose"
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String win) {
		frameResult = new JFrame();
		frameResult.getContentPane().setBackground(Color.BLACK);
		frameResult.setBackground(Color.BLACK);
		frameResult.setResizable(false);
		frameResult.setBounds(100, 100, 489, 704);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frameResult.setLocation(dim.width/2-frameResult.getSize().width/2, dim.height/2-frameResult.getSize().height/2);

		frameResult.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameResult.getContentPane().setLayout(null);
		
		JButton buttonNext = new JButton("Next");
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameResult.dispose();
			}
		});
		buttonNext.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		buttonNext.setBackground(new Color(250, 232, 0));
		buttonNext.setBounds(166, 610, 147, 46);
		frameResult.getContentPane().add(buttonNext);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(43, 402, 402, 148);
		frameResult.getContentPane().add(panel);
		panel.setLayout(null);
		
		if(win.equals("win")) {
			JLabel showWin = new JLabel("WIN");
			showWin.setForeground(new Color(250, 232, 0));
			showWin.setHorizontalAlignment(SwingConstants.CENTER);
			showWin.setVerticalAlignment(SwingConstants.TOP);
			showWin.setFont(new Font("Segoe UI", Font.PLAIN, 31));
			showWin.setBounds(166, 35, 110, 54);
			frameResult.getContentPane().add(showWin);
		
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
			frameResult.getContentPane().add(showLose);
		}
		

	}
}
