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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.hackathon.rest.entity.Pessoa;
import com.stefanini.hackathon.rest.exception.NegocioException;
import com.stefanini.hackathon.rest.parcers.PessoaParser;
import com.stefanini.hackathon.rest.persistence.Repositorio;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
public class PessoaAPI {

	@Inject
	Repositorio repositorio;

	@GET
	public Response consultar() throws NegocioException {

		if (repositorio.getMapPessoa().isEmpty()) {
			System.out.println("Nao existe usuario cadastrado!");
			throw new NegocioException("Nao existe usuario cadastrado!");
		}

		System.out.println("Listando pessoas");
		return Response.ok(new PessoaParser().toMapDTO(repositorio.getMapPessoa())).build();
	}

	@GET
	@Path("/{cpf}")
	public Response consultaPessoaPorCPF(@PathParam("cpf") String cpf) {
		System.out.println("Buscando pessoa com CPF: " + cpf);
		Pessoa p = repositorio.getMapPessoa().get(cpf);
		System.out.println("Pessoa: " + p.getNome());
		return Response.ok(p).build();
	}

	@POST
	public Response inserir(Pessoa pessoa) throws NegocioException {

		if (repositorio.getMapPessoa().get(pessoa.getCpf()) != null) {
			System.out.println("CPF ja cadastrado");
			throw new NegocioException("CPF ja cadastrado!");
		}

		System.out.println("Salvando: " + pessoa.getNome());
		repositorio.getMapPessoa().put(pessoa.getCpf(), pessoa);
		return Response.ok(new PessoaParser().toMapDTO(repositorio.getMapPessoa())).build();
	}

	@POST
	@Path("/multi")
	public Response inserir(List<Pessoa> listaPessoa) {
		listaPessoa.forEach(pessoa -> {
			System.out.println("Salvando: " + pessoa.getNome());
			repositorio.getMapPessoa().put(pessoa.getCpf(), pessoa);
		});
		return Response.ok(new PessoaParser().toMapDTO(repositorio.getMapPessoa())).build();
	}

	@PUT
	@Path("/{cpf}")
	public Response alterar(Pessoa pessoa, @PathParam("cpf") String cpf) {
		pessoa.setCpf(cpf);
		System.out.println("Alterando: " + pessoa);
		repositorio.getMapPessoa().put(pessoa.getCpf(), pessoa);
		return Response.ok(new PessoaParser().toMapDTO(repositorio.getMapPessoa())).build();
	}

	@DELETE
	public Response excluir2(@QueryParam("cpf") String cpf) {
		System.out.println("Removendo QueryParam: " + cpf);
		repositorio.getMapPessoa().remove(cpf);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{cpf}")
	public Response excluir(@PathParam("cpf") String cpf) {
		System.out.println("Removendo PathParam: " + cpf);
		repositorio.getMapPessoa().remove(cpf);
		return Response.ok().build();
	}

}
