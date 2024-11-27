package ar.edu.unlp.info.oo1.Ejercicio3_presupuesto;
import java.time.LocalDate;
import java.util.*;
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente){
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public Double calcularTotal() {
		Double total = this.items.stream()
				.mapToDouble(item -> item.costo())
				.sum();
		return total;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}
	
}
