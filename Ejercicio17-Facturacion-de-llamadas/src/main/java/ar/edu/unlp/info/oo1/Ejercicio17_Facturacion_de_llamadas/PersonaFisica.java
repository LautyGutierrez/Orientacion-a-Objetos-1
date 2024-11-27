package ar.edu.unlp.info.oo1.Ejercicio17_Facturacion_de_llamadas;

public class PersonaFisica extends Cliente{
	private int dni;
	
	public PersonaFisica(String nombre, String direccion, int dni) {
		super(nombre, direccion);
		this.dni = dni;
	}
	
}
