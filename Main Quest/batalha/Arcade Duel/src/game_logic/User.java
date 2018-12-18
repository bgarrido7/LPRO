package game_logic;

public class User {

	//---------Attributes--------
	private String name, username, password;
	private Deck deck;
	//---------------------------

	//--------Constructor--------
	public User(String name, String username, String password, Deck deck) {
		this.deck = deck;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	//---------------------------

	//----List of GET Methods----
	public String getName() {
		return this.name;
	}
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	//---------------------------

	//----List of SET Methods----
	public void setName(String name) {
		this.name =  name;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//---------------------------

	public void logout() {
	}
	public void quickPlay() {
	}
	public void onlinePlay() {
	}
}
