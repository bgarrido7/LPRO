package game_logic;

public class Effect {
	
	//---------Attributes--------
	private String name, description;
	private int duration;
	private boolean hasExpired;
	//---------------------------

	//--------Constructor--------
	public Effect(String name, String description, int duration){
		this.name = name;
		this.description = description;
		this.duration = duration;
	}
	//---------------------------

	//----List of GET Methods----
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}
	public int getduration() {
		return this.duration;
	}
	public boolean getEffectExpired() {
		return this.hasExpired;
	}
	//---------------------------

	//----List of SET Methods----
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setEffectExpired(boolean hasExpired) {
		this.hasExpired = hasExpired;
	}
	//---------------------------

	public void applyEffect(Character character, String name) {
	}
	public void clearEffect(Character character, String name) {
	}
	
}
