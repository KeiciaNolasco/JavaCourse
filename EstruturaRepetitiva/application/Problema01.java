package application;

import java.util.Scanner;

public class Problema01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int soma = 0;
		
		while (n != 0) {
			soma += n;
			n = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}