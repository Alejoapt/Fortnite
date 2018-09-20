package model;

public class Weapon extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int munition;
	private String image;
	private int type;
	public final static int pistol = 0;
	public final static int shotgun = 1;
	public final static int assaultRifle = 2;
	public final static int sniper = 3;
	public final static int launcher = 4;

	public Weapon(String name, int munition, String imagen, int type) {
		super();
		this.name = name;
		this.munition = munition;
		this.image = imagen;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMunition() {
		return munition;
	}

	public void setMunition(Integer munition) {
		this.munition = munition;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void Shoot() throws Exception {
		if (munition > 0) {
			setMunition(getMunition() - 1);
		} else
			throw new Exception("The weapon dont have munition");

	}

}
