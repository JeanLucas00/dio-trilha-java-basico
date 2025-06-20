package br.com.Desafios;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {

		//Declaração dos atributos da classe
		String nomeCliente;
		int numeroConta;
		String agenciaConta;
		double saldoConta;

		//Interação com o usuario
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o seu Nome e Sobrenome: ");
		nomeCliente = scanner.nextLine();

		System.out.println("Digite o número da Conta: ");
		numeroConta = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Digite a Agência com digito: ");
		agenciaConta = scanner.nextLine();

		System.out.println("Quanto deseja deposiatar: ");
		saldoConta = scanner.nextDouble();

		scanner.close();


		//Construindo a mensagem de saída usnado concat
		String mensagemFinal = "Olá ".concat(nomeCliente)
				.concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
				.concat(agenciaConta)
				.concat(", conta ")
				.concat(String.valueOf(numeroConta))
				.concat(" e seu saldo ")
				.concat(String.valueOf(saldoConta))
				.concat(" já está disponível para saque.");

		//
		System.out.println("\n" + mensagemFinal);



	}
}


