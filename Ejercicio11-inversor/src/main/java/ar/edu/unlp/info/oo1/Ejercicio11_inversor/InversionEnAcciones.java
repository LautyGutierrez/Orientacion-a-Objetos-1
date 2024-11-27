package ar.edu.unlp.info.oo1.Ejercicio11_inversor;

public class InversionEnAcciones implements Inversiones{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String nombre, int cantidad, double valor) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valor;
	}
	
	public double valorActual() {
		return this.cantidad * this.valorUnitario; 
	}
}
