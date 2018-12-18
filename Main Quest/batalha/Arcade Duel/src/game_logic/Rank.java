package game_logic;

public class Rank {

	//---------Attributes--------
	private String leagueName;
	private int maxLeagueRank, minLeagueRank, currentRank,  highestAchievedRank;
	//---------------------------

	//--------Constructor--------
	public Rank(String leagueName, int minLeagueRank, int maxLeagueRank) {
		this.leagueName = leagueName;
		this.minLeagueRank = minLeagueRank;
		this.maxLeagueRank = maxLeagueRank;
	}
	//---------------------------

	//----List of GET Methods----
	public String getLeagueName() {
		return this.leagueName;
	}
	public int getminLeagueRank() {
		return this.minLeagueRank;
	}
	public int getmaxLeagueRank() {
		return this.maxLeagueRank;
	}
	public int getcurrentRank() {
		return this.currentRank;
	}
	public int gethighestAchievedRank() {
		return this.highestAchievedRank;
	}
	//---------------------------

	//----List of SET Methods----
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public void setminLeagueRank(int minLeagueRank) {
		this.minLeagueRank = minLeagueRank;
	}
	public void setmaxLeagueRank(int maxLeagueRank) {
		this.maxLeagueRank = maxLeagueRank;
	}
	public void setcurrentRank(int currentRank) {
		this.currentRank = currentRank;
	}
	public void sethighestAchievedRank(int highestAchievedRank) {
		this.highestAchievedRank = highestAchievedRank;
	}
	//---------------------------

}
