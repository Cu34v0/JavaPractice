package libro.cap01;

import java.util.Iterator;
import java.util.Scanner;

public class DemoArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int v;
		int arr[] = new int [10];
		
		while(i<10) {
			System.out.print("Ingrese el valor #" + (i+1) +": ");
			v = scanner.nextInt();
			
			arr[i] = v;
			i++;
		}
		
		System.out.println("Estos son los datos que ingreso");
		
		for (int j = 0; j < 10; j++) {
			System.out.println(arr[j]);
		}
		
		
		
			
	}

}
