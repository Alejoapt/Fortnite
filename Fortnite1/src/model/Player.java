package model;

import java.util.LinkedList;

public class Player extends Locker {

	
	/**
	 * The player's nickname
	 */
	private String nickname;
	
	/**
	 * The number of eliminations 
	 */
	private Integer elimintations;
	
	/**
	 * The total of matches played 
	 */
	private Integer matchesPlayed;
	
	/**
	 * The total time of game played 
	 */
	private int timePlayed;
	
	/**
	 * 
	 */
	private double matchXP;
	
	/**
	 * 
	 */
	private double friendsXP;
	
	/**
	 * The level of the account 
	 */
	private Integer accountLevel;
	
	/**
	 * 
	 */
	private Integer seasonLevel;
	
	/**
	 * 
	 */
	private static Locker locker;
	
	/**
	 * True if the player has purchased the season pass
	 */
	private boolean passPurchased;
	
	/**
	 * The Queue that contains the weapons of the players
	 */

	private Queue<Weapon> weapons;


	/**
	 * This method is charge of return the Queue of weapons
	 * @return the weapons
	 */
	public Queue<Weapon> getWeapons() {
		return weapons;
	}

	/**
	 * @param weapons the weapons to set
	 */
	public void setWeapons(Queue<Weapon> weapons) {
		this.weapons = weapons;
	}

	// Statit conection with the locker of the player
	static String banner = locker.getBanner();
	static String outfit = locker.getOutfit();
	static String backBing = locker.getBackBing();
	static String harvestingTool = locker.getHarvestingTool();
	static String glider = locker.getGlider();
	static String contrail = locker.getContrail();
	static String loadingString = locker.getLoadingScreen();
	static String emotes = locker.getEmotes();

	/**
	 * The constructor of the class Player
	 * @param nickname
	 * @param elimintations
	 * @param matchesPlayed
	 * @param timePlayed
	 * @param matchXP
	 * @param friendsXP
	 * @param accountLevel
	 * @param passLevel
	 * @param passPurchased
	 */
	public Player(String nickname, Integer elimintations, Integer matchesPlayed, int timePlayed, double matchXP,
			double friendsXP, Integer accountLevel, Integer passLevel, boolean passPurchased) {

		super(banner, outfit, backBing, harvestingTool, glider, contrail, loadingString, emotes);

		this.nickname = nickname;
		this.elimintations = elimintations;
		this.matchesPlayed = matchesPlayed;
		this.timePlayed = timePlayed;
		this.matchXP = matchXP;
		this.friendsXP = friendsXP;
		this.accountLevel = accountLevel;
		this.seasonLevel = passLevel;
		this.passPurchased = passPurchased;
		
		weapons = new Queue<Weapon>();
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

	public int getTimePlayed() {
		return timePlayed;
	}

	public void setTimePlayed(int timePlayed) {
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
		return seasonLevel;
	}

	public void setPassLevel(Integer passLevel) {
		this.seasonLevel = passLevel;
	}
	
	public void rechargeWeapon(Weapon weapon, int type){
		switch (type) {
		case 0:
			weapons.check().setMunition(15);;
			break;
		case 1:
			weapons.check();
			break;
		case 2:
			weapons.check();
			break;
		case 3:
			weapons.check();
			break;
		case 4:
			weapons.check();
			break;
		}
	}
	
	public void addWeapon(Weapon weapon){
				
		weapons.offer(weapon);
		
	}
	
	public void shootWeapon(int type) throws Exception{
		switch (type) {
		case 0:
			weapons.check().Shoot();
			break;
		case 1:
			weapons.check().Shoot();
			break;
		case 2:
			weapons.check().Shoot();
			break;
		case 3:
			weapons.check().Shoot();
			break;
		case 4:
			weapons.check().Shoot();
			break;
		}
	}

}
