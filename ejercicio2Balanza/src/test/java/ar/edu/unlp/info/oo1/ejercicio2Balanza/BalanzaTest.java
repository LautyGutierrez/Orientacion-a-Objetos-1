package ar.edu.unlp.info.oo1.ejercicio2Balanza;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class BalanzaTest {
	Balanza b;
	Producto p1, p2, p3;
	Ticket t;
	
	@BeforeEach
	void setUp() throws Exception{
		b = new Balanza();
		p1 = new Producto(5.0, 600.0, "hola");
		p2 = new Producto(1.0, 100.0, "chau");
		p3 = new Producto(7.0, 15.0, "saludo");
		b.agregarProducto(p2);
		b.agregarProducto(p1);
		b.agregarProducto(p3);
		t = b.emitirTicket();
	}
	@Test
	public void agregarProductoTest() {
		assertEquals(b.getCantidadDeProductos(), 3);
		assertEquals(b.getPesoTotal(), 13.0);
		assertEquals(b.getPrecioTotal(), 3205.0);
	}
	
	@Test
	public void ponerEnCeroTest() {
		b.ponerEnCero();
		assertEquals(b.getCantidadDeProductos(), 0);
		assertEquals(b.getPesoTotal(), 0.0);
		assertEquals(b.getPrecioTotal(), 0.0);
	}
	
	@Test
	public void emitirTicketTest() {
		assertEquals(3, t.getCantidadDeProductos());
		assertEquals(13.0, t.getPesoTotal());
		assertEquals(3878.05, t.getPrecioTotal());
	}
	
}
