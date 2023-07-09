package application;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i=0; i<n; i++) {
			System.out.println("Digite da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int velha = idade[0];
		int posicao = 0;
		
		for (int i=0; i<n; i++) {
			if (idade[i] > velha) {
				velha = idade[i];
				posicao = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nome[posicao]);
		
		sc.close();

	}

}