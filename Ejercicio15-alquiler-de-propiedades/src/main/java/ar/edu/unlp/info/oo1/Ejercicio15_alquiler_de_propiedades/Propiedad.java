package ar.edu.unlp.info.oo1.Ejercicio15_alquiler_de_propiedades;

import java.util.*;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private double precio;
	private String direccion;
	private Usuario usuarioPropietario;
	private List<DateLapse> reservas;
	
	public Propiedad(String nombre, String desc, double precio, String dire, Usuario user) {
		this.nombre = nombre;
		this.descripcion = desc;
		this.precio = precio;
		this.direccion = dire;
		this.usuarioPropietario = user;
		this.reservas = new ArrayList<DateLapse>();
	}
	
	public void agregarReserva(DateLapse dl) {
		reservas.add(dl);
	}
	
	public boolean estaDisponible(DateLapse dl) {
		for(DateLapse date: reservas) {
			if(date.overlaps(dl)) return false;
		}
		return true;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void eliminarReserva(DateLapse dl) {
		reservas.remove(dl);
	}
	
	public Usuario getUsuarioPropietario() {
		return usuarioPropietario;
	}
	
}
