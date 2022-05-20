package libro.cap01;

import java.util.Scanner;

public class HolaMundoNombre {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		int edad;
		double estatura;
		
		System.out.print("Dame tu nombre: ");
		nombre = scanner.nextLine();
		
		System.out.print("Dame tu edad: ");
		edad = scanner.nextInt();
		
		System.out.print("Dame tu estatura: ");
		estatura = scanner.nextDouble();
		
		System.out.println("Nombre: " + nombre
							+ "\nEdad: " + edad
							+ "\nEstatura: " + estatura);
	}

}
