package com.roberta.ibanco;

import com.roberta.ibanco.conta.Conta;
import com.roberta.ibanco.conta.ContaCorrente;
import com.roberta.ibanco.conta.ContaPoupanca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		Cliente cliente = new Cliente();

		System.out.println("=====BEM VINDO AO IBanco!=====");
		System.out.println("Digite seu nome:");
		String nome = leitor.nextLine();
		cliente.setNome(nome);

		Conta conta = null;

		do {
			System.out.println("============ MENU ============");
			System.out.println("=====Escolha uma opcao...=====");
			System.out.println("------------------------------");
			System.out.println("| 1- CONTA CORRENTE       |");
			System.out.println("| 2- CONTA POUPANÇA       |");
			System.out.println("| 3- SACAR                |");
			System.out.println("| 4- DEPOSITAR            |");
			System.out.println("| 5- IMPRIMIR EXTRATO0    |");
			System.out.println("| 0- FINALIZAR            |");
			System.out.println("------------------------------");
			opcao = leitor.nextInt();

			switch (opcao) {
				case 1:
					conta = new ContaCorrente(cliente);
					System.out.println("Conta Corrente criada.");
					conta.imprimirInfosComuns();
					break;

				case 2:
					conta = new ContaPoupanca(cliente);
					System.out.println("Conta Poupança criada.");
					conta.imprimirInfosComuns();
					break;

				case 3:
					if (conta == null) {
						System.out.println("Crie uma conta primeiro.");
					} else {
						System.out.println("Digite o valor para sacar: R$ ");
						double valorSaque = leitor.nextDouble();
						conta.sacar(valorSaque);
						conta.imprimirInfosComuns();
					}
                    break;

				case 4:
					if (conta == null) {
						System.out.println("Crie uma conta primeiro.");
					} else {
						System.out.println("Digite o valor para depositar: R$ ");
						double valorDeposito = leitor.nextDouble();
						conta.depositar(valorDeposito);
						conta.imprimirInfosComuns();
					}
					break;

				case 5:
					if (conta == null) {
					System.out.println("Crie uma conta primeiro.");
				} else {
					conta.imprimirInfosComuns();
				}
					break;

				case 6:
					cliente = new Cliente();
					cliente.setNome(nome);
					Conta pp = new ContaPoupanca(cliente);
					pp.imprimirInfosComuns();
					break;

				case 0:
					System.out.println("Finalizando...");


				default:
					System.out.println("Digite apenas numero 1 ou numero 2");

			}
			
		} while ( opcao != 0);
		leitor.close();
	}
}