package model;

public class Arma {

	private String name;
	private Integer munition;
	private String imagen;
	private String tipo;

	public Arma(String name, Integer munition, String imagen, String tipo) {
		super();
		this.name = name;
		this.munition = munition;
		this.imagen = imagen;
		this.tipo = tipo;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
