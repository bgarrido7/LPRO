package game;

import javax.imageio.ImageIO;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class GameRing extends JFrame implements MouseListener{
	private BufferedImage image;
	private static final int Height=700;
	private static final int Width=700;
	private static Pawn f1B,f2B,f3B,f4B,f5B,f1R,f2R,f3R,f5R,f4R,f6B,f6R;
	private static RingBoard goalRed,goalBlue,normalPoint,entryPointBlue,entryPointRed,nothing;
	private Cell c,previous;
	private int chance=0;
	private Cell boardState[][];
	private ArrayList<Cell> destinationlist = new ArrayList<Cell>();
	private JPanel board=new JPanel(new GridLayout(7,7));
	private boolean end;
	public static GameRing Mainboard;
	private static Ring r;
	private Container content;

	static String move="red";

	public static void main(String[] args){

		f1B=new Pawn("B1","charizard.jpg",1,2);
		f2B=new Pawn("B2","charizard.jpg",1,2);
		f3B=new Pawn("B3","charizard.jpg",1,2);
		f4B=new Pawn("B4","charizard.jpg",1,2);
		f5B=new Pawn("B5","charizard.jpg",1,2);
		f6B=new Pawn("B6","charizard.jpg",1,2);

		f1R=new Pawn("R1","eevee.jpg",0,3);
		f2R=new Pawn("R2","eevee.jpg",0,3);
		f3R=new Pawn("R3","eevee.jpg",0,3);
		f4R=new Pawn("R4","eevee.jpg",0,3);
		f5R=new Pawn("R5","eevee.jpg",0,3);
		f6R=new Pawn("R6","eevee.jpg",0,3);
		goalRed=new RingBoard("g","goalRed.png");
		goalBlue=new RingBoard("G","goalBlue.png");
		entryPointBlue=new RingBoard("E","blueEntry.png");
		entryPointRed=new RingBoard("e","redEntry.png");
		normalPoint=new RingBoard("p","point.png");
		nothing=new RingBoard(" ","nothing.png");

	//Setting up the board
	Mainboard = new GameRing();
	Mainboard.setVisible(true);	
	Mainboard.setResizable(false);
	}
	
	//Constructor
	GameRing()
    {	
		
		board=new JPanel(new GridLayout(7,7)){
			private static final long serialVersionUID = 1L;
			     
			@Override
		    public void paintComponent(Graphics g) {
				  try {
			          image = ImageIO.read(this.getClass().getResource("ring.png"));
			       } catch (IOException ex) {
			            System.out.println("not found");
			       }
			   
				g.drawImage(image, 0, 0, null);
			}         
	    };
		board.setMinimumSize(new Dimension(800,700));
		
		Cell cell;
		Figure P;
		content=getContentPane();
		setSize(Width,Height);
		setTitle("Arcade Duel");
		
		board.setMinimumSize(new Dimension(800,700));
		content.add(board);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		//Defining all the Cells
		boardState=new Cell[7][7];
		for(int i=0;i<7;i++)
			for(int j=0;j<7;j++)
			{	
				P=null;
				if(i==0&&j==0)
					P=f1B;
				else if(i==0&&j==1)
					P=f2B;
				else if(i==0&&j==2)
					P=f3B;
				else if(i==0&&j==3)
					P=f4B;
				else if(i==0&&j==4)
					P=f5B;
				else if (i==6&&j==0)
					P=f1R;
				else if(i==6&&j==1)
					P=f2R;
				else if (i==6&&j==2)
					P=f3R;
				else if(i==6&&j==3)
					P=f4R;
				else if (i==6&&j==4)
					P=f5R;
				else if (i==6&&j==5)
					P=f6R;
				else if (i==0&&j==5)
					P=f6B;
				else if((j==2 ||j==4)&& (i==2||i==4))
					P=nothing;
				else if((j==2 ||j==3 ||j==4)&& i==3)
					P=nothing;
				
				cell=new Cell(i,j,P);
				cell.addMouseListener(this);
				board.add(cell);
				boardState[i][j]=cell;
			}

	  
    }
	public void changechance()
	{
		
		if(destinationlist.isEmpty()==false)
			cleandestinations(destinationlist);
		if(previous!=null)
			previous.deselect();
		previous=null;
		chance^=1;
		if(!end )
		{
		
			if(GameRing.move=="red")
				GameRing.move="blue";
			else
				GameRing.move="red";
		
		}
	}

	private void cleandestinations(ArrayList<Cell> destlist)      //Function to clear the last move's destinations
    {
    	ListIterator<Cell> it = destlist.listIterator();
    	while(it.hasNext())
    		it.next().removepossibledestination();
    }
    
    //A function that indicates the possible moves by highlighting the Cells
    private void highlightdestinations(ArrayList<Cell> destlist)
    {
    	ListIterator<Cell> it = destlist.listIterator();
    	while(it.hasNext())
    		it.next().setpossibledestination();
    }
    //These are the abstract function of the parent class. Only relevant method here is the On-Click Fuction
    //which is called when the user clicks on a particular cell
	@Override
	public void mouseClicked(MouseEvent arg0){
		// TODO Auto-generated method stub
		
		c=(Cell)arg0.getSource();
		System.out.println(c.x +","+ c.y);

		if (previous==null)
		{
			if(c.getpiece()!=null)
			{
				if(c.getpiece().getcolor()!=chance)
					return;
				c.select();
				previous=c;
				destinationlist.clear();
				destinationlist=c.getpiece().move(boardState, c.x, c.y,c.getpiece().getSteps());
				highlightdestinations(destinationlist);
			}
		}
		else
		{
			if(c.x==previous.x && c.y==previous.y)
			{
				c.deselect();
				cleandestinations(destinationlist);
				destinationlist.clear();
				previous=null;
			}
			else if(c.getpiece()==null||previous.getpiece().getcolor()!=c.getpiece().getcolor())
			{
				if(c.ispossibledestination())
				{
					if(c.getpiece()!=null)
						c.removePiece();
					c.setPiece(previous.getpiece());
					if (previous.ischeck())
						previous.removecheck();
					previous.removePiece();
					changechance();
					
				}
				if(previous!=null)
				{
					previous.deselect();
					previous=null;
				}
				cleandestinations(destinationlist);
				destinationlist.clear();
			}
			else if(previous.getpiece().getcolor()==c.getpiece().getcolor())
			{
				previous.deselect();
				cleandestinations(destinationlist);
				destinationlist.clear();
				c.select();
				previous=c;
				destinationlist=c.getpiece().move(boardState, c.x, c.y,c.getpiece().getSteps());
				highlightdestinations(destinationlist);
			
			}
		}
	
	}
    
    //Other Irrelevant abstract function. Only the Click Event is captured.
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub		
	}

	
 
}
