package ar.edu.unlp.info.oo1.Ejercicio12_volumen_y_superficie_de_solidos;

import java.util.List;
import java.util.ArrayList;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public void agregar(Pieza pieza) {
		piezas.add(pieza);
	}
	
	public int getVolumenDeMaterial(String nombreDeMaterial) {
		return (int) piezas.stream()
				.filter(pieza -> nombreDeMaterial.equals(pieza.getMaterial()))
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
	}
	
	public int getSuperficieDeColor(String nombreDeColor) {
		return (int) piezas.stream()
				.filter(pieza ->  nombreDeColor.equals(pieza.getColor()))
				.mapToDouble(pieza -> pieza.getSuperficie())
				.sum();
	}
}
