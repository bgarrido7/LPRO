package game_logic;

import java.util.ArrayList;

public class Ability{
	
	//---------Attributes--------
	private String name, type, description;
	Effect effect;
	private int damage, probability;
	ArrayList<Ability> moveset;
	//---------------------------
	
	//--------Constructor--------
	public Ability(String name, String type, String description, int damage, int probability, Effect effect){
		this.name = name;
		this.type = type;
		this.description = description;
		this.damage = damage;
		this.probability = probability;
		this.effect = effect;
	}
	public Ability(ArrayList<Ability> moveset) {
		this.moveset = moveset;
	}
	//---------------------------
	
	//----List of GET Methods----
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	public String getDescription() {
		return this.description;
	}
	public int getDamage() {
		return this.damage;
	}
	public int getProbability() {
		return this.probability;
	}
	public Effect getEffect() {
		return this.effect;
	}
	public ArrayList<Ability> getMoveset(){
		return this.moveset;
	}
	//---------------------------
	
	//----List of SET Methods----
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public void setEffect(Effect effect) {
		this.effect = effect;
	}
	public void setProbability(int probability) {
		this.probability = probability;
	}
	public void setMoveset(ArrayList<Ability> moveset) {
		this.moveset = moveset;
	}
	//---------------------------
	
	public boolean hasRevivesLeft(Character character) {
		return true;
	}
}
