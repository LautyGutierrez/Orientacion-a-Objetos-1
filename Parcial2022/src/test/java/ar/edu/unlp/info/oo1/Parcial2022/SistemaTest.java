package ar.edu.unlp.info.oo1.Parcial2022;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	Sistema s;
	
	@BeforeEach
	void setUp() {
		s = new Sistema();
		s.agregarContribuyente("Lalo", 11222333, "lalo@gmail.com", "Gonnet");
		s.agregarContribuyente("Melman", 11222444, "melman@gmail.com", "Gonnet");
		s.agregarContribuyente("Lauty", 11555333, "lauty@gmail.com", "Gonnet");
		s.agregarAutomotor("LJG 785", "BMW", "ni idea", LocalDate.of(2019, 2, 3), 100000, s.getContribuyentes().get(0));
		s.agregarAutomotor("LJG 785", "BMW", "ni idea", LocalDate.of(2019, 2, 3), 10000000, s.getContribuyentes().get(1));
		s.agregarAutomotor("LJG 785", "BMW", "ni idea", LocalDate.of(1980, 2, 3), 10000, s.getContribuyentes().get(2));
	}
	
	@Test
	void testContribuyenteMasPago() {
		assertEquals(s.contribuyentesMasPagos("Gonnet", 2).get(1), s.getContribuyentes().get(2));
	}
}
