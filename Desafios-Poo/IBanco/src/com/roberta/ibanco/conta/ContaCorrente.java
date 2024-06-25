package com.roberta.ibanco.conta;

import com.roberta.ibanco.Cliente;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public ContaCorrente() {
		super();
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato com.roberta.ibanco.conta.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
    

