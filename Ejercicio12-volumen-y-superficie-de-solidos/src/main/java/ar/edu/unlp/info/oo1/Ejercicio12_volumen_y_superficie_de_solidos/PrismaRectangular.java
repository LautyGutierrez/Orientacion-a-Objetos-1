package ar.edu.unlp.info.oo1.Ejercicio12_volumen_y_superficie_de_solidos;

public class PrismaRectangular extends Pieza{
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public PrismaRectangular(String material, String color, int mayor, int menor, int altura) {
		super(material, color);
		this.altura = altura;
		this.ladoMayor = mayor;
		this.ladoMenor = menor;
	}
	
	public double getVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	public double getSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
}
