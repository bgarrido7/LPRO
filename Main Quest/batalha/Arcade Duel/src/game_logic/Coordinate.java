package game_logic;

import java.util.ArrayList;

public class Coordinate {
	
	//---------Attributes--------
	private int width, height;
	private boolean isGoal, hasFriendlyCharacter, hasEnemyCharacter;
	private Coordinate playerOneGoal, playerTwoGoal;
	ArrayList<Coordinate> coordinateConnections = new ArrayList<Coordinate>();
	//---------------------------
	
	//--------Constructor--------
	public Coordinate(int width, int height, boolean isGoal){
		this.width = width;
		this.height = height;
		this.isGoal = isGoal;
	}
	//---------------------------
	
	//----List of GET Methods----
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public boolean getIsGoal() {
		return this.isGoal;
	}
	public boolean getHasFriendlyCharacter() {
		return this.hasFriendlyCharacter;
	}
	public boolean getHasEnemyCharacter() {
		return this.hasEnemyCharacter;
	}
	public Coordinate getPlayerOneGoal() {
		return this.playerOneGoal;
	}
	public Coordinate getPlayerTwoGoal() {
		return this.playerTwoGoal;
	}
	public ArrayList<Coordinate> getCoordinateConnections() {
		return this.coordinateConnections;
	}
	//---------------------------
	
	//----List of SET Methods----
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setIsGoal(boolean isGoal) {
		this.isGoal = isGoal;
	}
	public void setHasFriendlyCharacter(boolean hasFriendlyCharacter) {
		this.hasFriendlyCharacter = hasFriendlyCharacter;
	}
	public void setHasEnemyCharacter(boolean hasEnemyCharacter) {
		this.hasEnemyCharacter = hasEnemyCharacter;
	}
	public void setPlayerOneGoal(Coordinate playerOneGoal) {
		this.playerOneGoal = playerOneGoal;
	}
	public void setPlayerTwoGoal(Coordinate playerTwoGoal) {
		this.playerTwoGoal = playerTwoGoal;
	}
	public void setCoordinateConnections(ArrayList<Coordinate> coordinateConnections) {
		this.coordinateConnections = coordinateConnections;
	}
	//---------------------------
	
	public void connectTwoCoordinates(Coordinate startPoint, Coordinate endPoint) {
	}
	public void removeConnection(Coordinate startPoint, Coordinate endPoint) {
	}

}
