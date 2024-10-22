package ejercicios.objetos;

public class CuentaBancaria {
	private int saldo;
	private String titular;
	private int nroCuenta;
	
	public void mostrarDatosCuenta() {
		System.out.println(getTitular()+" es titular de la cuenta número "+ getNroCuenta()
							+" y posee un saldo de "+ getSaldo());
	}
	
	public void mostrarDeudor() {
		int saldo = getSaldo();
		if(saldo < 0) {
			System.out.println("Es deudor y debe regularizar sus pagos de los préstamos solicitados");
		}
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	
	
	
}
