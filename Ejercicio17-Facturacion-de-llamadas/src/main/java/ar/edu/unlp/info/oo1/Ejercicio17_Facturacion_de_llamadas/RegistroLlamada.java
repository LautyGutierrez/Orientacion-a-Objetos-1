package ar.edu.unlp.info.oo1.Ejercicio17_Facturacion_de_llamadas;

import java.time.*;

public class RegistroLlamada {
	private LocalDate fecha;
	private LocalTime hora;
	private int cantidadMinutos;
	private int nroLlamador;
	private int nroRecibidor;
	
	public RegistroLlamada(LocalDate fecha, LocalTime hora, int cant, int nroL, int nroR) {
		this.fecha = fecha;
		this.hora = hora;
		this.cantidadMinutos = cant;
		this.nroLlamador = nroL;
		this.nroRecibidor = nroR;
	}
	
	
}
