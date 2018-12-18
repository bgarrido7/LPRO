package dkeep.cli;

import dkeep.logic.*;

import java.util.Scanner;

public class DragonsBane{

	private static Game jogo;
	
    public static void main(String[] args) {
    	
    	int i;
		char input;
		Scanner sc = new Scanner(System.in);

		System.out.println("Number of dragons?");

		do{
			i=sc.nextInt();
		}while(Game.checkNumberOfDragons(i)==false);
		
		jogo = new Game(i);
	  	
		Maze.printMaze(jogo);

		while(true){

			System.out.println();
			System.out.println("Where to go?");
			System.out.println("w-Up a-Left s-Down d-Right");
			input=sc.next().charAt(0);

			Hero.moveHero(input, jogo);
			
			Game.checkLogic(jogo, input);
			if(jogo.gameOver())
				break;
			
			for(i=0;i<jogo.nDragons();i++)
				if(jogo.dragonAlive(i))
					Dragon.moveDragon(i, jogo);
			
			Game.checkLogic(jogo, input);
			if(jogo.gameOver())
				break;
			
			Maze.printMaze(jogo);
		}
		
		sc.close();
		
		Maze.printMaze(jogo);
		System.out.println();

		if(jogo.heroAlive()==false)
			System.out.println("YOU DIED! :(");
		
		else
			System.out.println("YOU WIN!!!");
    }
}
