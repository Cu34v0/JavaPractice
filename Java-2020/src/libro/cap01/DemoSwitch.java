package libro.cap01;

import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v;
		String dia;
		
		System.out.print("Deme un día de la semana: ");
		v = scanner.nextInt();
		
		switch (v) {
		case 1:
			dia = "Lunes";
			break;
			
		case 2:
			dia = "Martes";
			break;
			
		case 3:
			dia = "Miercoles";
			break;
			
		case 4:
			dia = "Jueves";
			break;
			
		case 5:
			dia = "Viernes";
			break;
			
		case 6:
			dia = "Sabado";
			break;
			
		case 7:
			dia = "Domingo";
			break;

		default:
			dia = "Día incorrecto, debe ser un número del 1 al 7";
			break;
		}
		System.out.println(dia);	
	}

}
