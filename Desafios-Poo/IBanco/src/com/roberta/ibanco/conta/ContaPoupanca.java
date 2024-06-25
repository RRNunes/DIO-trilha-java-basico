package com.roberta.ibanco.conta;

import com.roberta.ibanco.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato com.roberta.ibanco.conta.Conta Poupanca ===");
		super.imprimirInfosComuns();
	}
}
    

