package com.stefanini.hackathon.rest;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

@Singleton
public class Repositorio {

	private Map<String, Pessoa> mapPessoa = new HashMap<>();

	private Map<String, Conta> mapConta = new HashMap<>();

	public Map<String, Pessoa> getMapPessoa() {
		return mapPessoa;
	}

	public Map<String, Conta> getMapConta() {
		return mapConta;
	}
}
