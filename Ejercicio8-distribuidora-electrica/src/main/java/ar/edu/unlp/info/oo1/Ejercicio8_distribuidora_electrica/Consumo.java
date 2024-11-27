package ar.edu.unlp.info.oo1.Ejercicio8_distribuidora_electrica;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private Double consumoEnergiaActiva;
	private Double consumoEnergiaReactiva;
	
	public Consumo(LocalDate fecha, Double energiaActiva, Double energiaReactiva) {
		this.fecha = fecha;
		consumoEnergiaActiva = energiaActiva;
		consumoEnergiaReactiva = energiaReactiva;
	}
	public Double costoEnBaseA(Double precioKWh) {
		return consumoEnergiaActiva * precioKWh;
	}
	
	public Double factorDePotencia() {
		Double auxiliar1 = (consumoEnergiaActiva * consumoEnergiaActiva);
		Double auxiliar2 = (consumoEnergiaReactiva * consumoEnergiaReactiva);
		return consumoEnergiaActiva / Math.sqrt(auxiliar1 + auxiliar2); 
	}
	public Double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
}
