package model;

public class Player extends Locker {

	private String nickname;
	private Integer elimintations;
	private Integer matchesPlayed;
	private double timePlayed;
	private double matchXP;
	private double friendsXP;
	private Integer accountLevel;
	private Integer passLevel;
	private static Locker locker;
	private boolean passPurchased;

	static String banner = locker.getBanner();
	static String outfit = locker.getOutfit();
	static String backBing = locker.getBackBing();
	static String harvestingTool = locker.getHarvestingTool();
	static String glider = locker.getGlider();
	static String contrail = locker.getContrail();
	static String loadingString = locker.getLoadingScreen();
	static String emotes = locker.getEmotes();

	public Player(String nickname, Integer elimintations, Integer matchesPlayed, double timePlayed, double matchXP,
			double friendsXP, Integer accountLevel, Integer passLevel, boolean passPurchased) {

		super(banner, outfit, backBing, harvestingTool, glider, contrail, loadingString, emotes);

		this.nickname = nickname;
		this.elimintations = elimintations;
		this.matchesPlayed = matchesPlayed;
		this.timePlayed = timePlayed;
		this.matchXP = matchXP;
		this.friendsXP = friendsXP;
		this.accountLevel = accountLevel;
		this.passLevel = passLevel;
		this.passPurchased = passPurchased;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getElimintations() {
		return elimintations;
	}

	public void setElimintations(Integer elimintations) {
		this.elimintations = elimintations;
	}

	public Integer getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(Integer matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public double getTimePlayed() {
		return timePlayed;
	}

	public void setTimePlayed(double timePlayed) {
		this.timePlayed = timePlayed;
	}

	public double getMatchXP() {
		return matchXP;
	}

	public void setMatchXP(double matchXP) {
		this.matchXP = matchXP;
	}

	public double getFriendsXP() {
		return friendsXP;
	}

	public void setFriendsXP(double friendsXP) {
		this.friendsXP = friendsXP;
	}

	public Integer getAccountLevel() {
		return accountLevel;
	}

	public void setAccountLevel(Integer accountLevel) {
		this.accountLevel = accountLevel;
	}

	public Integer getPassLevel() {
		return passLevel;
	}

	public void setPassLevel(Integer passLevel) {
		this.passLevel = passLevel;
	}

}
