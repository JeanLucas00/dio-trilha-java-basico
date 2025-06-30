package br.com.Exercicios;

import java.util.Scanner;

public class ModuloNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		var number = scanner.nextInt();

		// Enquanto o modulo de dois numeros for zero continue
		while(true) {
			System.out.print("Digite um número para verificação: ");
			var toVerify = scanner.nextInt();
			if (toVerify < number) {
				System.out.printf("Digite um número maior que %s \n", number);
				continue;
			}
			var result = toVerify % number;
			System.out.printf("%s %% %s = %s ", toVerify, number, result);
			if (result != 0) break;
		}
	}
}
