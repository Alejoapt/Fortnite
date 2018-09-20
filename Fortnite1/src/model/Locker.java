package model;

public class Locker {

	private String banner;
	private String outfit;
	private String backBing;
	private String harvestingTool;
	private String glider;
	private String contrail;
	private String loadingScreen;
	private String emotes;
	
	public final static String SPECIALEVENT = "";
	public final static String DEFAULTSKIN = "";


	public Locker(String banner, String outfit, String backBing, String harvestingTool, String glider, String contrail,
			String loadingScreen, String emotes) {
		super();
		this.banner = banner;
		this.outfit = outfit;
		this.backBing = backBing;
		this.harvestingTool = harvestingTool;
		this.glider = glider;
		this.contrail = contrail;
		this.loadingScreen = loadingScreen;
		this.emotes = emotes;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getOutfit() {
		return outfit;
	}

	public void setOutfit(String outfit) {
		this.outfit = outfit;
	}

	public String getBackBing() {
		return backBing;
	}

	public void setBackBing(String backBing) {
		this.backBing = backBing;
	}

	public String getHarvestingTool() {
		return harvestingTool;
	}

	public void setHarvestingTool(String harvestingTool) {
		this.harvestingTool = harvestingTool;
	}

	public String getGlider() {
		return glider;
	}

	public void setGlider(String glider) {
		this.glider = glider;
	}

	public String getContrail() {
		return contrail;
	}

	public void setContrail(String contrail) {
		this.contrail = contrail;
	}

	public String getLoadingScreen() {
		return loadingScreen;
	}

	public void setLoadingScreen(String loadingScreen) {
		this.loadingScreen = loadingScreen;
	}

	public String getEmotes() {
		return emotes;
	}

	public void setEmotes(String emotes) {
		this.emotes = emotes;
	}

}
