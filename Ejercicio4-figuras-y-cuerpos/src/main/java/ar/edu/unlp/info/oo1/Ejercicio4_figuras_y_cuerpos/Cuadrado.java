package ar.edu.unlp.info.oo1.Ejercicio4_figuras_y_cuerpos;

public class Cuadrado implements Figura{
	private Double lado;
	
	public Cuadrado() {
		
	}
	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}
	
	public Double getPerimetro() {
		return lado * 4.0;
	}
	
	public Double getArea() {
		return lado * lado;
	}
}
