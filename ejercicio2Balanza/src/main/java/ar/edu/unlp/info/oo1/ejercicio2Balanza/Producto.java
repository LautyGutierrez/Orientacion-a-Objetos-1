package ar.edu.unlp.info.oo1.ejercicio2Balanza;

public class Producto {
	private Double peso;
	private Double precioPorKilo;
	private String descripcion;
	
	public Producto(Double peso, Double precioPorKilo, String descripcion) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}
	
	public Double getPrecio() {
		return this.peso * this.precioPorKilo;
	}
	
	public Double getPeso() {
		return this.peso;
	}

	public Double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
