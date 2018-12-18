package mockups;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

public class Main {

	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setResizable(false);
		mainFrame.setTitle("Arcade Duel");
		mainFrame.getContentPane().setBackground(Color.BLACK);
		mainFrame.setBackground(Color.BLACK);
		mainFrame.setForeground(Color.BLACK);
		mainFrame.getContentPane().setForeground(Color.BLACK);
		mainFrame.setBounds(100, 100, 489, 704);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		mainFrame.setLocation(dim.width/2-mainFrame.getSize().width/2, dim.height/2-mainFrame.getSize().height/2);

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		JPanel login = new LoginMenu(mainFrame);
		mainFrame.add(login);
	}
}
