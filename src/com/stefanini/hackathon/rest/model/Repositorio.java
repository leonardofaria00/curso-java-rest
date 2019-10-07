package com.stefanini.hackathon.rest.model;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

@Singleton
public class Repositorio {

	private Map<String, Pessoa> mapPessoa = new HashMap<>();

	public Map<String, Pessoa> getMapPessoa() {
		return mapPessoa;
	}
}
