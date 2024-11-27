package ar.edu.unlp.info.oo1.Ejercicio14_intervalo_de_tiempo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.*;

public class DateLapseTest {
	DateLapse dosmil;
	
	@BeforeEach
	void setUp(){
		LocalDate from = LocalDate.of(2000, 1, 1);
		LocalDate to = LocalDate.of(2023, 12, 31);
		dosmil = new DateLapse(from, to);
	}
	
	@Test
	void sizeInDaysTest() {
		assertEquals(8765, dosmil.sizeInDays());
	}
	
	@Test
	void includesDateTest() {
		LocalDate hoy = LocalDate.now();
		LocalDate antes = LocalDate.of(1990, 1, 2);
		LocalDate despues = LocalDate.of(2030, 4, 10);
		assertTrue(dosmil.includesDate(hoy));
		assertFalse(dosmil.includesDate(despues));
		assertFalse(dosmil.includesDate(antes));
	}
	
	@Test
	void includesDateEnLimitesTest() {
		LocalDate from = LocalDate.of(2000, 1, 1);
		LocalDate to = LocalDate.of(2023, 12, 31);
		LocalDate antes = LocalDate.of(1999, 12, 31);
		LocalDate despues = LocalDate.of(2024, 1, 1);
		assertTrue(dosmil.includesDate(from));
		assertTrue(dosmil.includesDate(to));
		assertFalse(dosmil.includesDate(despues));
		assertFalse(dosmil.includesDate(antes));
	}
}
