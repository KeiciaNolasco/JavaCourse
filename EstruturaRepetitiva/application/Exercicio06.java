package application;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (2.0 * a + 3.0 * b + 5.0 * c) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
		
	}

}