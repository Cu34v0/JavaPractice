package libro.cap02.fechas;

import java.util.Scanner;

public class TestFecha3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese fecha1 (dia, mes, anio): ");
		int dia = scanner.nextInt();
		int mes = scanner.nextInt();
		int anio = scanner.nextInt();

		Fecha f1 = new Fecha(dia, mes, anio);

		System.out.print("Ingrese fecha2 (dia, mes, anio): ");
		dia = scanner.nextInt();
		mes = scanner.nextInt();
		anio = scanner.nextInt();

		Fecha f2 = new Fecha(dia, mes, anio);

		System.out.println("Fecha 1 = " + f1);
		System.out.println("Fecha 2 = " + f2);

		if (f1.equals(f2)) {
			System.out.println("Son iguales!");
		} else {
			System.out.println("Son diferentes!");
		}

	}

}
