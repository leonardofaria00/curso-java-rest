package com.stefanini.hackathon.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
public class PessoaAPI {

	@Inject
	Repositorio repositorio;

	@GET
	public Response consultar() {
		System.out.println("Acesso na tela de pessoas");
		return Response.ok(repositorio.getMapPessoa()).build();
	}

	@POST
	public Response inserir(Pessoa pessoa) {
		System.out.println("Salvando: " + pessoa);
		repositorio.getMapPessoa().put(pessoa.getCpf(), pessoa);
		return Response.ok().build();
	}

	@PUT
	@Path("/{cpf}")
	public Response alterar(Pessoa pessoa, @PathParam("cpf") String cpf) {
		System.out.println("Alterando: " + pessoa);
		pessoa.setCpf(cpf);
		repositorio.getMapPessoa().put(pessoa.getCpf(), pessoa);
		return Response.ok().build();
	}

	@DELETE
	public Response excluir(@QueryParam("cpf") String cpf) {
		System.out.println("Removendo QueryParam: " + cpf);
		repositorio.getMapPessoa().remove(cpf);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{cpf}")
	public Response excluir2(@PathParam("cpf") String cpf) {
		System.out.println("Removendo PathParam: " + cpf);
		repositorio.getMapPessoa().remove(cpf);
		return Response.ok().build();
	}

}
