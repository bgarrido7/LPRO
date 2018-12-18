package dkeep.logic;

import java.io.Serializable;
import java.util.*;

public class Game implements Serializable{

	private static final long serialVersionUID = 3335950834184628067L;
	private Maze labirinto;
	private Hero heroi;
	private Key chave;
	private Sword espada;
	
	ArrayList<Dragon> dragao;

	private boolean over;
	private int ndragons;
	private int ndragonsalive;
	
	public Game(int n){
		
		this.ndragons=n;
		this.ndragonsalive=n;
		
		over=false;
		int i;
		
		labirinto = new Maze();
		
		dragao = new ArrayList<Dragon>();

		heroi = new Hero();
		Hero.placeHero(this, heroi);
		
		for(i=0;i<ndragons;i++)
			dragao.add(Dragon.placeDragon(this));
		
		espada = new Sword();
		Sword.placeSword(this, espada);
		chave = new Key();
	}

	public static void checkLogic(Game jogo, char quit){
		
		int i;
		Random generate = new Random();

		if(jogo.swordCatched()==false)
			jogo.setMaze(jogo.swordX(), jogo.swordY(), 7);
		
		for(i=0;i<jogo.ndragons;i++)
			if(jogo.swordCatched()==false && Maze.nextTo(jogo.swordX(), jogo.swordY(), jogo.dragonX(i), jogo.dragonY(i))==2){
				
				if(jogo.dragonAwake(i)==true)
					jogo.setMaze(jogo.swordX(), jogo.swordY(), 8);
				
				else if(jogo.dragonAwake(i)==false)
					jogo.setMaze(jogo.swordX(), jogo.swordY(), 9);
			}


		jogo.setMaze(jogo.heroX(), jogo.heroY(), 3);

		if(jogo.heroX()==8 && jogo.heroY()==5 && jogo.heroGotKey()==true && quit=='d')
			jogo.setMaze(9, 5, 0);

		if(Maze.nextTo(jogo.swordX(), jogo.swordY(), jogo.heroX(), jogo.heroY())==2) {
			jogo.swordCatched(true);
			jogo.heroArmed(true);
		}
		
		if(Maze.nextTo(jogo.keyX(), jogo.keyY(), jogo.heroX(), jogo.heroY())==2) {
			jogo.keyCatched(true);
			jogo.heroGotKey(true);
		}
		
		for(i=0;i<jogo.nDragons();i++)
			if(jogo.dragonAlive(i) && (Maze.nextTo(jogo.heroX(), jogo.heroY(), jogo.dragonX(i), jogo.dragonY(i))!=0)){
			
				if(jogo.heroArmed()==false && jogo.dragonAwake(i)==true)
					jogo.heroAlive(false);

				else if(jogo.heroArmed()==true){
				
					if(generate.nextInt(100)<35 && jogo.dragonAwake(i)==true)
						Dragon.teleportDragon(i, jogo);

					else{
						
						jogo.dragonAlive(i, false);

						if(jogo.heroGotKey()==false){
							
							if(jogo.dragonsAlive()==0) {
								jogo.keyX(jogo.dragonX(i));
								jogo.keyY(jogo.dragonY(i));
								jogo.setMaze(jogo.keyX(), jogo.keyY(), 4);
							}
							
							else
								jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 0);
						}
					}
				}
			}

		jogo.over=((jogo.getMaze(9,5)==3) || (!jogo.heroAlive()));
	}

	public int[][] getAllMaze(){
		return this.labirinto.getAllMaze();
	}
	
	public int getMaze(int x, int y){
		return this.labirinto.getMaze(x, y);
	}
	
	public void setMaze(int x, int y, int num){
		this.labirinto.setMaze(x, y, num);
	}
	
	public boolean gameOver(){
		return this.over;
	}
	
	public void gameOver(boolean over){
		this.over=over;
	}
	
	public int heroX(){
		return this.heroi.getCoordinateX();	
	}
	
	public void heroX(int x){
		this.heroi.setCoordinateX(x);
	}
	
	public int heroY(){
		return this.heroi.getCoordinateY();	
	}
	
	public void heroY(int y){
		this.heroi.setCoordinateY(y);
	}
	
	public int dragonX(int i){
		return this.dragao.get(i).getCoordinateX();
	}
	
	public void dragonX(int i, int x){
		this.dragao.get(i).setCoordinateX(x);
	}
	
	public int dragonY(int i){
		return this.dragao.get(i).getCoordinateY();
	}
	
	public void dragonY(int i, int y){
		this.dragao.get(i).setCoordinateY(y);
	}
	
	public int keyX(){
		return this.chave.getCoordinateX();	
	}
	
	public void keyX(int x){
		this.chave.setCoordinateX(x);
	}
	
	public int keyY(){
		return this.chave.getCoordinateY();	
	}
	
	public void keyY(int y){
		this.chave.setCoordinateY(y);
	}
	
	public int swordX(){
		return this.espada.getCoordinateX();	
	}
	
	public void swordX(int x){
		this.espada.setCoordinateX(x);
	}
	
	public int swordY(){
		return this.espada.getCoordinateY();	
	}
	
	public void swordY(int y){
		this.espada.setCoordinateY(y);
	}
	
	public boolean dragonAlive(int i){
		return dragao.get(i).dragonAlive();
	}
	
	public void dragonAlive(int i, boolean alive){
		
		if(alive==false)
			this.ndragonsalive--;
			
		this.dragao.get(i).dragonAlive(alive);
	}
	
	public boolean dragonAwake(int i){
		return this.dragao.get(i).dragonAwake();
	}

	public void tryWakeDragon(int i){
		this.dragao.get(i).tryWakeDragon();
	}
	
	public void setSleepDragon(int i, int n){
		this.dragao.get(i).setSleepDragon(n);
	}
	
	public int nDragons(){
		return this.ndragons;
	}
	
	public void nDragons(int n){
		this.ndragons=n;
	}
	
	public int dragonsAlive(){
		return this.ndragonsalive;
	}
	
	public boolean heroAlive(){
		return this.heroi.heroAlive();
	}
	
	public void heroAlive(boolean alive){
		this.heroi.heroAlive(alive);
	}
	
	public boolean heroArmed(){
		return this.heroi.heroArmed();
	}
	
	public void heroArmed(boolean armed){
		this.heroi.heroArmed(armed);
	}
	
	public boolean heroGotKey(){
		return this.heroi.heroHasKey();
	}
	
	public void heroGotKey(boolean key){
		this.heroi.heroHasKey(key);
	}

	public boolean keyCatched(){
		return this.chave.keyCatched();	
	}
	
	public void keyCatched(boolean catched){
		this.chave.keyCatched(catched);	
	}
	
	public boolean swordCatched(){
		return this.espada.swordCatched();	
	}
	
	public void swordCatched(boolean catched){
		this.espada.swordCatched(catched);
	}
	
	public static boolean checkNumberOfDragons(int i){
		
		if(i<1){
			System.out.println("Number of dragons must be higher than zero! Please choose another number...");
			return false;
		}
		
		else if(i>36){
			System.out.println("The number of dragons is too high! Please choose another number...");
			return false;
		}

		else
			return true;	
	}
}
