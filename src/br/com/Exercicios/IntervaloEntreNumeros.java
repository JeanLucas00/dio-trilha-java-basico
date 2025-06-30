package br.com.Exercicios;

import java.util.Scanner;

public class IntervaloEntreNumeros {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int firstNumber = scanner.nextInt();
		System.out.printf("Digite um numero maior que %s : ", firstNumber);
		int secondNumber = scanner.nextInt();
		System.out.print("Digite 1 para numero impar e 2 para numero par: ");
		int userChoice = scanner.nextInt();

		//testa se o numero inicial é par ou impar
		boolean testNumber = firstNumber % 2 == 0;

		//caso o numero inicial seja par
		if (testNumber) {
			if (userChoice == 1){
				firstNumber = firstNumber + 1;
				while (firstNumber <= secondNumber) {
					System.out.println(firstNumber);
					firstNumber = firstNumber + 2;
				}
			} else if (userChoice == 2) {
				while (firstNumber <= secondNumber) {
					System.out.println(firstNumber);
					firstNumber = firstNumber + 2;
				}
			}

			//caso o numero inicial seja impar
		} else {
			if (userChoice == 1) {
				while (firstNumber <= secondNumber) {
					System.out.println(firstNumber);
					firstNumber = firstNumber + 2;
				}
			} else if (userChoice == 2) {
				firstNumber = firstNumber +1;
				while (firstNumber <= secondNumber) {
					System.out.println(firstNumber);
					firstNumber = firstNumber + 2;

				}
			}
		}
	}
}
