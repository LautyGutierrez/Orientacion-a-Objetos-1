package ar.edu.unlp.info.oo1.Ejercicio17_Facturacion_de_llamadas;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroLlamadaInterurbana extends RegistroLlamada{
	private double distancia;
	
	public RegistroLlamadaInterurbana(LocalDate fecha, LocalTime hora, int cant, 
	int nroL, int nroR, double distancia) {
		super(fecha, hora, cant, nroL, nroR);
		this.distancia = distancia;
	}
}
