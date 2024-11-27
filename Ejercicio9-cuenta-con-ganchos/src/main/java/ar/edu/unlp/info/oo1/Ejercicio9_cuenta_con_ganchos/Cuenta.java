package ar.edu.unlp.info.oo1.Ejercicio9_cuenta_con_ganchos;

public abstract class Cuenta {
	private Double saldo;
	
	public Cuenta() {
		this.saldo = 0d;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(Double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControlar(Double monto) {
		this.saldo -= monto;
	}
	
	public Boolean extraer(Double monto) {
		if(puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public Boolean transferirACuenta(Double monto, Cuenta cuentaDestino) {
		if(puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	public abstract Boolean puedeExtraer(Double monto);
}
