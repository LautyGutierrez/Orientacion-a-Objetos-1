package ar.edu.unlp.info.oo1.Ejercicio6_red_de_alumbrado;

import java.util.*;

public class Farola {
	private Boolean interruptor;
	private List<Farola> vecinos;
	
	public Farola() {
		vecinos = new ArrayList<Farola>();
		interruptor = false;
	}
	
	public Boolean isOn() {
		return interruptor;
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!vecinos.contains(otraFarola)) {
			vecinos.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors(){
		return new ArrayList<Farola>(vecinos);
	}
	
	public void turnOn() {
		if(!this.isOn()) {
			this.interruptor = true;
			this.vecinos.stream()
			.filter(farola -> !farola.isOn())
			.forEach(Farola::turnOn);
		}
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.interruptor = false;
			this.vecinos.stream()
			.filter(farola -> farola.isOn())
			.forEach(Farola::turnOff);
		}
	}

}
