package ar.edu.unlp.info.oo1.Parcial2022;

import java.time.LocalDate;

public class Embarcacion extends Transporte{
	private String nombre;
	
	public Embarcacion(String patente, LocalDate fecha, double valor, String nombre) {
		super(patente, fecha, valor);
		this.nombre = nombre;
	}
	
	public double calcularImpuesto() {
		double resultado = 0;
		if(this.calcularAntiguedad() <= 10) {
			if(this.valor < 1000000) {
				double diezPorciento = this.valor * 0.1;
				resultado = this.valor + diezPorciento;
			} else {
				double quincePorciento = this.valor * 0.15;
				resultado = this.valor + quincePorciento;
			}
		}
		return resultado;
	}
}
