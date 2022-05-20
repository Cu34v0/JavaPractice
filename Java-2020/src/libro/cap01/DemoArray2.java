package libro.cap01;

import java.util.Scanner;

public class DemoArray2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v;
		
		String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", 
						 "Sabado", "Domingo"};
		
		System.out.print("Ingrese un día de la semana: ");
		v = scanner.nextInt();
		
		if (v <= dias.length) {
			System.out.println(dias[v-1]);
		}else {
			System.out.println("Día incorrecto...");
		}
	}

}
