package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		
		for (int i=0; i<vet.length; i++) {
			System.out.printf("%.1f ", vet[i]);
		}
		
		double soma = 0.0;
		for (int i=0; i<vet.length; i++) {
			soma += vet[i];
		}
		
		System.out.printf("%nSOMA = %.2f%n", soma);
		
		double media = soma / n;
		
		System.out.printf("MÉDIA = %.2f%n", media);
		
		sc.close();

	}

}