package br.com.Exercicios;

import java.util.Scanner;


public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		float weight = scanner.nextFloat();
		System.out.print("Digite sua altura em metros: ");
		float height = scanner.nextFloat();
		scanner.close();

		float resultIMC = weight / (height * height);

		if (resultIMC < 18.5)
			System.out.printf("Você esta abaixo do peso! Seu IMC é %.1f \n", resultIMC);
		if (resultIMC > 18.5 && resultIMC < 25)
			System.out.printf("Você esta no peso ideial! Seu IMC é %.1f \n", resultIMC);
		if (resultIMC > 25 && resultIMC < 30)
			System.out.printf("Você esta levemente acima do peso! Seu IMC é %.1f \n", resultIMC);
		if (resultIMC > 30 && resultIMC < 35)
			System.out.printf("Obesidade Grau I! Seu IMC é %.1f \n", resultIMC);
		if (resultIMC > 35 && resultIMC < 40)
			System.out.printf("Obesidade Grau II (Severa)! Seu IMC é %.1f \n", resultIMC);
		if (resultIMC > 40)
			System.out.printf("Obesidade Grau III (Morbida)! Seu IMC é %.1f \n", resultIMC);

	}
}
