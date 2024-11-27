package ar.edu.unlp.info.oo1.Parcial2022;

import java.util.*;
import java.time.*;

public class Contribuyente {
	private String nombre;
	private int dni;
	private String email;
	private String localidad;
	private List<Bien> bienes;
	
	public Contribuyente(String nombre, int dni, String email, String localidad) {
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.localidad = localidad;
		this.bienes = new ArrayList<Bien>();
	}
	
	//preguntar si devuelvo un Bien o un Inmueble
	public Bien agregarInmueble(int numero, double valorLote, double valorEdi) {
		Bien i = new Inmueble(numero, valorLote, valorEdi);
		bienes.add(i);
		return i;
	}
	
	public Bien agregarAutomotor(String patente, String marca, String modelo, LocalDate fecha,
	double valor) {
		Bien a = new Automotor(patente, fecha, valor, marca, modelo);
		bienes.add(a);
		return a;
	}
	
	public Bien agregarEmbarcacion(String patente, String nombre,LocalDate fecha, double valor) {
		Bien e = new Embarcacion(patente, fecha, valor, nombre);
		bienes.add(e);
		return e;
	}
	
	public double calcularImpuesto() {
		return bienes.stream()
				.mapToDouble(bien -> bien.calcularImpuesto())
				.sum();
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
}
