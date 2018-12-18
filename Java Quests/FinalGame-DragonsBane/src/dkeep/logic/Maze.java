package dkeep.logic;

import java.io.Serializable;

public class Maze implements Serializable{

	private static final long serialVersionUID = 8476869739355458515L;
	private int [][] maze;
	
	public Maze() {

		maze = new int[][] {{1,1,1,1,1,1,1,1,1,1},
							{1,0,0,0,0,0,0,0,0,1},
							{1,0,1,1,1,0,1,1,1,1},
							{1,0,1,1,1,0,1,1,1,1},
							{1,0,0,0,0,0,0,0,0,1},
							{1,0,1,1,1,0,1,1,0,1},
							{1,0,0,0,0,0,0,0,0,1},
							{1,0,1,1,1,1,1,1,0,1},
							{1,0,0,0,0,0,0,0,0,1},
							{1,1,1,1,1,2,1,1,1,1}};

	}
	
	public static int nextTo(int px, int py, int dx, int dy) {		//retorna true se as coordenadas (px,py) e (dx,dy) são adjacentes, senao retorna false
		
		if(px==dx && (py==dy-1 || py==dy+1)) 
			return 1;
		
		else if(py==dy && (px==dx-1 || px==dx+1))
			return 1;
		
		else if(py==dy && px==dx)
			return 2;
		
		else 
			return 0;
	}
	
	public static void printMaze(Game jogo) {
		/* imprime a matriz passando os numeros para os caracteres correspondentes
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
		
		int i, j;
		for(j=0;j<10;j++){
			
			for(i=0;i<10;i++){
				
				if(jogo.getMaze(i, j)==0)
					System.out.print(" ");
				
				else if(jogo.getMaze(i, j)==1)
					System.out.print("X");
				
				else if(jogo.getMaze(i, j)==2) 
					System.out.print("E");
				
				else if(jogo.getMaze(i, j)==3){
					if(jogo.heroArmed()==false)
						System.out.print("H");

					else if(jogo.heroArmed()==true)
						System.out.print("A");
				}
				
				else if(jogo.getMaze(i, j)==4)
					System.out.print("K");
				
				else if(jogo.getMaze(i, j)==5)
					System.out.print("D");
				
				else if(jogo.getMaze(i, j)==6)
					System.out.print("d");
				
				else if(jogo.getMaze(i, j)==7)
					System.out.print("S");

				else if(jogo.getMaze(i, j)==8)
					System.out.print("F");
				
				else if(jogo.getMaze(i, j)==9)
					System.out.print("f");
				
				
				System.out.print(" ");
			}
			System.out.println();
		}
		return;
	}
	
	public void setMaze(int x, int y, int num){
		this.maze[x][y] = num;
	}
	
	public int getMaze(int x, int y){
		return this.maze[x][y];
	}
	
	public int[][] getAllMaze(){
		return this.maze;
	}
		
}