package com.stefanini.hackathon.rest.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.hackathon.rest.dtos.LoginDTO;
import com.stefanini.hackathon.rest.exception.NegocioException;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginAPI {

	@POST

	public Response login(LoginDTO dto) throws NegocioException {
		System.out.println(dto.getAgencia());
		System.out.println(dto.getConta());
		System.out.println(dto.getSenha());

		if (dto.getAgencia().equals("123")) {
			System.out.println("run");
			return Response.ok("Login efetuado com sucesso").build();

		} else {
			throw new NegocioException("Erro ao efetuar login");
		}
	}
}
