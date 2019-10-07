package com.stefanini.hackathon.rest.model;

public class Conta {
	private String agencia;
	private String conta;
	private String senha;

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Conta [agencia: " + agencia + ", conta: " + conta + ", senha: " + senha + "]";
	}

}
