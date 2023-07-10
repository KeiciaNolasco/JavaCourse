package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitados? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];

		for (int i=0; i<n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double maior = altura[0];
		double menor = altura[0];
		double sMulheres = 0.0;
		int nHomens = 0;

		for (int i=0; i<n; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			}
			if (altura[i] < menor) {
				menor = altura[i];
			}
			if (genero[i] == 'F') {
				sMulheres += altura[i];
			}
			else {
				nHomens ++;
			}
		}
		
		double mMulheres = sMulheres / (n - nHomens);
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Média das alturas das mulheres = %.2f%n", mMulheres);
		System.out.println("Número de homens = " + nHomens);

		sc.close();

	}

}