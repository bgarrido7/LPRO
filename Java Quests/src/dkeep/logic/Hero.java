package dkeep.logic;

import java.util.Random;

public class Hero extends Character{

	private static final long serialVersionUID = 828418858725880673L;
	private boolean alive;
	private boolean hasKey;
	private boolean armed;
	
	public Hero() {
		alive=true;
		armed=false;
		hasKey=false;
	}

	public static void placeHero(Game jogo, Hero hero){
		
		Random generate = new Random();

		while(true){		
			hero.setCoordinateX(generate.nextInt(10));
			hero.setCoordinateY(generate.nextInt(10));
			
			if(jogo.getMaze(hero.getCoordinateX(),hero.getCoordinateY())==0){
				jogo.setMaze(hero.getCoordinateX(), hero.getCoordinateY(), 3);
				break;
			}
		}
	}
	
	public static void moveHero(char tecla, Game jogo) {

		switch(tecla){
			case 'a':
				if(jogo.getMaze(jogo.heroX()-1, jogo.heroY())==0 || jogo.getMaze(jogo.heroX()-1, jogo.heroY())==4 || jogo.getMaze(jogo.heroX()-1, jogo.heroY())==7){
					jogo.setMaze(jogo.heroX(), jogo.heroY(), 0);
					jogo.heroX(jogo.heroX()-1);
					jogo.setMaze(jogo.heroX(), jogo.heroY(), 3);
				}
				break;

			case 's':
				if(jogo.getMaze(jogo.heroX(), jogo.heroY()+1)==0 || jogo.getMaze(jogo.heroX(), jogo.heroY()+1)==4 || jogo.getMaze(jogo.heroX(), jogo.heroY()+1)==7){
					jogo.setMaze(jogo.heroX(), jogo.heroY(), 0);
					jogo.heroY(jogo.heroY()+1);
					jogo.setMaze(jogo.heroX(), jogo.heroY(), 3);
				}
				break;

			case 'd':
				if(jogo.getMaze(jogo.heroX()+1, jogo.heroY())==0 || jogo.getMaze(jogo.heroX()+1, jogo.heroY())==4 || jogo.getMaze(jogo.heroX()+1, jogo.heroY())==7){
					jogo.setMaze(jogo.heroX(), jogo.heroY(), 0);
					jogo.heroX(jogo.heroX()+1);
					jogo.setMaze(jogo.heroX(), jogo.heroY(), 3);
				}
				break;

			case 'w':
				if(jogo.getMaze(jogo.heroX(), jogo.heroY()-1)==0 || jogo.getMaze(jogo.heroX(), jogo.heroY()-1)==4 || jogo.getMaze(jogo.heroX(), jogo.heroY()-1)==7){
					jogo.setMaze(jogo.heroX(), jogo.heroY(), 0);
					jogo.heroY(jogo.heroY()-1);
					jogo.setMaze(jogo.heroX(), jogo.heroY(), 3);
				}
				break;
		}
	}
	
	public boolean heroAlive(){
		return this.alive;
	}
	
	public void heroAlive(boolean alive){
		this.alive=alive;
	}
	
	public boolean heroHasKey(){
		return this.hasKey;
	}
	
	public void heroHasKey(boolean key){
		this.hasKey=key;
	}
	
	public boolean heroArmed(){
		return this.armed;
	}
	
	public void heroArmed(boolean armed){
		this.armed=armed;
	}
}