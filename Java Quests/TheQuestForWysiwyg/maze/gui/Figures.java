package maze.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import dkeep.logic.*;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.print.attribute.standard.Media;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javafx.embed.swing.JFXPanel;
//import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Figures extends JPanel {
	private static MediaPlayer mediaPlayer;
	private JTextField textField_1;
	private int height=70;
	private int width=70;	
	private static Game jogo;
	private Maze labirinto;
	private Hero heroi;
	private static JLabel status;
	private static JButton buttonLeft;
	private static JButton buttonUp;
	private static JButton buttonDown;
	private static JButton buttonRight;
	private JButton buttonAbout;
	int y=255;
	int x=70;

BufferedImage exit = ImageIO.read(new File("Imagens/exit.jpg"));
BufferedImage wall = ImageIO.read(new File("Imagens/wall.jpg"));
BufferedImage freeSpace = ImageIO.read(new File("Imagens/freeSpace.png"));
BufferedImage hero = ImageIO.read(new File("Imagens/hero.png"));
BufferedImage heroArmed = ImageIO.read(new File("Imagens/heroArmed.png"));
BufferedImage key = ImageIO.read(new File("Imagens/key.png"));
BufferedImage dragon = ImageIO.read(new File("Imagens/dragon.png"));
BufferedImage sleepingDragon = ImageIO.read(new File("Imagens/sleepingDragon.png"));
BufferedImage sword = ImageIO.read(new File("Imagens/sword.jpg"));
BufferedImage swordAndsleepingDragon = ImageIO.read(new File("Imagens/swordAndSleepingDragon.png"));
BufferedImage swordAndDragon = ImageIO.read(new File("Imagens/swordAndDragon.png"));
BufferedImage exitOpen = ImageIO.read(new File("Imagens/exitOpen.jpg"));


	@Override
    protected void paintComponent(Graphics g) {
       super.paintComponent(g);  
       for(int i = 0;i<10;i++) {
	    	for(int j=0;j<10;j++) {
	    		if(j==0 || j==9 ||i==0 || i==9 || 
	    				(j==2 && i!=1 && i!=5)||
	    				(j==3 && i!=1 && i!=5)||
	    				(j==5 && i!=1 && i!=5 &&i!=8)||
	    				(j==7 && i!=1 && i!=8)) 
	    			g.drawImage(wall, x+j*width, y+i*height, this);

	    		else
	    			g.drawImage(freeSpace, x+j*width, y+i*height, this);
	    	}
	    }
	    
	    g.drawImage(exit, x+9*width, y+5*height, this);
       /* 
        * 0-> espaço livre
        * 1-> parede
        * 2-> saida
        * 3-> hero
        * 4-> chave
        * 5-> dragao acordado
        * 6-> dragao a dormir
        * 7-> sword
        * 8-> sword e dragao acordado sobrepostos
        * 9-> sword e dragao a dormir sobrepostos
        */       
	  
       if(jogo != null) {
    	   if(jogo.heroGotKey())
			    g.drawImage(exitOpen, x+9*width, y+5*height, this);

	        for(int i=0;i<10;i++) {
		        for(int j=0;j<10;j++) {	
			      	if(jogo.getMaze(i, j)==3) {
				        if (jogo.heroArmed())
				      		g.drawImage(heroArmed,x+i*width, y+j*height, this);
				        else
				        	g.drawImage(hero,x+i*width, y+j*height, this);
			        }
			       	else if(jogo.getMaze(i, j)==5)
			           	g.drawImage(dragon, x+width*i, y+height*j, this);
			       	else if(jogo.getMaze(i, j)==7)
			           	g.drawImage(sword, x+width*i, y+height*j, this);
					else if(jogo.getMaze(i, j)==4)
			           	g.drawImage(key, x+width*i, y+height*j, this);
					else if(jogo.getMaze(i, j)==6)
			           	g.drawImage(sleepingDragon, x+width*i, y+height*j, this);
					else if(jogo.getMaze(i, j)==8)
			           	g.drawImage(swordAndDragon, x+width*i, y+height*j, this);
					else if(jogo.getMaze(i, j)==9)
			           	g.drawImage(swordAndsleepingDragon, x+width*i, y+height*j, this);
		        }
	        }
			
        }

    }/*
	public void playMusic(){
		@SuppressWarnings("unused")
		JFXPanel fxPanel = new JFXPanel(); // Initializes the JavaFX toolkit.

		Media hit = new Media(new File("song.mp3").toURI().toString());
		mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.setVolume(0.05);
		mediaPlayer.play();
	}
	*/
	
	public static void setStatus(Game jogo) {
		
			if(buttonUp.isEnabled()==false)
				status.setText("You can start a new game");
		
			else if (jogo.heroArmed()==false)
				status.setText("You must get the Dragon Ball in order to kill all dragons");

			else if(jogo.heroArmed() && jogo.heroGotKey()==false)
				status.setText("You must kill all dragons in order to get the key");
		
			else if(jogo.heroGotKey())
				status.setText("You can now go to the exit");
		}
	
		
	public void finishGame(Game jogo) {

		repaint();
		
		if(jogo.heroAlive()==false)
			JOptionPane.showMessageDialog(null, "YOU DIED! :(", "Game Over", JOptionPane.INFORMATION_MESSAGE);

		else
			JOptionPane.showMessageDialog(null, "YOU WIN!!!", "Game Over", JOptionPane.INFORMATION_MESSAGE);		
		
		buttonLeft.setEnabled(false);
		buttonUp.setEnabled(false);
		buttonDown.setEnabled(false);
		buttonRight.setEnabled(false);
		
		setStatus(jogo);
	}

	public void startNewGame (Game gameStarted) {
		
		jogo=gameStarted;
		buttonLeft.setEnabled(true);
		buttonUp.setEnabled(true);
		buttonDown.setEnabled(true);
		buttonRight.setEnabled(true);

		setStatus(jogo);
		Maze.printMaze(gameStarted);
		repaint();
		System.out.println("deu tudo bem");
	}	
	
	
	public void doThings(char c) {
		Hero.moveHero(c,jogo);
		Game.checkLogic(jogo,c);
		setStatus(jogo);
		if(jogo.gameOver()) {
			finishGame(jogo);
			return;
		}
		for(int i=0;i<jogo.nDragons();i++) 
			if(jogo.dragonAlive(i))
				Dragon.moveDragon(i, jogo);
		Game.checkLogic(jogo,c);
		repaint();
		Maze.printMaze(jogo);
		if(jogo.gameOver()) {
			finishGame(jogo);
			return;
		}
		
	}
	public Figures() throws IOException{
		status = new JLabel("You can start a new game");
		status.setBounds(300, 960, 400, 25);
		add(status);
		
		setLayout(null);
		setBounds(1100, 10, 2000, 940);
		
		
		JLabel lblInsertNumberOf = new JLabel("Number of Dragons?");
		lblInsertNumberOf.setBounds(112, 91, 151, 16);
		add(lblInsertNumberOf);
	
	
		JButton btnExitTheGame = new JButton("Exit the game");
		btnExitTheGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				System.exit(0);
			}
		});
		btnExitTheGame.setBounds(162, 203, 170, 41);
		add(btnExitTheGame);
		
		JButton btnSave = new JButton("Save the game");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				if(buttonUp.isEnabled()==true)
					SaveFrame.main(null, jogo);
				
				else
					JOptionPane.showMessageDialog(null, "You must start a new game first!", "Error", JOptionPane.ERROR_MESSAGE);

			}
		});
		btnSave.setBounds(560, 71,  170, 41);
		add(btnSave);
		
		JButton btnLoad = new JButton("Load a Game");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(buttonUp.isEnabled()==true) {
					
					int returnValue = JOptionPane.showConfirmDialog (null, "You are loading a new game, would you like to save this one first?", "Loading a game", JOptionPane.YES_NO_CANCEL_OPTION);
										
					if(returnValue == JOptionPane.CANCEL_OPTION)
						return;
					
					else if(returnValue == JOptionPane.YES_OPTION) {
					    
						SaveFrame.main(null, jogo);
					}
				}
				try {
					LoadFrame lf=new LoadFrame();
					lf.main(null);
					} catch (ClassNotFoundException e1) {
						  JOptionPane.showMessageDialog(null, "Load Error", "Error", JOptionPane.ERROR_MESSAGE);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
			}
		});
		btnLoad.setBounds(560, 125,   170, 41);
		add(btnLoad);
		
		textField_1 = new JTextField();
		textField_1.setBounds(240, 89, 114, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnStartTheGame = new JButton("Start the Game!");
		btnStartTheGame.setBounds(162, 156, 170, 41);
		add(btnStartTheGame);
		btnStartTheGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((Integer.parseInt(textField_1.getText())<1)||(Integer.parseInt(textField_1.getText())>35)) {
					JOptionPane.showMessageDialog(null,"Invalid number!","Error",JOptionPane.ERROR_MESSAGE);
					return;
				}
				jogo=new Game(Integer.parseInt(textField_1.getText()));
				startNewGame (jogo);
				setStatus(jogo);
				Maze.printMaze(jogo);   
				repaint();

			}
		});
		
		 buttonUp = new JButton("^");
		buttonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doThings('w');
			}
		});
		buttonUp.setBounds(858, 230+335, 50, 30);
		add(buttonUp);
		
		 buttonRight = new JButton(">");
		buttonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doThings('d');
			}
		});
		buttonRight.setBounds(913, 596, 50, 30);
		add(buttonRight);
		
		 buttonDown = new JButton("v");
		buttonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doThings('s');
			}
		});
		buttonDown.setBounds(858, 230+403, 50, 30);
		add(buttonDown);
		
		
		buttonLeft = new JButton("<");
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doThings('a');
			}
		});
		buttonLeft.setBounds(802, 230+366, 50, 30);
		add(buttonLeft);

		buttonAbout = new JButton("About");
		buttonAbout.setToolTipText("About this game");
		buttonAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AboutFrame.main(null);
			}
		});
		buttonAbout.setBounds(560, 179,  170, 41);
		add(buttonAbout);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Set the type of dragon movement");
		comboBox.addItem("Random");
		comboBox.setBounds(240, 117, 119, 22);
		add(comboBox);
		
		JLabel lblDragonsBane = new JLabel("Dragon's Bane");
		lblDragonsBane.setForeground(Color.BLUE);
		lblDragonsBane.setFont(new Font("Consolas", Font.PLAIN, 44));
		lblDragonsBane.setBounds(71, 26, 340, 52);
		add(lblDragonsBane);
		
		JLabel lblDragonsBehaviour = new JLabel("Dragons' Movement");
		lblDragonsBehaviour.setBounds(112, 120, 120, 16);
		add(lblDragonsBehaviour);
	
	}
	
}
