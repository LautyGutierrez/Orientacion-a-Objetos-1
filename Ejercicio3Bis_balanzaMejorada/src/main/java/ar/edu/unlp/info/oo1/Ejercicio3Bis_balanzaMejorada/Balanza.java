package ar.edu.unlp.info.oo1.Ejercicio3Bis_balanzaMejorada;
import java.time.LocalDate;
import java.util.*;
public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<Producto>();
	}
	 
	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto prod){
		this.productos.add(prod);
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(LocalDate.now(), new ArrayList<Producto>(this.productos));
		return t;
	}

	public Integer cantidadDeProductos() {
		return this.productos.size();
	}

	public Double precioTotal() {
		Double total = this.productos.stream()
				.mapToDouble(prod -> prod.getPrecio())
				.sum();
		return total;
	}

	public Double pesoTotal() {
		Double total = this.productos.stream()
				.mapToDouble(prod -> prod.getPeso())
				.sum();
		return total;
	}

	public List<Producto> getProductos() {
		return new ArrayList<Producto>(this.productos);
	}
}
