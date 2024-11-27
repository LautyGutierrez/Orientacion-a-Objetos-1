package ar.edu.unlp.info.oo1.Ejercicio3Bis_balanzaMejorada;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
public class TicketTest {
	Ticket ticket;
	LocalDate fecha;
	
	@BeforeEach
	void setUp() throws Exception{
		fecha = LocalDate.now();
		Producto p1 = new Producto(0.5, 20.0, "muy bueno");
		List<Producto> lista = new ArrayList<Producto>();
		lista.add(p1);
		lista.add(p1);
		lista.add(p1);
		lista.add(p1);
		lista.add(p1);
		lista.add(p1);
		lista.add(p1);
		lista.add(p1);
		lista.add(p1);
		lista.add(p1);
		ticket = new Ticket(fecha, lista); 
	}
	
	@Test
	public void constructorTest() {
		assertEquals(fecha, ticket.getFecha());
		assertEquals(10, ticket.cantidadDeProductos());
		assertEquals(5.0, ticket.pesoTotal());
		assertEquals(121.0, ticket.precioTotal());
	}
	
	@Test
	public void impuestoTest() {
		assertEquals(181.5, ticket.impuesto(150.0));
	}
}
