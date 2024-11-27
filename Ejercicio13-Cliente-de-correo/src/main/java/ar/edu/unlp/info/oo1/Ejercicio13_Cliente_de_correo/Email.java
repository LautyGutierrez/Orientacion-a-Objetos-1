package ar.edu.unlp.info.oo1.Ejercicio13_Cliente_de_correo;

import java.util.*;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public List<Archivo> getAdjuntos(){
		return adjuntos;
	}
	
	public void agregar(Archivo file) {
		adjuntos.add(file);
	}
	
	public int tamanio() {
		int suma = adjuntos.stream()
				.mapToInt(file -> file.tamanio())
				.sum();
		return titulo.length() + cuerpo.length() + suma;
	}
}
