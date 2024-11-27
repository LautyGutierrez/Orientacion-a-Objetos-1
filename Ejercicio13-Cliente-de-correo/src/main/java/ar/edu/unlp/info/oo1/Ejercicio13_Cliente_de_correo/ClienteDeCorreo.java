package ar.edu.unlp.info.oo1.Ejercicio13_Cliente_de_correo;

import java.util.List;
import java.util.ArrayList;


public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo(Carpeta inbox) {
		this.inbox = inbox;
		carpetas = new ArrayList<Carpeta>();
	}
	
	public void recibir(Email email) {
		this.inbox.agregar(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminar(email);
		destino.agregar(email);
	}
	
	public Email buscar(String texto) {
		Email email;
		for(Carpeta folder: carpetas) {
			email = folder.buscar(texto);
			if(email != null) return email;
		}
		return null;
	}
	
	public int espacioOcupado() {
		return carpetas.stream()
				.mapToInt(folder -> folder.tamanio())
				.sum();
	}
	
	public void agregar(Carpeta folder) {
		carpetas.add(folder);
	}
	
	
}
