package ar.edu.unlp.info.oo1.Ejercicio17_Facturacion_de_llamadas;

import java.time.*;
import java.util.*;

public class Sistema {
	private List<Integer> numeros;
	private List<Cliente> clientes;
	private List<RegistroLlamada> registros;
	
	public Sistema() {
		numeros = new ArrayList<Integer>();
		clientes = new ArrayList<Cliente>();
		registros = new ArrayList<RegistroLlamada>();
	}
	
	public void agregarNumero(Integer num) {
		numeros.add(num);
	}
	
	public Cliente altaPersonaFisica(String nombre, String direccion, int dni) {
		Cliente c = new PersonaFisica(nombre, direccion, dni);
		c.asignarNumero(numeros.get(0));
		numeros.remove(0);
		clientes.add(c);
		return c;
	}
	
	public Cliente altaPersonaJuridica(String nombre, String direccion, int cuit, String tipo) {
		Cliente c = new PersonaJuridica(nombre, direccion, cuit, tipo);
		c.asignarNumero(numeros.get(0));
		numeros.remove(0);
		clientes.add(c);
		return c;
	}
	
	public RegistroLlamada registrarLlamada(LocalDate fecha, LocalTime hora, int cant, int nroL, 
	int nroR) {
		RegistroLlamada r = new RegistroLlamada(fecha, hora, cant, nroL, nroR);
		registros.add(r);
		return r;
	}
	
	public RegistroLlamada registrarLlamadaInterurbana(LocalDate fecha, LocalTime hora, 
	int cant, int nroL, int nroR, double distancia) {
		RegistroLlamada r = new RegistroLlamadaInterurbana(fecha, hora, cant, nroL, nroR, distancia);
		registros.add(r);
		return r;
	}
	
	public RegistroLlamada registrarLlamadaInternacional(LocalDate fecha, LocalTime hora, 
	int cant, int nroL, int nroR, String po, String pd) {
		RegistroLlamada r = new RegistroLlamadaInternacional(fecha, hora, cant, nroL, nroR, po, pd);
		registros.add(r);
		return r;
	}
	
	
}
