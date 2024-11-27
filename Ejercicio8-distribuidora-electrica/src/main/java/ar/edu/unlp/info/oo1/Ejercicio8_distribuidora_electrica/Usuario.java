package ar.edu.unlp.info.oo1.Ejercicio8_distribuidora_electrica;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario() {
		facturas = new ArrayList<Factura>();
		consumos = new ArrayList<Consumo>();
	}
	
	public Usuario(String domicilio, String nombre) {
		this.domicilio = domicilio;
		this.nombre = nombre;
		facturas = new ArrayList<Factura>();
		consumos = new ArrayList<Consumo>();
	}
	
	public void agregarMedicion(Consumo medicion) {
		consumos.add(medicion);
		this.consumos = consumos.stream()
				.sorted((consumo1, consumo2) -> comparar(consumo1, consumo2))
				  .collect(Collectors.toList());
	}
	
	public Consumo ultimoConsumoActiva() {
		if(tieneConsumos()) {
			int index = consumos.size() - 1;
			return consumos.get(index);
		}
		return null;
	}
	
	public Factura facturarEnBaseA(Double precioKWh) {
		Factura factura = new Factura(this, precioKWh);
		facturas.add(factura);
		return factura;
	}
	
	public List<Factura> facturas(){
		return this.facturas;
	}
	
	public Boolean tieneConsumos() {
		return consumos.size() != 0;
	}
	
    private int comparar(Consumo consumo1, Consumo consumo2) {
        return consumo1.getFecha().compareTo(consumo2.getFecha());
    }
}
