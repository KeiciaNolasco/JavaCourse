package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		double[] nota01 = new double[n];
		double[] nota02 = new double[n];

		for (int i=0; i<n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota01[i] = sc.nextDouble();
			nota02[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		for (int i=0; i<n; i++) {
			double media = (nota01[i] + nota02[i]) / 2.0;
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}
		}

		sc.close();

	}

}