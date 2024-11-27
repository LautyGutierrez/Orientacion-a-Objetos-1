package ar.edu.unlp.info.oo1.Ejercicio15_alquiler_de_propiedades;

import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class OOBnB {
	private List<Usuario> usuarios;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public OOBnB() {
		usuarios = new ArrayList<Usuario>();
		propiedades = new ArrayList<Propiedad>();
		reservas = new ArrayList<Reserva>();
	}
	
	public Usuario registrarUsuario(String nombre, String direccion, int dni) {
		Usuario user = new Usuario(nombre, direccion, dni);
		this.usuarios.add(user);
		return user;
	}
	
	public Propiedad registrarPropiedad(String nombre, String descripcion, double precio, String direccion, Usuario usuarioPropietario) {
		if(usuarios.contains(usuarioPropietario)) {
			Propiedad p = new Propiedad(nombre, descripcion, precio, direccion, usuarioPropietario);
			propiedades.add(p);
			return p;
		}
		else return null;
	}
	
	public Reserva hacerReserva(Propiedad p, DateLapse periodo, Usuario user) {
		if((usuarios.contains(user)) && (propiedades.contains(p))) {
			Reserva r = new Reserva(p, periodo, user);
			reservas.add(r);
			p.agregarReserva(periodo);
			return r;
		} else return null;
	}
	
	public List<Propiedad> propiedadesDisponibles(DateLapse dl){
		return propiedades.stream()
				.filter(p -> p.estaDisponible(dl))
				.collect(Collectors.toList());
	}
	
	public double calcularPrecio(Reserva r) {
		return r.getPeriodo().sizeInDays() * r.getPropiedad().getPrecio();
	}
	
	public void eliminarReserva(Reserva r) {
		LocalDate hoy = LocalDate.now();
		if(hoy.isBefore(r.getPeriodo().getFrom())) {
			r.getPropiedad().eliminarReserva(r.getPeriodo());
			reservas.remove(r);
		}
	}
	
	public List<Reserva> obtenerReservas(Usuario user){
		return reservas.stream()
				.filter(r -> r.getInquilino() == user)
				.collect(Collectors.toList());
	}
	
	public double calcularIngresos(Usuario user, DateLapse dl) {
		double total = 0;
		int cant;
		for(Reserva r: this.reservas) {
			cant = 0;
			Propiedad p = r.getPropiedad();
			if(p.getUsuarioPropietario().getNombre().equals(user.getNombre())) {
				if(dl.includesDate(r.getPeriodo().getFrom())) {
					if(dl.includesDate(r.getPeriodo().getTo())) {
						cant = r.getPeriodo().sizeInDays();
					} else {
						DateLapse aux = new DateLapse(r.getPeriodo().getFrom(), dl.getTo());
						cant = aux.sizeInDays();
					}
				} else if(dl.includesDate(r.getPeriodo().getTo())) {
					DateLapse aux = new DateLapse(dl.getFrom(), r.getPeriodo().getTo());
					cant = aux.sizeInDays();
				}
				total += p.getPrecio() * cant;
			}
		}
		return total;
	}
}
