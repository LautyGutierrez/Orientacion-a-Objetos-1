package ar.edu.unlp.info.oo1.Ejercicio3Bis_balanzaMejorada;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ProductoTest {
	Producto prod;
	
	@BeforeEach
	void setUp() throws Exception{
		prod = new Producto(0.5, 56.0, "muy barato");
	}
	
	@Test
	public void constuctorTest() {
		assertEquals(0.5, prod.getPeso());
		assertEquals(56.0, prod.getPrecioPorKilo());
		assertEquals("muy barato", prod.getDescripcion());
	}
	
	@Test
	public void getPrecioTest(){
		assertEquals(28.0, prod.getPrecio());
	}
}
