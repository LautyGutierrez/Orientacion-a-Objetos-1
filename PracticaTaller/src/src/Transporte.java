package src;

import java.time.LocalDate;

public abstract class Transporte {
	private String patente;
	private String fecha;
	protected double valor;
	
	public Transporte(String patente, String fecha, double valor) {
		this.patente = patente;
		this.fecha = fecha;
		this.valor = valor;
	}
	
	public double calcular() {
		double r = 0;
		if(this.valor > 10d) {
			r = this.calcularSegunTipo();
		}
		return r;
	}
	
	protected abstract double calcularSegunTipo();
}
