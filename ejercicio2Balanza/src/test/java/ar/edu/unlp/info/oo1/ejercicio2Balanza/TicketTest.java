package ar.edu.unlp.info.oo1.ejercicio2Balanza;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
public class TicketTest {
	Ticket ticket;
	LocalDate fecha;
	
	@BeforeEach
	void setUp() throws Exception{
		fecha = LocalDate.now();
		ticket = new Ticket(fecha, 10, 5.0, 100.0); 
	}
	
	@Test
	public void constructorTest() {
		assertEquals(fecha, ticket.getFecha());
		assertEquals(10, ticket.getCantidadDeProductos());
		assertEquals(5.0, ticket.getPesoTotal());
		assertEquals(121.0, ticket.getPrecioTotal());
	}
	
	@Test
	public void impuestoTest() {
		assertEquals(181.5, ticket.impuesto(150.0));
	}
}
