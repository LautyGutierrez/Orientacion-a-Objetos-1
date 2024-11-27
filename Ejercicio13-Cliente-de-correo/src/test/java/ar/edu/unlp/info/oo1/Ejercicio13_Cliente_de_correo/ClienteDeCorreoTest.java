package ar.edu.unlp.info.oo1.Ejercicio13_Cliente_de_correo;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ClienteDeCorreoTest {
	ClienteDeCorreo c;
	Carpeta folder1;
	Carpeta folder2;
	Carpeta inbox;
	Email m1;
	Email m2;
	Email m3;
	Archivo file1;
	Archivo file2;
	Archivo file3;
	
	
	
	@BeforeEach
	void setUp() {
		inbox = new Carpeta("Inbox");
		c = new ClienteDeCorreo(inbox);
		folder1 = new Carpeta("Carpeta 1");
		folder2 = new Carpeta("Carpeta 2");
		m1 = new Email("Email 1", "El cuerpo no es muy largo");
		m2 = new Email("Email 2", "El cuerpo no es muy largo");
		m3 = new Email("Email 3", "El cuerpo no es muy largo");
		file1 = new Archivo("archivo 1");
		file2 = new Archivo("archivo 2");
		file3 = new Archivo("archivo 3");
		
		m1.agregar(file1);
		m1.agregar(file2);
		m1.agregar(file3);
		m2.agregar(file1);
		m2.agregar(file2);
		m2.agregar(file3);
		m3.agregar(file1);
		m3.agregar(file2);
		m3.agregar(file3);
		folder1.agregar(m1);
		folder1.agregar(m2);
		folder1.agregar(m3);
		folder2.agregar(m1);
		folder2.agregar(m2);
		folder2.agregar(m3);
		c.agregar(folder1);
		c.agregar(folder2);
	}
	
	@Test
	void tamanioArchivoTest() {
		assertEquals(9, file1.tamanio());
	}
	
	@Test
	void tamanioEmailTest() {
		assertEquals(59, m1.tamanio());
	}
	
	@Test
	void tamanioCarpetaTest() {
		assertEquals(177, folder1.tamanio());
	}
	
	@Test
	void espacioOcupadoTest() {
		assertEquals(354, c.espacioOcupado());
	}
	
	@Test
	void buscarEnCarpetaTest() {
		assertEquals(folder1.buscar("Email 1"), m1);
		assertNull(folder1.buscar("hola"));
	}
	
	@Test
	void eliminarEnCarpetaTest() {
		folder1.eliminar(m1);
		assertEquals(folder1.cantidad(), 2);
	}
	
	@Test
	void buscarEnClienteTest(){
		assertEquals(c.buscar("Email 1"), m1);
		assertNull(c.buscar("hola"));
	}
	
	@Test
	void moverTest() {
		c.mover(m1, folder2, folder1);
		assertEquals(folder2.cantidad(), 2);
		assertEquals(folder1.cantidad(), 4);
	}
}
