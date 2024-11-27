package ar.edu.unlp.info.oo1.Ejercicio9_cuenta_con_ganchos;

public class CajaDeAhorro extends Cuenta{

	public CajaDeAhorro() {
		super();
	}
	
	public Boolean puedeExtraer(Double monto) {
		Double dosPorciento = monto * 0.02;
		if(getSaldo() >= monto+dosPorciento) return true;
		return false;
	}
	
	protected void extraerSinControlar(Double monto) {
		Double dosPorciento = monto * 0.02;
		super.extraerSinControlar(monto + dosPorciento);
	}
	
	public void depositar(Double monto) {
		Double dosPorciento = monto * 0.02;
		super.depositar(monto - dosPorciento);
	}
}
