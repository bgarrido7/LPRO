package dkeep.logic;

import java.util.Random;

public class Sword extends Character{

	private static final long serialVersionUID = 2725195052201421079L;
	private boolean catched;
	
	public Sword(){
		catched=false;
	}
	
	public static void placeSword(Game jogo, Sword sword){
		
		Random generate = new Random();
		
		while(true){
			sword.setCoordinateX(generate.nextInt(10));
			sword.setCoordinateY(generate.nextInt(10));
			
			if(jogo.getMaze(sword.getCoordinateX(),sword.getCoordinateY())==0){
				jogo.setMaze(sword.getCoordinateX(), sword.getCoordinateY(), 7);
				break;	
			}
			else if(jogo.getMaze(sword.getCoordinateX(),sword.getCoordinateY())==5){
				jogo.setMaze(sword.getCoordinateX(), sword.getCoordinateY(), 8);
				break;
			}
		}
	}
	
	public void swordCatched(boolean catched){
		this.catched = catched;
	}
	
	public boolean swordCatched(){
		return this.catched;
	}
	
}