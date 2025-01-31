package ar.edu.unlp.info.oo1.Ejercicio8_distribuidora_electrica;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	
	private Usuario usuario;
	private Consumo consumoEnero;
	private Consumo consumoFebrero;
	private Consumo consumoMarzo;

	private Consumo consumoAbril;

	private Usuario usuarioSinDescuento;
	private Usuario usuarioSinConsumos;
	
	@BeforeEach
	public void setup() {
		this.usuario= new Usuario("Towers", "La Plata");
		
		this.consumoEnero = new Consumo(LocalDate.of(2021, 1, 1) , 800d, 100d);
		this.consumoFebrero = new Consumo(LocalDate.of(2021, 2, 1) , 860d, 30d);
		this.consumoMarzo = new Consumo(LocalDate.of(2021, 3, 1) , 820d, 10d);
		this.consumoAbril = new Consumo(LocalDate.of(2021, 4, 1) , 200d, 150d);
		
		this.usuario.agregarMedicion(consumoFebrero);
		this.usuario.agregarMedicion(consumoMarzo);
		this.usuario.agregarMedicion(consumoEnero);
		
		this.usuarioSinDescuento = new Usuario("Turing", "Mendoza");
		this.usuarioSinDescuento.agregarMedicion(consumoAbril);
		
		this.usuarioSinConsumos = new Usuario("Pedro", "City Bell");
	}
	//
	//Acá estaba comparando un numero con un objeto, asi que le agregué el getConsumoEnergiaActiva()
	//
	@Test
	public void testUltimoConsumoActiva() {
		assertEquals(820, this.usuario.ultimoConsumoActiva().getConsumoEnergiaActiva());
	}

	@Test
	public void testFacturarEnBaseAUsuarioConDescuento() {
		Factura result = this.usuario.facturarEnBaseA(10d);
		assertEquals(8200,result.getMontoEnergiaActiva());
		assertEquals(10, result.getDescuento());
		assertEquals(LocalDate.now(),result.getFecha());
	}

	@Test
	public void testFacturarEnBaseAUsuarioSinDescuento() {
		Factura result = this.usuarioSinDescuento.facturarEnBaseA(10d);
		assertEquals(2000,result.getMontoEnergiaActiva());
		assertEquals(0, result.getDescuento());
		assertEquals(LocalDate.now(),result.getFecha());
	}

	@Test
	public void testFacturarEnBaseAUsuarioSinConsumo() {
		Factura result = this.usuarioSinConsumos.facturarEnBaseA(10d);
		assertEquals(0,result.getMontoEnergiaActiva());
		assertEquals(0, result.getDescuento());
		assertEquals(LocalDate.now(),result.getFecha());
	}

	/**
	 * Testea el agregar medición verificando que sea el último insertado.
	 */
	@Test
	public void testAgregarMedicion() {
		Consumo ultimoConsumo = new Consumo(LocalDate.of(2021, 5, 8), 500d, 5000d);
		this.usuario.agregarMedicion(ultimoConsumo);
		assertEquals(ultimoConsumo, this.usuario.ultimoConsumoActiva());
	}

}
