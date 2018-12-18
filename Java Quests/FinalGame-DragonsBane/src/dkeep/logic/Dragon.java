package dkeep.logic;

import java.util.Random;

public class Dragon extends Character{
	
	private static final long serialVersionUID = 4536181928816942862L;
	private boolean alive;
	private int turnsToAwake;
	
	public Dragon() {
		alive=true;
		turnsToAwake=0;
	}

	public static Dragon placeDragon(Game jogo){
		Random generate = new Random();
		Dragon dragao = new Dragon();
		
		while(true){
			dragao.setCoordinateX(generate.nextInt(10));
			dragao.setCoordinateY(generate.nextInt(10));
			if(jogo.getMaze(dragao.getCoordinateX(), dragao.getCoordinateY())==0 && Maze.nextTo(dragao.getCoordinateX(),dragao.getCoordinateY(), jogo.heroX(), jogo.heroY())==0){
				jogo.setMaze(dragao.getCoordinateX(), dragao.getCoordinateY(), 5);
				return dragao;
			}
		}
	}
	
	public static void moveDragon(int i, Game jogo){
		
		if(jogo.dragonAwake(i)==false){
			jogo.tryWakeDragon(i);
			
			if(jogo.dragonAwake(i)==true)
				jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 5);

			return;
		}
		
		boolean moved=false;

		while(moved==false){
			Random generate = new Random();
			int move=generate.nextInt(100);

			move=convertToOption(move);
		
			switch(move){
				
				case 0:
					teleportDragon(i, jogo);
					moved=true;
					break;
					
				case 1:
					if(jogo.getMaze(jogo.dragonX(i)-1, jogo.dragonY(i))==0 || jogo.getMaze(jogo.dragonX(i)-1, jogo.dragonY(i))==7){
						jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 0);
						jogo.dragonX(i, jogo.dragonX(i)-1);
						jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 5);
						moved=true;
					}
					break;

				case 2:
					if(jogo.getMaze(jogo.dragonX(i), jogo.dragonY(i)+1)==0 || jogo.getMaze(jogo.dragonX(i), jogo.dragonY(i)+1)==7){
						jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 0);
						jogo.dragonY(i, jogo.dragonY(i)+1);
						jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 5);
						moved=true;
					}
					break;

				case 3:	
					
					if(jogo.getMaze(jogo.dragonX(i)+1, jogo.dragonY(i))==0 || jogo.getMaze(jogo.dragonX(i)+1, jogo.dragonY(i))==7){
						jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 0);
						jogo.dragonX(i, jogo.dragonX(i)+1);
						jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 5);
						moved=true;
					}
					break;

				case 4:	
					
					if(jogo.getMaze(jogo.dragonX(i), jogo.dragonY(i)-1)==0 || jogo.getMaze(jogo.dragonX(i), jogo.dragonY(i)-1)==7){
						jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 0);
						jogo.dragonY(i, jogo.dragonY(i)-1);
						jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 5);
						moved=true;
					}
					break;
	
				case 5:
					jogo.setSleepDragon(i, generate.nextInt(6)+5);		//fica acordado entre 5 a 10 moves
					jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 6);
					moved=true;
					break;
			}
		}
	}

	private static int convertToOption(int move) {		//converte a opçao de salto como movimento normal em 20% das vezes, e os outros 5 movimentos equiprováveis (16%)	
	
		if(move<20)
			move=0;
		else if(move>=20 && move<36)
			move=1;
		else if(move>=36 && move<52)
			move=2;
		else if(move>=52 && move<68)
			move=3;
		else if(move>=68 && move<84)
			move=4;
		else if(move>=84)
			move=5;

		return move;
	}

	public static void teleportDragon(int i, Game jogo){
		
		Random generate = new Random();
		int tempX, tempY;
		
		while(true){
			tempX=generate.nextInt(10);
			tempY=generate.nextInt(10);
			
			if((jogo.getMaze(tempX, tempY)==0 || jogo.getMaze(tempX, tempY)==7) && (Maze.nextTo(tempX, tempY, jogo.heroX(), jogo.heroY())==0)){
				jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 0);
				jogo.dragonX(i, tempX);
				jogo.dragonY(i, tempY);
				jogo.setMaze(jogo.dragonX(i), jogo.dragonY(i), 5);
				break;
			}
		}
		
	}

	public boolean dragonAlive(){
		return this.alive;
	}
	
	public void dragonAlive(boolean alive){
		this.alive=alive;
	}
	
	public boolean dragonAwake(){
		return (turnsToAwake==0);
	}
	
	public void setSleepDragon(int n){
		this.turnsToAwake=n;
	}
	
	public void tryWakeDragon(){
		this.turnsToAwake--;
	}
}