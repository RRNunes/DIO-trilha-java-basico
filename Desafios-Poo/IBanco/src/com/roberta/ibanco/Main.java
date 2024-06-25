package com.roberta.ibanco;

import com.roberta.ibanco.conta.Conta;
import com.roberta.ibanco.conta.ContaCorrente;
import com.roberta.ibanco.conta.ContaPoupanca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		System.out.println("=====BEM VINDO AO IBanco!=====");
		System.out.println("Digite seu nome");
		String nome = leitor.nextLine();

		do {
			System.out.println("Crie sua conta...Digite 1 para CONTA CORRENTE / 2 para CONTA POUPANÇA ou 0 PARA FINALIZAR");
			opcao = leitor.nextInt();


			switch (opcao) {
				case 1:
					Cliente cliente = new Cliente();
					cliente.setNome(nome);
					Conta cc = new ContaCorrente(cliente);
					cc.imprimirInfosComuns();

					break;

				case 2:
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