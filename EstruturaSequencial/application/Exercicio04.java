package application;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		double c, salary;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		salary = b * c;
		
		System.out.println("NUMBER = " + a);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
		
	}

}