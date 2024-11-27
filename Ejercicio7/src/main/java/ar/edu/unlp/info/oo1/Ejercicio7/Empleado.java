package ar.edu.unlp.info.oo1.Ejercicio7;

public class Empleado {
	private String nombre;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public Double montoBasico() {
		return 35000.0;
	}
	
	public Double aportes() {
		return 13500.0;
	}
	
	public Double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}
}
