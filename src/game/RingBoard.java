package game;

import java.util.ArrayList;


/**
 * This is the Pawn Class inherited from the piece
 *
 */
public class RingBoard extends Figure{
	

	public RingBoard(String i,String p)
	{
		setId(i);
		setPath(p);
		
	}
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		return possiblemoves;

	}
	@Override
	public ArrayList<Cell> move(Cell[][] pos, int x, int y, int steps) {
		// TODO Auto-generated method stub
		return null;
	}
}
