
public class Cuenta {
//	Variables
	
	private String nombre;
	private int numeroCuenta;
	private double balance;
	
//	Constructor
	public Cuenta (String initNombre, int initId, double initBalance){
		
		nombre=initNombre;
		numeroCuenta = initId;
		balance = initBalance;
		
	}
//	metodo que devuelve el balance de una cuenta
	public double getBalance() {
		return balance;
}
}
