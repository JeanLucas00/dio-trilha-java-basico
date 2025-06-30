package br.com.Exercicios;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		var number = scanner.nextInt();

		int i;
		System.out.printf("----TABUADA DO %s---- \n", number);
		for (i=1; i<=10; i++) {
			int result = number * i;
			System.out.printf("%s x %s = %s \n", number, i, result);
		}
	}
}
