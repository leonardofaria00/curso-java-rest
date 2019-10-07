package com.stefanini.hackathon.rest.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/pessoa")
public class PessoaAPI {

	@GET
	public Response index() {

		return Response.ok("teste").build();
	}
}
