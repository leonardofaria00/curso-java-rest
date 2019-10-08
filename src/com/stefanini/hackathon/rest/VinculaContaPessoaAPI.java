package com.stefanini.hackathon.rest;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/associar")
@Produces(MediaType.APPLICATION_JSON)
public class VinculaContaPessoaAPI {

	@Inject
	Repositorio repositorio;

	@POST
	public void vinculaDados() {
		System.out.println("vinculando dados");
		System.out.println("Conta: ");
		System.out.println("Pessoa: ");
	}
}
