package ar.edu.unlp.info.oo1.Ejercicio17_Facturacion_de_llamadas;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private int numero;
	
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void asignarNumero(int numero) {
		this.numero = numero;
	}
	
	
}
