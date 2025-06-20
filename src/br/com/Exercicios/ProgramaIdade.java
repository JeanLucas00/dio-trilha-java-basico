package br.com.Exercicios;


import java.util.Scanner;

public class ProgramaIdade {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String name = scanner.next();

		System.out.print("Digite sua idade: ");
		int age = scanner.nextInt();

		System.out.printf("Olá, %s você tem %d anos de idade%n", name, age);

	}
}
