package ar.edu.unlp.info.oo1.Ejercicio11_inversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.*;

public class InversorTest {
	protected Inversor i;
	protected InversionEnAcciones inversion1;
	protected InversionEnAcciones inversion2;
	protected InversionEnAcciones inversion3;
	protected PlazoFijo pf1;
	protected PlazoFijo pf2;
	protected PlazoFijo pf3;
	
	@BeforeEach
	void setUp() {
		i = new Inversor("Lautaro");
		inversion1 = new InversionEnAcciones("Inversion1", 10, 100);
		inversion2 = new InversionEnAcciones("Inversion1", 100, 10);
		inversion3 = new InversionEnAcciones("Inversion1", 5, 200);
		
		pf1 = new PlazoFijo(LocalDate.of(2023, 9, 1), 10, 2);
		pf2 = new PlazoFijo(LocalDate.of(2023, 9, 1), 10, 2);
		pf3 = new PlazoFijo(LocalDate.of(2023, 9, 1), 10, 2);
		
		i.agregar(inversion1);
		i.agregar(inversion2);
		i.agregar(inversion3);
		i.agregar(pf1);
		i.agregar(pf2);
		i.agregar(pf3);
		
	}
	
	@Test
	void periodTest() {
		LocalDate fecha = LocalDate.of(2023, 9, 1);
		int cant = Period.between(fecha, LocalDate.now()).getDays();
		assertEquals(cant, 27);
	}
	
	@Test
	void plazoFijoValorActualTest() {
		assertEquals(550, pf1.valorActual());
	}
	
	@Test
	void inversionEnAccionesValorActualTest() {
		assertEquals(1000, inversion1.valorActual());
	}
	
	@Test
	void inversorValorActualTest() {
		assertEquals(4650, i.valorActual());
	}
}
