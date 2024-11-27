package ar.edu.unlp.info.oo1.Parcial2022;

import java.time.*;

public class Automotor extends Transporte{
	private String marca;
	private String modelo;

	public Automotor(String patente, LocalDate fecha, double valor, String marca, String modelo) {
		super(patente, fecha, valor);
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public double calcularImpuesto() {
		if(this.calcularAntiguedad() <= 10) {
			double cincoPorciento = this.valor * 0.05;
			return this.valor + cincoPorciento;
		}
		return 0;
	}
}
