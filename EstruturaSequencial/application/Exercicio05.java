package application;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a1, a2, b1, b2;
		double c1, c2, valor;
		
		a1 = sc.nextInt();
		b1 = sc.nextInt();
		c1 = sc.nextDouble();
		a2 = sc.nextInt();
		b2 = sc.nextInt();
		c2 = sc.nextDouble();
		
		valor = (b1 * c1) + (b2 * c2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		sc.close();
		
	}

}