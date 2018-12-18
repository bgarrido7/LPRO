package game_logic;

import java.util.ArrayList;

public class Deck {
	
	//---------Attributes--------
	private int numOwnedCharacters, maxOwnedCharacters;
	private boolean playDeckFull;
	ArrayList<Character> playDeck = new ArrayList<Character>();
	ArrayList<Character> ownedCharacters = new ArrayList<Character>();
	//---------------------------

	//--------Constructor--------
	public Deck(int maxOwnedCharacters, ArrayList<Character> ownedCharacters){
		this.maxOwnedCharacters = maxOwnedCharacters;
		this.ownedCharacters = ownedCharacters;
	}
	//---------------------------

	//----List of GET Methods----
	public int getNumOwnedCharacters() {
		return this.numOwnedCharacters;
	}
	public int getMaxOwnedCharacters() {
		return this.maxOwnedCharacters;
	}
	public boolean getPlayDeckFull() {
		return this.playDeckFull;
	}
	public ArrayList<Character> getPlayDeck(){
		return this.playDeck;
	}
	public ArrayList<Character> getOwnedCharacters(){
		return this.ownedCharacters;
	}
	//---------------------------

	//----List of SET Methods----
	public void setNumOwnedCharacters(int numOwnedCharacters) {
		this.numOwnedCharacters  = numOwnedCharacters;
	}
	public void setMaxOwnedCharacters(int maxOwnedCharacters) {
		this.maxOwnedCharacters  = maxOwnedCharacters;
	}
	public void setOwnedCharacters(boolean playDeckFull) {
		this.playDeckFull  = playDeckFull;
	}
	public void setPlayDeckFull(ArrayList<Character> playDeck) {
		this.playDeck  = playDeck;
	}
	public void setPlayDeck(ArrayList<Character> ownedCharacters) {
		this.ownedCharacters  = ownedCharacters;
	}
	//---------------------------

}
