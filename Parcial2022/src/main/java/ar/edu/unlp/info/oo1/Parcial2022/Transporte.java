package ar.edu.unlp.info.oo1.Parcial2022;

import java.time.*;
import java.time.temporal.*;

public abstract class Transporte implements Bien{
	private String patente;
	private LocalDate fecha;
	protected double valor;
	
	public Transporte(String patente, LocalDate fecha, double valor) {
		this.patente = patente;
		this.fecha = fecha;
		this.valor = valor;
	}
	
	
	protected int calcularAntiguedad() {
		return (int) ChronoUnit.YEARS.between(this.fecha, LocalDate.now());
	}
}
