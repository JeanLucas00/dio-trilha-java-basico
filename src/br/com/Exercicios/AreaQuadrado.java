package br.com.Exercicios;


import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o lado do quadrado: ");
		int ladoQuadrado = scanner.nextInt();

		int resultado = ladoQuadrado * ladoQuadrado;

		System.out.printf("A área do quadrado é: %d %n", resultado);
	}
}
