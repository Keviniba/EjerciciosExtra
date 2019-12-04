import java.util.Scanner;
public class PuedeVotar {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int edad;
		System.out.println("Ingresa la edad de la persona");
		edad = scanner.nextInt();
		if(edad >= 18) {
			System.out.println("La persona puede votar");
			}
		else {
			System.out.println("No puede votar");
		}
		
	}
}
