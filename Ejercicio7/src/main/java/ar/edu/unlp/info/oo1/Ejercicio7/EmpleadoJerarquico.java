package ar.edu.unlp.info.oo1.Ejercicio7;

public class EmpleadoJerarquico extends Empleado{
	public EmpleadoJerarquico(String nombre) {
		super(nombre);
	}
	
	public Double montoBasico() {
		return 45000.0;
	}
	
	public Double bonoPorCategoria() {
		return 8000.0;
	}
	
	public Double sueldoBasico(){
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
}
