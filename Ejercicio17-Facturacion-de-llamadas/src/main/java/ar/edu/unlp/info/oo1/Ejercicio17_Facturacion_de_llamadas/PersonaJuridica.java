package ar.edu.unlp.info.oo1.Ejercicio17_Facturacion_de_llamadas;

public class PersonaJuridica extends Cliente{
	private int cuit;
	private String tipo;
	
	public PersonaJuridica(String nombre, String direccion, int cuit, String tipo) {
		super(nombre, direccion);
		this.cuit = cuit;
		this.tipo = tipo;
	}
}
