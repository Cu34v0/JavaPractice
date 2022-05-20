package libro.cap02.fechas;
import java.util.Scanner;

public class TestFecha4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese Fecha (dd/mm/aaaa): ");
		
		String sFecha = scanner.next();
		
		Fecha f = new Fecha(sFecha);
		
		System.out.println("La fecha ingresada es: " + f);
		
		System.out.print("Ingrese días a sumar (puede ser negativo): ");
		
		int diasSum = scanner.nextInt();
		
		f.addDias(diasSum);
		
		System.out.println("Sumando " + diasSum + " días, queda: " + f);
	}

}
