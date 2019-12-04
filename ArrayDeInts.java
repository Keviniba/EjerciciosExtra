import java.util.Scanner;
public class ArrayDeInts {
	public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int[] primero = new int[3];
			int[] segundo = new int[3];
	//		Pidiendo los numeros del primer arreglo
			System.out.println("Dame el primer numero del primer arreglo");
			primero[0] = scanner.nextInt();
			System.out.println("Dame el segundo numero del primer arreglo");
			primero[1] = scanner.nextInt();
			System.out.println("Dame el tercer numero del primer arreglo");
			primero[2] = scanner.nextInt();
	//		Pidiendo los numeros del segundo arreglo
			System.out.println("Dame el primer numero del segundo arreglo");
			segundo[0] = scanner.nextInt();
			System.out.println("Dame el segundo numero del segundo arreglo");
			segundo[1] = scanner.nextInt();
			System.out.println("Dame el tercer numero del segundo arreglo");
			segundo[2] = scanner.nextInt();

		System.out.println("los dos valores medios de los arreglos son: " + primero[1] +","+ segundo[1]);
		}
		
	}
