package libro.cap01;

import java.util.Scanner;

public class ParOImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v;
		
		System.out.print("Dame un valor: ");
		v = scanner.nextInt();
		
		int resto = v%2;
		
		if (resto == 0) {
			System.out.println("Es un número par");
		}else {
			System.out.println("Es un número impar");
		}
		
	}

}
