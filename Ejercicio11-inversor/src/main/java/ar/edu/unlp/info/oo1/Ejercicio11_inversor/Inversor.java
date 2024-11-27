package ar.edu.unlp.info.oo1.Ejercicio11_inversor;

import java.util.List;
import java.util.ArrayList;

public class Inversor {
	private String nombre;
	private List<Inversiones> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<Inversiones>();
	}
	public double valorActual() {
		return inversiones.stream()
				.mapToDouble(inversion -> inversion.valorActual())
				.sum();
	}
	
	public void agregar(Inversiones inversion) {
		this.inversiones.add(inversion);
	}

}
