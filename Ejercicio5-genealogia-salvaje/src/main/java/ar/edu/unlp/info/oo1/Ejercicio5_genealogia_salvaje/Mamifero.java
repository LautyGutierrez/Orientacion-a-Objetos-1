package ar.edu.unlp.info.oo1.Ejercicio5_genealogia_salvaje;
import java.time.LocalDate;
public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String id) {
		identificador = id;
		padre = null;
		madre = null;
	}
	public Mamifero() {
		padre = null;
		madre = null;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloPaterno() {
		if(padre != null) return padre.getPadre();
		else return null;
	}
	public Mamifero getAbuelaPaterna() {
		if(padre != null) return padre.getMadre();
		else return null;
	}
	public Mamifero getAbueloMaterno() {
		if(madre != null) return madre.getPadre();
		else return null;
	}
	public Mamifero getAbuelaMaterna() {
		if(madre != null) return madre.getMadre();
		else return null;
	}
	public Boolean tieneComoAncestroA(Mamifero unMamifero){
		Boolean ok = false;
		if(padre == unMamifero) ok = true;
		else if(padre != null) ok = padre.tieneComoAncestroA(unMamifero);
		if(!ok){
			if(madre == unMamifero) ok = true;
			else if(madre != null) ok = madre.tieneComoAncestroA(unMamifero);
		}
		return ok;
			
	}
	
}
