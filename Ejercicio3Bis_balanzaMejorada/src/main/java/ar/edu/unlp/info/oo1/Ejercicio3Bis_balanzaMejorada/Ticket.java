package ar.edu.unlp.info.oo1.Ejercicio3Bis_balanzaMejorada;
import java.time.LocalDate;
import java.util.*;
public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	
	public Ticket(LocalDate fecha, List<Producto> productos) {
		this.fecha = fecha;
		this.productos = productos;
	}
	
	public Double impuesto(Double precio) {
		Double porcentaje = (precio * 21.0) / 100.0;
		return precio + porcentaje;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Integer cantidadDeProductos() {
		return this.productos.size();
	}

	public Double precioTotal() {
		Double total = this.productos.stream()
				.mapToDouble(prod -> prod.getPrecio())
				.sum();
		return this.impuesto(total);
	}

	public Double pesoTotal() {
		Double total = this.productos.stream()
				.mapToDouble(prod -> prod.getPeso())
				.sum();
		return total;
	}
}
