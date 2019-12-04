//  Para el ejercicio extra 4 cree un ejemplo donde desde
// 	la clase main se manda a llamar un constructor y un metodo 
//  en la clase main que es esta 
public class Extra4Main {
	public static void main (String[]args) {
		
//		Instanciando objeto cuenta
		Cuenta cuenta1 = new Cuenta("Kevin Ibarra", 1, 3500.00);
		
		System.out.println(cuenta1.getBalance());
		
	}
}
