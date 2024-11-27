package ar.edu.unlp.info.oo1.Ejercicio12_volumen_y_superficie_de_solidos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstrucionTest {
	private ReporteDeConstruccion r;
	private Cilindro c;
	private Esfera e;
	private PrismaRectangular p;
	
	@BeforeEach
	void setUp() {
		r = new ReporteDeConstruccion();
		c = new Cilindro("Hierro", "Rojo", 10, 10);
		e = new Esfera("Hierro", "Rojo", 10);
		p = new PrismaRectangular("Hierro", "Rojo", 10, 10, 10);
		
		r.agregar(e);
		r.agregar(p);
		r.agregar(c);
	}
	
	@Test
	void getVolumenTest() {
		assertEquals(3142, Math.round(c.getVolumen()));
		assertEquals(4189, Math.round(e.getVolumen()));
		assertEquals(1000, Math.round(p.getVolumen()));
	}
	
	@Test
	void getSuperficieTest() {
		assertEquals(1257, Math.round(c.getSuperficie()));
		assertEquals(1257, Math.round(e.getSuperficie()));
		assertEquals(600, Math.round(p.getSuperficie()));
	}
	
	@Test
	void getSuperficieDeColorTest() {
		assertEquals(3113,r.getSuperficieDeColor("Rojo"));
	}
	
	@Test
	void getVolumenDeMaterialTest() {
		assertEquals(8330, r.getVolumenDeMaterial("Hierro"));
	}
	
}
