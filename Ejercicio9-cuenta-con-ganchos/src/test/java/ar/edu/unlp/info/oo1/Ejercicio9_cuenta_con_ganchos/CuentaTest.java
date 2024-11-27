package ar.edu.unlp.info.oo1.Ejercicio9_cuenta_con_ganchos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {
	CuentaCorriente cc;
	CajaDeAhorro ca;
	
	@BeforeEach
	void setUp() throws Exception{
		cc = new CuentaCorriente();
		ca = new CajaDeAhorro();
	}
	
	@Test
	void depositarTest() {
		cc.depositar(100d);
		ca.depositar(100d);
		assertEquals(100d, cc.getSaldo());
		assertEquals(98d, ca.getSaldo());
	}
	
	@Test
	void puedeExtraerTest() {
		cc.depositar(100d);
		ca.depositar(100d);
		assertEquals(true, cc.puedeExtraer(100d));
		assertEquals(true, ca.puedeExtraer(90d));
		assertEquals(false, cc.puedeExtraer(101d));
		assertEquals(false, ca.puedeExtraer(100d));
	}
	
	@Test
	void limiteDescubiertoTest() {
		cc.depositar(100d);
		cc.setLimiteDescubierto(-10d);
		assertEquals(true, cc.puedeExtraer(105d));
		assertEquals(false, cc.puedeExtraer(120d));
		assertEquals(true, cc.puedeExtraer(110d));
	}
	@Test
	void extraerTest() {
		cc.depositar(100d);
		ca.depositar(100d);
		
		cc.extraer(50d);
		ca.extraer(50d);
		assertEquals(50d, cc.getSaldo());
		assertEquals(47d, ca.getSaldo());
		assertEquals(true, cc.extraer(50d));
		assertEquals(false, cc.extraer(500d));
		assertEquals(false, ca.extraer(100d));
	}
}
