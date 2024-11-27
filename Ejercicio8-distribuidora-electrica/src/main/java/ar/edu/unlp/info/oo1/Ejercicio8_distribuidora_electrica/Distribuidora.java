package ar.edu.unlp.info.oo1.Ejercicio8_distribuidora_electrica;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Distribuidora {
	private Double precioKWh;
	private List<Usuario> usuarios;
	
	public Distribuidora(Double precioKWh) {
		usuarios = new ArrayList<Usuario>();
		this.precioKWh = precioKWh;
	}
	
	public Double getPrecioKW() {
		return precioKWh;
	}
	public void setPrecioKWh(Double precio) {
		precioKWh = precio;
	}
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public Double consumoTotalActiva() {
		return usuarios.stream()
				.mapToDouble(usuario -> usuario.ultimoConsumoActiva().getConsumoEnergiaActiva())
				.sum();
	}
	
	public List<Factura> facturar(){
		return usuarios.stream()
				.map(usuario -> usuario.facturarEnBaseA(precioKWh))
				.collect(Collectors.toList());
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios;
	}
	
}
