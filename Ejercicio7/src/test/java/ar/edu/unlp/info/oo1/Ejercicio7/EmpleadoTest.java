package ar.edu.unlp.info.oo1.Ejercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	private Empleado e;
	private EmpleadoJerarquico ej;
	private Gerente g;
	
	@BeforeEach
	void setUp() throws Exception{
		e = new Empleado("Lauty");
		ej = new EmpleadoJerarquico("Lautaro");
		g = new Gerente("Laucha");
	}
	
	@Test
	void testEmpleado() {
		assertEquals(e.sueldoBasico(), 48500.0);
	}
	
	@Test
	void testEmpleadoJerarquico() {
		assertEquals(ej.sueldoBasico(), 56500.0);
	}
	
	@Test
	void testGerente() {
		assertEquals(g.aportes(), 2850.0);
	}
	
	@Test
	void testSuma(){
		assertEquals(e.sueldoBasico() + ej.bonoPorCategoria(), 56500.0);
	}
}
