package libro.cap01;

import java.util.Scanner;

public class EsMayorQue21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int edad;
		
		
		System.out.print("Dame tu edad: ");
		edad = scanner.nextInt();
		
		if (edad >= 21) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
		
		
		
	}

}
