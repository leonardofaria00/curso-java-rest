package com.stefanini.hackathon.rest.api;

import java.util.List;

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

import com.stefanini.hackathon.rest.entity.Conta;
import com.stefanini.hackathon.rest.entity.Pessoa;
import com.stefanini.hackathon.rest.exceptions.NegocioException;
import com.stefanini.hackathon.rest.parcers.ContaParser;
import com.stefanini.hackathon.rest.persistence.Repositorio;

@Path("/conta")
@Produces(MediaType.APPLICATION_JSON)
public class ContaAPI {

	@Inject
	Repositorio repositorio;

	@GET
	public Response consultar() throws NegocioException {

		if (repositorio.getMapConta().isEmpty()) {
			System.out.println("Nao existe conta cadastrada!");
			throw new NegocioException("Nao existe conta cadastrada!");
		}
		System.out.println("Listando contas");
		return Response.ok(new ContaParser().toMapDTO(repositorio.getMapConta())).build();
	}

	@GET
	@Path("/{id}")
	public Response consultaContaPorId(@PathParam("id") Integer id) {
		System.out.println("Buscando conta com Id: " + id);
		Conta c = repositorio.getMapConta().get(id);
		System.out.println("Conta: " + c);
		return Response.ok(repositorio.getMapConta().get(id)).build();
	}

	@Path("/{agencia}/{conta}")
	public Response consultar(@PathParam("agencia") String nrAgencia, @PathParam("conta") String nrConta) {
		return Response.ok().build();
	}

	@POST
	public Response inserir(Conta conta) throws NegocioException {
		if (repositorio.getMapConta().get(conta.getId()) != null) {
			System.out.println("Conta ja cadastrada");
			throw new NegocioException("Conta ja cadastrada!");
		}

		System.out.println("Salvando: " + conta);
		repositorio.getMapConta().put(conta.getId(), conta);
		return Response.ok(repositorio.getMapConta()).build();
	}

	@POST
	@Path("/multi")
	public Response inserir(List<Conta> listaConta) {
		listaConta.forEach(conta -> {
			repositorio.getMapConta().put(conta.getId(), conta);
		});

		return Response.ok(repositorio.getMapConta()).build();
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

	@PUT
	@Path("/associar/{cpf}/{id}")
	public Response associar(@PathParam("cpf") String cpf, @PathParam("id") String id) {
		Pessoa pessoa = repositorio.getMapPessoa().get(cpf);
		Conta conta = repositorio.getMapConta().get(id);
		pessoa.setConta(conta);
		System.out.println("Associando pessoa: " + pessoa.getNome() + " com Conta: " + conta.getConta());
		System.out.println(pessoa);
		return Response.ok(repositorio.getMapPessoa()).build();
	}

}
