package ar.edu.unlp.info.oo1.Ejercicio14_intervalo_de_tiempo;

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

}
