package ar.edu.unlp.info.oo1.Parcial2022;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Sistema {
	private List<Contribuyente> contribuyentes;
	
	public Sistema() {
		this.contribuyentes = new ArrayList<Contribuyente>();
	}
	
	public Contribuyente agregarContribuyente(String nombre, int dni, String email, String loca) {
		Contribuyente c = new Contribuyente(nombre, dni, email, loca); 
		this.contribuyentes.add(c);
		return c;
	}
	
	public Bien agregarInmueble(int numero, double valorLote, double valorEdi, 
	Contribuyente contri) {
		return contri.agregarInmueble(numero, valorLote, valorEdi);
	}
	
	public Bien agregarAutomotor(String patente, String marca, String modelo, LocalDate fecha,
	double valor, Contribuyente contri) {
		return contri.agregarAutomotor(patente, marca, modelo, fecha, valor);
	}
	
	public Bien agregarEmbarcacion(String patente, String nombre,LocalDate fecha, double valor,
	Contribuyente contri) {
		return contri.agregarEmbarcacion(patente, nombre, fecha, valor);
	}
	
	public double calcularImpuesto(Contribuyente contri) {
		if(this.contribuyentes.contains(contri)) return contri.calcularImpuesto();
		return 0;
	}
	
	public List<Contribuyente> contribuyentesMasPagos(String local, int n){
		List<Contribuyente> L = this.contribuyentes.stream()
				.filter(c -> c.getLocalidad().equals(local))
				.sorted((e1, e2) -> Double.compare(e1.calcularImpuesto(), e2.calcularImpuesto()))
				.limit(n)
				.collect(Collectors.toList());
		Collections.reverse(L);
		return L;
	}
	
	public List<Contribuyente> getContribuyentes(){
		return this.contribuyentes;
	}
}
