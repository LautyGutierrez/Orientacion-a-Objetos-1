package ar.edu.unlp.info.oo1.Ejercicio12_volumen_y_superficie_de_solidos;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}
	
	public abstract double getVolumen();
	
	public abstract double getSuperficie();
}
