package game_logic;

import java.util.ArrayList;

public class Character{
	
	//---------Attributes--------
	private String name;
	private char rarity;
	private int level, exp, moveDistance, numberOfRevives;
	private boolean canMoveOverCharacters, isAlive;
	ArrayList<Ability> moveset = new ArrayList<Ability>();
	//---------------------------
	
	//--------Constructor--------
	public Character(String name, char rarity, int moveDistance, int numberOfRevives, ArrayList<Ability> moveset, boolean canMoveOverCharacters) {
		this.moveset = moveset;
		this.name = name;
		this.rarity = rarity;
		this.moveDistance = moveDistance;
		this.numberOfRevives = numberOfRevives;
		this.canMoveOverCharacters = canMoveOverCharacters;
	}
	//---------------------------

	//----List of GET Methods----
	public String getName() {
		return this.name;
	}
	public int getLevel() {
		return this.level;
	}
	public char getRarity() {
		return this.rarity;
	}
	public int getExp() {
		return this.exp;
	}
	public boolean getMoveOver() {
		return this.canMoveOverCharacters;
	}
	public boolean getIsAlive() {
		return this.isAlive;
	}
	public int getMoveDistance() {
		return this.moveDistance;
	}
	public int getNumberOfRevives() {
		return this.numberOfRevives;
	}
	public ArrayList<Ability> getMoveset(){
		return this.moveset;
	}
	//---------------------------
	
	//----List of SET Methods----
	public void setName(String name) {
		this.name = name;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setRarity(char rarity) {
		this.rarity = rarity;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void setMoveOver(boolean canMoveOverCharacters) {
		this.canMoveOverCharacters = canMoveOverCharacters;
	}
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public void setMoveDistance(int moveDistance) {
		this.moveDistance = moveDistance;
	}
	public void setNumberOfRevives(int numberOfRevives) {
		this.numberOfRevives = numberOfRevives;
	}
	public void setMoveset(ArrayList<Ability> moveset) {
		this.moveset = moveset;
	}
	//---------------------------
	
}
