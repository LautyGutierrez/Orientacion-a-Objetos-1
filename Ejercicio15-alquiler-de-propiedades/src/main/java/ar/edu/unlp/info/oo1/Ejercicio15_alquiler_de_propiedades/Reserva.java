package ar.edu.unlp.info.oo1.Ejercicio15_alquiler_de_propiedades;

public class Reserva {
	private Propiedad propiedad;
	private DateLapse periodo;
	private Usuario inquilino;
	
	public Reserva(Propiedad p, DateLapse periodo, Usuario user) {
		this.propiedad = p;
		this.periodo = periodo;
		this.inquilino = user;
	}
	
	public double calcularPrecio() {
		return periodo.sizeInDays() * propiedad.getPrecio();
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	public Usuario getInquilino() {
		return inquilino;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}
}
