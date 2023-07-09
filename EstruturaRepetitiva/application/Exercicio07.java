package application;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão Impossível");
			}
			else {
				double divisao = (double) x / y;
				System.out.printf("%.1f%n", divisao);
			}
			
		}
		
		sc.close();
		
	}

}