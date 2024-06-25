package com.roberta.ibanco.conta;

import com.roberta.ibanco.Cliente;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public Conta() {

	}

	@Override
	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente ou valor inválido.");
		}
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Valor de depósito inválido.");
		}
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (contaDestino != null && valor > 0) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Valor ou conta de destino inválida.");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
