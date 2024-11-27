package ar.edu.unlp.info.oo1.Ejercicio3_presupuesto;

public class Item {
	private String detalle;
	private Integer cantidad;
	private Double costoUnitario;
	
	public Item(String detalle, Integer cantidad, Double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public Double costo() {
		return cantidad * costoUnitario;
	}

	public String getDetalle() {
		return detalle;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public Double getCostoUnitario() {
		return costoUnitario;
	}
}
