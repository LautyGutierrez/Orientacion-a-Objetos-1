package ar.edu.unlp.info.oo1.Ejercicio15_alquiler_de_propiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	

	public LocalDate getTo() {
		return this.to;
	}
	

	public int sizeInDays() {
		long dias = ChronoUnit.DAYS.between(this.from, this.to);
		return (int) dias;
	}

	public boolean includesDate(LocalDate other) {
		if((other.isEqual(from) || other.isAfter(from))
		&& (other.isBefore(to) || other.isEqual(to))) {
			return true;
		}
		return false;
	}
	
	public boolean overlaps(DateLapse other) {
		boolean ok = false;
		if(this.includesDate(other.getFrom()) || (this.includesDate(other.getTo()))) {
			ok = true;
		}
		return ok;
	}

}
