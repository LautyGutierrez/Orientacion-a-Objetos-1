package ar.edu.unlp.info.oo1.Ejercicio3Bis_balanzaMejorada;
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
		assertEquals(b.cantidadDeProductos(), 3);
		assertEquals(b.pesoTotal(), 13.0);
		assertEquals(b.precioTotal(), 3205.0);
	}
	
	@Test
	public void ponerEnCeroTest() {
		b.ponerEnCero();
		assertEquals(b.cantidadDeProductos(), 0);
		assertEquals(b.pesoTotal(), 0.0);
		assertEquals(b.precioTotal(), 0.0);
	}
	
	@Test
	public void emitirTicketTest() {
		assertEquals(3, t.cantidadDeProductos());
		assertEquals(13.0, t.pesoTotal());
		assertEquals(3878.05, t.precioTotal());
	}
	
}
