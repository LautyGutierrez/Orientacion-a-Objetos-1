package ar.edu.unlp.info.oo1.Parcial2022;

public class Inmueble implements Bien{
	private int numero;
	private double valorLote;
	private double valorEdi;
	
	public Inmueble(int numero, double valorLote, double valorEdi) {
		this.numero = numero;
		this.valorLote = valorLote;
		this.valorEdi = valorEdi;
	}
	
	public double calcularImpuesto() {
		return (this.valorLote + this.valorEdi) * 0.01;
	}
}
