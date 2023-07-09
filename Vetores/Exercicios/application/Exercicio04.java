package application;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		int[] vet = new int[n];

		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		
		int cont = 0;
		
		for (int i=0; i<n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				cont ++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + cont);

		sc.close();

	}

}