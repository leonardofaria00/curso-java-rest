package com.stefanini.hackathon.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/conta")
@Produces(MediaType.APPLICATION_JSON)
public class ContaAPI {

	@Inject
	RepositorioConta repositorioConta;

	@Inject
	Repositorio repositorio;

	@GET
	public Response consultar() {
		System.out.println("Acesso na tela Conta");
		return Response.ok(repositorioConta.getMapConta()).build();
	}

	@POST
	public Response inserir(Pessoa pessoa) {
		System.out.println("Salvando conta: " + pessoa);
//		repositorioConta.getMapConta().put(pessoa.getConta().getId(), pessoa);
		repositorio.getMapPessoa().put(pessoa.getConta().getId(), pessoa);
		return Response.ok().build();
	}

}
