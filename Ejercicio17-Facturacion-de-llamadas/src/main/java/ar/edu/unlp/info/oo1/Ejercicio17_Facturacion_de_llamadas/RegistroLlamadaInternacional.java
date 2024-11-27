package ar.edu.unlp.info.oo1.Ejercicio17_Facturacion_de_llamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroLlamadaInternacional extends RegistroLlamada {
	private String paisOrigen;
	private String paisDestino;
	
	public RegistroLlamadaInternacional(LocalDate fecha, LocalTime hora, int cant, 
	int nroL, int nroR, String po, String pd) {
		super(fecha, hora, cant, nroL, nroR);
		this.paisOrigen = po;
		this.paisDestino = pd;
	}
}
