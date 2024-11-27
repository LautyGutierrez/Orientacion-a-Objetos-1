package ar.edu.unlp.info.oo1.Ejercicio4_figuras_y_cuerpos;

public class Circulo implements Figura{
	private Double radio;
	private Double diametro;
	
	public Circulo(Double radio) {
		this.radio = radio;
		this.diametro = radio * 2;
	}
	
	public Circulo() {
		
	}
	
	public Double getPerimetro() {
		return diametro * Math.PI;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
		this.diametro = radio * 2;
	}

	public Double getDiametro() {
		return diametro;
	}

	public void setDiametro(Double diametro) {
		this.diametro = diametro;
		this.radio = diametro / 2;
	}
	
	public Double getArea() {
		return Math.PI * (radio * radio);
	}
	
}
