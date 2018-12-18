package game;


public class Ring {
//	private int x,y;
	
	/* entry points -> (1,0),(1,6) / (5,0),(5,6)
	 * goal -> (1,3)[red] / (5,3)[blue]
	 * normal bench -> (0,0)-(0,4) / (6,0)-(6,4) ----->se nao tiver ninguem, pôr um '0'
	 * wait bench -> (0,5),(0,6) / (6,5), (6,6)
	 */
		private String[][] ring= {{"B1","B2","B3","B4","B5","b"," "},
								{"E","p","p","G","p","p","E",},
								{"p","p"," ","p"," ","p","p",},
								{"p","p"," "," "," ","p","p",},
								{"p","p"," ","p"," ","p","p",},
								{"e","p","p","g","p","p","e",},
								{"R1","R2","R3","R4","R5","b"," "}};
//nao existe posiçao (2,2) / (2,4) / (3,2) / (3,3) / (3,4) / (4,2) / (4,4)   
		//nem (0,6) / (6,6) ->por enquanto só temos 1 wait bench
		
	public void  printMap() {
		for (int i=0;i<7;i++) {
			for (int j=0;j<7;j++) {
				System.out.print(ring[i][j]);
				System.out.print(" ");
				if((i==0||i==5) && j==6) {
					System.out.println();
					System.out.print("-----------------");
				}			
			}System.out.println();
		}
	}
	
	public String getPosition(int x, int y){
		if((y!=6 && y!=5)&&(x==0||x==6))
			return "0";
		else if((x==0 ||x==6)&& y==6)
			return "b";
		else if((y==0 ||y==6)&& x==1)
			return "E";
		else if((y==0 ||y==6)&& x==5)
			return "e";
		else if(x==5&&y==3)
			return "g";
		else if(x==1&&y==3)
			return "G";
		else if((x==3) && (y!=2 && y!=3 && y!=4 ) ||
				(x==1||x==5) && (y!=0&&y!=3&&y!=6) ||
				(x==2||x==4) && (y!=2&&y!=4))
			return "p";
		else
			return null;
	}
	
	public String getPositionContent(int x, int y) {
		return ring[x][y];
	}
	
	public void updateFiguresPosition(String figure, int x, int y) {
		ring[x][y]=figure;
	}
	
	public char gameOver() {
		if(ring[1][3].equals("R1")|| ring[1][3].equals("R2")|| ring[1][3].equals("R3")|| ring[1][3].equals("R4")|| ring[1][3].equals("R5"))
			return 'w'; //red player wins
		
		else if(ring[5][3].equals("B1")||ring[5][3].equals("B2")||ring[5][3].equals("B3")||ring[5][3].equals("B4")||ring[5][3].equals("B5"))
			return 'l'; //red player loses, blue wins
		
	return '\0';
	}
		
	public boolean blueCanEnterRing() {//entry points do azul livres?
		    if(ring[1][0].equals("E")||ring[1][6].equals("E"))
				return true;
		    
		return false;
	}
	public boolean redCanEnterRing() { //entry points do vermelho livres?
		    if(ring[5][0].equals("e")||ring[5][6].equals("e"))
				return true;
		    
		return false;
	}
}
