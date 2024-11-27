package ar.edu.unlp.info.oo1.ejercicio2Balanza;
import java.time.LocalDate;
public class Balanza {
	private Integer cantidadDeProductos;
	private Double precioTotal;
	private Double pesoTotal;
	
	public Balanza() {
		this.ponerEnCero();
	}
	 
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0.0;
		this.pesoTotal = 0.0;
	}
	
	public void agregarProducto(Producto prod){
		this.cantidadDeProductos += 1;
		this.precioTotal += prod.getPrecio();
		this.pesoTotal += prod.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket(LocalDate.now(), this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
		return t;
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
