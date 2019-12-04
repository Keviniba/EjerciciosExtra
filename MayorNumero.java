import java.util.Scanner;
public class MayorNumero {
	public static void main (String[] args) {
		int num1, num2, num3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		num1=scanner.nextInt();
		System.out.println("Ingresa el segundo numero");
		num2=scanner.nextInt();
		System.out.println("Ingresa el tercer numero");
		num3=scanner.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("El numero mas grande es:" +num1);
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("El numero mas grande es:" +num2);
		}
		else if (num3>num1 && num3>num2) {
			System.out.println("El numero mas grande es:" +num3);
		}
		else {
			System.out.println("Hay dos o mas numeros con el mismo valor");
		}
	}
}
