package ar.edu.unlp.info.oo1.ejercicio2Balanza;
import java.time.LocalDate;
public class Ticket {
	private LocalDate fecha;
	private Integer cantidadDeProductos;
	private Double precioTotal;
	private Double pesoTotal;
	
	public Ticket(LocalDate fecha, Integer cant, Double peso, Double precio) {
		this.fecha = fecha;
		this.cantidadDeProductos = cant;
		this.pesoTotal = peso;
		this.precioTotal = this.impuesto(precio);
	}
	
	public Double impuesto(Double precio) {
		Double porcentaje = (precio * 21.0) / 100.0;
		return precio + porcentaje;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}
}
