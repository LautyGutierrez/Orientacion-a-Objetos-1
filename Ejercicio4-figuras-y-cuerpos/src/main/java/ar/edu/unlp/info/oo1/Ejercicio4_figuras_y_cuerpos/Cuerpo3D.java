package ar.edu.unlp.info.oo1.Ejercicio4_figuras_y_cuerpos;

public class Cuerpo3D {
	private Double altura;
	private Figura caraBasal;
	
	public Cuerpo3D() {
		
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}

	public Double getAltura() {
		return altura;
	}
	
	public Double getVolumen() {
		return caraBasal.getArea() * altura;
	}
	
	public Double getSuperficieExterior() {
		return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * altura;
	}
	
	
}
