package game;

import java.util.ArrayList;

public class Pawn extends Figure{
	
	public Pawn(String i,String p,int c, int steps)
	{
		setSteps(steps);
		setId(i);
		setPath(p);
		setColor(c);
		//c=0->red
		//c=1->blue
		
	}
	
	public ArrayList<Cell> move(Cell state[][],int x,int y, int steps){
		
		possiblemoves.clear();
		
		if(getcolor()==0) //red figure
		{
			if(x==6) {
				if(steps==2) {
					possiblemoves.add(state[x-1][0]);
					possiblemoves.add(state[x-1][6]);
					possiblemoves.add(state[x-2][0]);
					possiblemoves.add(state[x-2][6]);
				}
				else if(steps==3) {
					possiblemoves.add(state[x-1][0]);
					possiblemoves.add(state[x-1][6]);
					possiblemoves.add(state[x-2][0]);
					possiblemoves.add(state[x-2][6]);
					possiblemoves.add(state[x-3][0]);
					possiblemoves.add(state[x-3][6]);
				}
			}
			
				//	if(state[4][y].getpiece()==null)
				
		}
		
		else //blue figure
		{
			if(x==0) {
			
				if(steps==2) {
					possiblemoves.add(state[x+1][0]);
					possiblemoves.add(state[x+1][6]);
					possiblemoves.add(state[x+2][0]);
					possiblemoves.add(state[x+2][6]);
				}
				else if(steps==3) {
					possiblemoves.add(state[x+1][0]);
					possiblemoves.add(state[x+1][6]);
					possiblemoves.add(state[x+2][0]);
					possiblemoves.add(state[x+2][6]);
					possiblemoves.add(state[x+3][0]);
					possiblemoves.add(state[x+3][6]);
				}
			}
			
				//	if(state[4][y].getpiece()==null)
		}
		return possiblemoves;
	}
}
