package ar.edu.unlp.info.oo1.Ejercicio9_cuenta_con_ganchos;

public class CuentaCorriente extends Cuenta{
	private Double limiteDescubierto;
	
	public CuentaCorriente() {
		super();
		limiteDescubierto = 0d;
	}
	
	public Boolean puedeExtraer(Double monto) {
		if(getSaldo() - monto >= limiteDescubierto) return true;
		return false;
	}
	
	public void setLimiteDescubierto(Double valor) {
		limiteDescubierto = valor;
	}
}
