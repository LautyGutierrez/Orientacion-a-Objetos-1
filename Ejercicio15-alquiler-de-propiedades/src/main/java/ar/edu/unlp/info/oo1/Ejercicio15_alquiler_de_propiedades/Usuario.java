package ar.edu.unlp.info.oo1.Ejercicio15_alquiler_de_propiedades;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	
	public Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
