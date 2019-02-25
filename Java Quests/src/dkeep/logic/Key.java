package dkeep.logic;

public class Key extends Character{
	
	private static final long serialVersionUID = -814159746318434559L;
	private boolean catched;
	
	public Key() {
		catched=false;
	}
	
	public void keyCatched(boolean catched){
		this.catched = catched;
	}
	
	public boolean keyCatched(){
		return this.catched;
	}
}