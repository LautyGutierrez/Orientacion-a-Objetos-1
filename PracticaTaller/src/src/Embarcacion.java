package src;

import java.time.LocalDate;

public class Embarcacion extends Transporte{
	public Embarcacion(String patente, String fecha, double valor) {
		super(patente, fecha, valor);
	}
	
	protected double calcularSegunTipo() {
		if(this.valor < 50) return this.valor * 2;
		else return (this.valor * 0.2) + 10;
	}
}
