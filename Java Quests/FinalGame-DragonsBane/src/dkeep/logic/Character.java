package dkeep.logic;

import java.io.Serializable;

public class Character implements Serializable{

	private static final long serialVersionUID = -7704661455322033180L;
	protected int coordinateX;
	protected int coordinateY;
	
	public void setCoordinateX(int coordinateX){
		this.coordinateX = coordinateX;
	}

	public void setCoordinateY(int coordinateY){
		this.coordinateY = coordinateY;
	}

	public int getCoordinateX(){
		return coordinateX;
	}
	
	public int getCoordinateY(){
		return coordinateY;
	}
	
}
