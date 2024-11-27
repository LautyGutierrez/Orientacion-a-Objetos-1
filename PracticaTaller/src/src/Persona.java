package src;

public class Persona {
	private String nombre;
	private int edad;
	private int energia;
	
	public Persona(String unNombre, int unaEdad) {
		this.nombre = unNombre;
		this.edad = unaEdad;
		this.energia = 100;
	}
	
	public void caminar(int distancia) {
		if(distancia <= energia) {
			energia -= distancia;
		}
	}
	
	public void comer() {
		energia +=10;
	}
	
	public int getEnergia() {
		return energia;
	}
	
}
