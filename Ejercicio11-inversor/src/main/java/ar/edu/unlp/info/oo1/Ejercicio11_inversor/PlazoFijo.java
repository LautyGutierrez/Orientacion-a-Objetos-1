package ar.edu.unlp.info.oo1.Ejercicio11_inversor;

import java.time.LocalDate;
import java.time.Period;

public class PlazoFijo implements Inversiones{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	public PlazoFijo(LocalDate fecha, double monto, double porcentaje) {
		this.fechaDeConstitucion = fecha;
		this.montoDepositado = monto;
		this.porcentajeDeInteresDiario = porcentaje;
	}
	
	public double valorActual() {
		LocalDate fechaActual = LocalDate.now();
        int diasTranscurridos = Period.between(fechaDeConstitucion, fechaActual).getDays();
        double interesAcumulado = montoDepositado * porcentajeDeInteresDiario * diasTranscurridos;
        return montoDepositado + interesAcumulado;
	}
}
