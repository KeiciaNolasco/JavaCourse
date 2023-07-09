package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vet = new int[n];

		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		int soma = 0;
		int cont = 0;
		
		for (int i=0; i<n; i++) {
			if (vet[i] % 2 == 0) {
				soma += vet[i];
				cont ++;
			}
		}

		if (cont == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		}
		else {
			double media = soma / cont;
			System.out.printf("MÉDIA DOS PARES = %.1f%n", media);
		}
		
		sc.close();

	}

}