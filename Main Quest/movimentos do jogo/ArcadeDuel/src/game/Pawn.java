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
		
		for (int i=1;i<=steps;i++){
			//entry point for blue
			if(x==6 &&y!=6) {
					possiblemoves.add(state[x-i][0]);
					possiblemoves.add(state[x-i][6]);
					possiblemoves.add(state[5][i-1]);
					possiblemoves.add(state[5][6-i+1]);		
			}
			//entry point for red
			else if(x==0 &&y!=6) {
					possiblemoves.add(state[x+i][0]);
					possiblemoves.add(state[x+i][6]);
					possiblemoves.add(state[1][i-1]);
					possiblemoves.add(state[1][6-i+1]);
			}
			//move diagonally
			if(x==1 && (y==0||y==2)) 
				possiblemoves.add(state[x+1][y+1]);
			if((x==5)&&(y==6||y==4)) 
				possiblemoves.add(state[x-1][y-1]);
			if((x==5)&&(y==0)) 
				possiblemoves.add(state[x+1][y-1]);	
			if((x==1)&&(y==6)) 
				possiblemoves.add(state[x-1][y+1]);	
			
			//
			if(x==5||x==1) {
				if(x+i==7||x-i==0)
					break;
				possiblemoves.add(state[x+i][y]);
				possiblemoves.add(state[x-i][y]);
			}
			if(y==0||y==6) {
				if(y+i==7||y-i==-1)
					break;
				possiblemoves.add(state[x][i+y]);
				possiblemoves.add(state[x][y-i]);				
			}
		}
		//remove for bench points
		for(int j=0;j<7;j++) {
			possiblemoves.remove(state[0][j]);
			possiblemoves.remove(state[6][j]);
		}
	
		return possiblemoves;
	}
}
