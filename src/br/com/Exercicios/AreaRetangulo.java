package br.com.Exercicios;

import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a base do Retângulo: ");
		int baseRetangulo = scanner.nextInt();

		System.out.print("Digite a altura do Retângulo: ");
		int alturaRetangulo = scanner.nextInt();

		int resultado = baseRetangulo * alturaRetangulo;

		System.out.printf("A área do retângulo é: %d %n", resultado);
	}
}
