package maze.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutFrame {

	private JFrame aboutFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutFrame window = new AboutFrame();
					window.aboutFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		aboutFrame = new JFrame();
		aboutFrame.setTitle("About this game");
		aboutFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(AboutFrame.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-information@2x.png")));
		aboutFrame.setBounds(100, 100, 460, 300);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		aboutFrame.setLocation(dim.width/2-aboutFrame.getSize().width/2, dim.height/2-aboutFrame.getSize().height/2);

		aboutFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		aboutFrame.getContentPane().setLayout(null);
		
		JLabel symbol = new JLabel((String) null);
		symbol.setIcon(new ImageIcon(AboutFrame.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-information.png")));
		symbol.setBounds(23, 24, 48, 48);
		aboutFrame.getContentPane().add(symbol);
		
		JLabel version = new JLabel("Version 2.8.1");
		version.setBounds(93, 63, 96, 32);
		aboutFrame.getContentPane().add(version);
		
		JLabel title = new JLabel("Dragon's Bane");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(new Color(0, 0, 205));
		title.setFont(new Font("Verdana", Font.BOLD, 24));
		title.setBounds(83, 13, 317, 48);
		aboutFrame.getContentPane().add(title);
		
		JTextPane txtpnThisGameWas = new JTextPane();
		txtpnThisGameWas.setEditable(false);
		txtpnThisGameWas.setBackground(SystemColor.control);
		txtpnThisGameWas.setText("This game was made in order to get the aproval of the Side-Quest IV and V of Java, by the party 5, formed by Beatriz Garrido & Telmo Soares and Miguel Neves & Rafael Moura at the subject of LPRO, in the course of Master at Electrical Engeneering at FEUP.\r\nFEUP \u00A9 2018. All rights reserved.");
		txtpnThisGameWas.setBounds(33, 105, 377, 102);
		aboutFrame.getContentPane().add(txtpnThisGameWas);
		
		JButton buttonOk = new JButton("OK");
		buttonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aboutFrame.dispose();
			}
		});
		buttonOk.setBounds(313, 211, 97, 25);
		aboutFrame.getContentPane().add(buttonOk);
	}
}
