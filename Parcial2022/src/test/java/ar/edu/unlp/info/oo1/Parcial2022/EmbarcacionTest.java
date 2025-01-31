package ar.edu.unlp.info.oo1.Parcial2022;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmbarcacionTest {
	Embarcacion e1;
	Embarcacion e2;
	Embarcacion e3;
	
	@BeforeEach
	void setUp() {
		e1 = new Embarcacion("OPI 666", LocalDate.of(2022, 1, 1), 100000, "OpiTech");
		e2 = new Embarcacion("LAS 512", LocalDate.of(1980, 1, 1), 100000, "Titanic");
		e3 = new Embarcacion("OPI 667", LocalDate.of(2022, 1, 1), 10000000, "OpiTech2");
	}
	
	@Test
	void testCalcularImpuesto() {
		assertEquals(0,e2.calcularImpuesto());
		assertEquals(110000, e1.calcularImpuesto());
		assertEquals(11500000, e3.calcularImpuesto());
	}
	
	@Test
	void testCalcularAntiguedad() {
		System.out.println("hola");
		assertEquals(1, e1.calcularAntiguedad());
		assertEquals(1, e3.calcularAntiguedad());
		assertEquals(43, e2.calcularAntiguedad());
	}
}
