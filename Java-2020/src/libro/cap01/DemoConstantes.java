package libro.cap01;

import java.util.Scanner;

public class DemoConstantes {
	
	public static final int LUNES = 1;
	public static final int MARTES = 2;
	public static final int MIERCOLES = 3;
	public static final int JUEVES = 4;
	public static final int VIERNES = 5;
	public static final int SABADO = 6;
	public static final int DOMINGO = 7;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v;
		String dia;
		
		System.out.print("Ingrese un día de la semana: ");
		v = scanner.nextInt();
		
		switch (v) {
		case LUNES:
			dia = "Lunes";
			break;
			
		case MARTES:
			dia = "Martes";
			break;
			
		case MIERCOLES:
			dia = "Miercoles";
			break;
			
		case JUEVES:
			dia = "Jueves";
			break;
			
		case VIERNES:
			dia = "Viernes";
			break;
			
		case SABADO:
			dia = "Sabado";
			break;
			
		case DOMINGO:
			dia = "Domingo";
			break;

		default:
			dia = "Dia incorrecto, debe ser un numero del 1 al 7";
			break;
		}
		
		System.out.println(dia);
		
	}

}
