package maze.gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainGame extends JFrame {

	private Figures contentPane;
	private ImageIcon img = new ImageIcon("logo.png");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGame frame = new MainGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public MainGame() throws IOException{
	//	playMusic();
		setTitle("Dragon's Bane");
		setIconImage(img.getImage());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 5, 1010, 1030);
		contentPane = new Figures();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setContentPane(contentPane);

	}

}
