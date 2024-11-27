package src;

import java.time.LocalDate;

public class Automotor extends Transporte{
	public Automotor(String patente, String fecha, double valor) {
		super(patente, fecha, valor);
	}
	
	protected double calcularSegunTipo() {
		return this.valor * 0.1;
	}
}
