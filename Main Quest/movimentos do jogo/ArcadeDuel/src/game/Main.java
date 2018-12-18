package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

import javax.swing.UnsupportedLookAndFeelException;

public class Main extends JFrame {
	
	public static void main(String[] args){
	new	Main();
	}
	
	//Constructor
	private Main(){	
		 EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
	                }

	                JFrame frame = new JFrame("Arcade Duel");
	                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                frame.setLayout(new BorderLayout());
	                frame.add(new GameRing());
	                frame.pack();
	                frame.setLocationRelativeTo(null);
	                frame.setVisible(true);
	            }
	        });
	//	content=getContentPane();
	//	setSize(Width,Height);
		setTitle("Arcade Duel");
		
	//	board.setMinimumSize(new Dimension(800,700));
	}
}