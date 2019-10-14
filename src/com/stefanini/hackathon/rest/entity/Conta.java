package com.stefanini.hackathon.rest.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity(name = "conta")
public class Conta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String agencia;
	private String conta;
	private String senha;

	public Conta() {
		// Generated COnstructor by CDI
	}

	public Conta(String id) {
		this.id = id;
	}

	public Conta(String agencia, String conta) {
		this.agencia = agencia;
		this.conta = conta;
	}

	public Conta(String id, String agencia, String conta, String senha) {
		this.id = id;
		this.agencia = agencia;
		this.conta = conta;
		this.senha = senha;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
		return "Conta [id: " + id + ", agencia: " + agencia + ", conta: " + conta + ", senha: " + senha + "]";
	}

}
