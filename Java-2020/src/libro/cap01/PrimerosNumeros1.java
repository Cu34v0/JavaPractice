package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1, v;
		
		System.out.print("Ingrese un valor: ");
		v = scanner.nextInt();
		
		while (i <= v) {
			System.out.println(i);
			i++;
		}
		
	}

}
