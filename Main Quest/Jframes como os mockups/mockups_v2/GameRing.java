package mockups;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GameRing extends JPanel{

/**
	 * 
	 */
	private static final long serialVersionUID = -6514348176958367928L;
	//	private ArrayList<JPanel> cells;//=new ArrayList<JPanel>();
	private JPanel cells;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public GameRing(String mode, JFrame j) {
		setBackground(Color.BLACK);
		setBounds(0, 0, 489, 704);
		setVisible(true);
		setLayout(null);
		
//		cells=new ArrayList<JPanel>();

		initialize(mode, j);// cells);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String mode, JFrame jf) {//, ArrayList<JPanel> cells) {
		
		JButton buttonBattle = new JButton("Battle");
		buttonBattle.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonBattle.setBackground(new Color(89, 173, 255));
		buttonBattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonBattle.setBounds(24, 604, 86, 39);
		add(buttonBattle);
		
		JButton buttonEndTurn = new JButton("End Turn");
		buttonEndTurn.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonEndTurn.setBackground(new Color(89, 173, 255));
		buttonEndTurn.setBounds(343, 604, 111, 39);
		add(buttonEndTurn);
		
		JButton buttonForfeit = new JButton("Forfeit");
		buttonForfeit.setForeground(new Color(255, 255, 255));
		buttonForfeit.setBackground(new Color(139, 0, 0));
		buttonForfeit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		buttonForfeit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeAll();
				jf.setTitle("Home Screen");
				JPanel home = new Result("lose", mode, jf);
				add(home);
				repaint();
			}
		});
		buttonForfeit.setBounds(183, 607, 97, 33);
		add(buttonForfeit);
		
		cells = new JPanel();		
		cells.setLayout(new GridLayout(1, 0, 7,7));
		cells.setBounds(12, 135, 459, 363);
		add(cells);
	}

}
