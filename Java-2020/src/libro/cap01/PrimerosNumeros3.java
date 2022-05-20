package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v;
		
		System.out.print("Ingrese un valor: ");
		v = scanner.nextInt();
		
		for (int i = 1; i <= v ; i++) {
			System.out.println(i);
		}
	}

}
