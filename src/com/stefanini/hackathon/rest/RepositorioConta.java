package com.stefanini.hackathon.rest;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

@Singleton
public class RepositorioConta {

	private Map<String, Conta> mapConta = new HashMap<>();

	public Map<String, Conta> getMapConta() {
		return mapConta;
	}
}
