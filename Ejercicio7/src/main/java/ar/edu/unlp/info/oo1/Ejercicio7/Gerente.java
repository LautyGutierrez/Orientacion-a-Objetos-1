package ar.edu.unlp.info.oo1.Ejercicio7;

public class Gerente extends EmpleadoJerarquico{
	public Gerente(String nombre) {
		super(nombre);
	}
	
	public Double montoBasico() {
		return 57000.0;
	}
	
	public Double aportes() {
		return this.montoBasico() * 0.05d;
	}
}
