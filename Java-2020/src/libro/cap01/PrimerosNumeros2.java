package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, i = 1;
		
		System.out.print("Ingrese un número: ");
		n = scanner.nextInt();
		
		do {
			System.out.println(i);
			i++;
		} while (i <= n);
		
	}

}
