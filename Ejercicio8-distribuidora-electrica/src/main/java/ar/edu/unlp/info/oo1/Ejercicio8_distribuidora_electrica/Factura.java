package ar.edu.unlp.info.oo1.Ejercicio8_distribuidora_electrica;

import java.time.LocalDate;

public class Factura {
	private Double montoEnergiaActiva;
	private Double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Factura(Double monto, Double descuento, Usuario user) {
		fecha = LocalDate.now();
		usuario = user;
		montoEnergiaActiva = monto;
		this.descuento = descuento;
	}
	
	public Factura(Usuario unUsuario, Double precioKWh) {
		fecha = LocalDate.now();
		usuario = unUsuario;
		montoEnergiaActiva = valorMonto(precioKWh);
		descuento = aplicarDescuento();
		
	}
	
	private Double valorMonto(Double precioKWh) {
		if(usuario.tieneConsumos()) {
			return usuario.ultimoConsumoActiva().costoEnBaseA(precioKWh);
		}
		return 0d;
	}
	
	private Double aplicarDescuento() {
		Double resultado = 0d;
		if(usuario.tieneConsumos()) {
			Double auxiliar = usuario.ultimoConsumoActiva().factorDePotencia();
			if(auxiliar > 0.8) {
				resultado = 10d;
			}
		}
		return resultado;
	}
	
	//public Double montoTotal() {
		//Double auxiliar = usuario.ultimoConsumoActiva().factorDePotencia();
		//Double resultado = 0d;
		//if(auxiliar > 0.8) {
			//resultado = montoEnergiaActiva * 0.1;
		//}
		//return montoEnergiaActiva - resultado;
	//}
	
	public Double montoTotal() {
		Double auxiliar = 0d;
		if(descuento != 0d) {
			auxiliar = montoEnergiaActiva * descuento / 100;
		}
		return montoEnergiaActiva - auxiliar;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public Double getDescuento() {
		return descuento;
	}
	
	public Double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}
}
