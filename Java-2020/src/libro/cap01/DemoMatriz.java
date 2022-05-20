package libro.cap01;

import java.util.Scanner;

public class DemoMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de filas: ");
		int n = scanner.nextInt();
		
		System.out.print("Ingrese la cantidad de columnas: ");
		int m = scanner.nextInt();
		
		int mat[][] = new int[n][m];
		
		int nro;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				nro = (int)(Math.random()*1000);
				mat[i][j] = nro;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
