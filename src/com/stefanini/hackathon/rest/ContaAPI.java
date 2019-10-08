package com.stefanini.hackathon.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/conta")
@Produces(MediaType.APPLICATION_JSON)
public class ContaAPI {

	@Inject
	Repositorio repositorio;

	@GET
	public Response consultar() {
		System.out.println("Listando contas");
		return Response.ok(repositorio.getMapConta()).build();
	}

	@GET
	@Path("/{id}")
	public Response consultaContaPorId(@PathParam("id") String id) {
		System.out.println("Buscando conta com Id: " + id);
		Conta c = repositorio.getMapConta().get(id);
		System.out.println("Conta: " + c);
		return Response.ok().build();
	}

	@POST
	public Response inserir(Conta conta) {
		System.out.println("Salvando conta: " + conta);
		repositorio.getMapConta().put(conta.getId(), conta);
		return Response.ok().build();
	}

	@PUT
	@Path("/{id}")
	public Response alterar(Conta conta, @PathParam("id") String id) {
		System.out.println("Alterando: " + conta);
		repositorio.getMapConta().put(conta.getId(), conta);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{id}")
	public Response excluir(@PathParam("id") String id) {
		System.out.println("Removendo Conta id: " + id);
		repositorio.getMapConta().remove(id);
		return Response.ok().build();
	}

}
