package ar.edu.unlp.info.oo1.Ejercicio13_Cliente_de_correo;

import java.util.*;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Email buscar(String texto) {
		return emails.stream()
			.filter(email -> email.getTitulo().equals(texto) || email.getCuerpo().equals(texto))
			.findFirst().orElse(null);

	}
	
	public void agregar(Email email) {
		emails.add(email);
	}
	
	public int tamanio() {
		return emails.stream()
				.mapToInt(email -> email.tamanio())
				.sum();
	}
	
	public void eliminar(Email email) {
		emails.remove(email);
	}
	
	public int cantidad() {
		return emails.size();
	}
}
