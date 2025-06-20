package br.com.Exercicios;

import java.util.Scanner;

public class ComparaIdade {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String name = scanner.next();
		System.out.print("Digite sua idade: ");
		int age = scanner.nextInt();

		System.out.print("Digite seu nome: ");
		String name1 = scanner.next();
		System.out.print("Digite sua idade: ");
		int age1 = scanner.nextInt();

		if (age > age1) {
			int diferenca = age - age1;
			System.out.printf("%s é mais velho(a) que %s, com uma diferença de %d anos de idade%n", name, name1, diferenca);
		} else {
			int diferenca = age1 - age;
			System.out.printf("%s é mais velho(a) que %s, com uma diferença de %d anos de idade%n", name1, name, diferenca);
		}

	}
}
