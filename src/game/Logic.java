package game;

import java.util.ArrayList;

public class Logic {
	private Cell c,previous;
	private Cell boardState[][];
	private ArrayList<Cell> destinationlist = new ArrayList<Cell>();
	private Figure fig;
	
	private Main g;
	private Ring r;
	private String figureClicked;
	private int x, y;
	private int x_ini=-1,y_ini=-1; //1º clique
	private int x_final=-1,y_final=-1; //2º clique

	public void selectFigure(){
	//	y=g.getXClicked();//////////criar classe com celulas para usar este metodo
	//	y=g.getYClicked();
		if(r.getPositionContent( x,  y).equals("R1z")||r.getPositionContent( x,  y).equals("R2")||r.getPositionContent( x,  y).equals("R3")||r.getPositionContent( x,  y).equals("R4")||r.getPositionContent( x,  y).equals("R5")||
				r.getPositionContent( x,  y).equals("B1")||r.getPositionContent( x,  y).equals("B2")||r.getPositionContent( x,  y).equals("B3")||r.getPositionContent( x,  y).equals("B4")||r.getPositionContent( x,  y).equals("B5"))
			figureClicked= r.getPositionContent( x,  y);
		else 
			figureClicked=null;}

	public void Move() {
	//	x=g.getXClicked();//////////criar classe com celulas para usar este metodo
	//	y=g.getYClicked();
		System.out.println(figureClicked);
		if((figureClicked.equals(null))==true) { //nada foi selecionado previamente -> 1º clique
			x_ini=x;
			y_ini=y;
		}
		
		else if((figureClicked.equals(null))==false) { //figura já foi selecionada?
			 //se sim, obter posiçao do 2º clique
			x_final=x;
			y_final=y;
			
			//mover a figura
			r.updateFiguresPosition(r.getPosition(x_ini, y_ini), x_ini, y_ini);//limpar posiçao anterior
			r.updateFiguresPosition(figureClicked,x_final, y_final);
		}
		System.out.print(x_ini);
		System.out.print(y_ini);
		System.out.print(x_final);
		System.out.print(y_final);

	}
	
	public int newX(){
		return x_ini;
	}
	public int newY(){
		return y_ini;
	}
	
	public void moveBlueToBench(int figureNumber) { //figura azul sai do wait bench
		int i;
		for(i=0;i<5;i++)
			if(r.getPositionContent(0,i).equals("0"))
				break;
		r.updateFiguresPosition("B"+figureNumber,0 ,i ); 
	}
	
	public void moveBlueToWaitBench(int figureNumber) { //figura azul perde batalha, vai para wait bench
		r.updateFiguresPosition("B"+figureNumber,0 ,5); 
	}
	
	public void moveRedToBench(int figureNumber) { //figura vermelha sai do wait bench
		int i;
		for(i=0;i<5;i++)
			if(r.getPositionContent(0,i).equals("0"))
				break;
		r.updateFiguresPosition("R"+figureNumber,6 ,i); 
	}
	
	public void moveRedToWaitBench(int figureNumber) { //figura vermelha perde batalha, vai para wait bench
		r.updateFiguresPosition("R"+figureNumber,6 ,5); 
	}
}
