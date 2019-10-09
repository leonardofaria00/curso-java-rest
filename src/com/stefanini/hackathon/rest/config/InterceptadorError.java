package com.stefanini.hackathon.rest.config;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.stefanini.hackathon.rest.exceptions.NegocioException;

@Provider
public class InterceptadorError implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception ex) {
		Status status = null;
		final StringWriter sw = new StringWriter();

		if (ex instanceof NegocioException) {
			status = Status.BAD_REQUEST;// retorn status code 400, business error

		} else {
			status = Status.INTERNAL_SERVER_ERROR;// return status code 500, server error
			ex.printStackTrace(new PrintWriter(sw));// printer stack trace the project
		}

		MensagemErro msg = new MensagemErro();
		msg.setMensagem(ex.getMessage());
		msg.setStatusCode(status.getStatusCode());
		msg.setStack(sw.toString());

		return Response.ok(msg).type(MediaType.APPLICATION_JSON).status(status.getStatusCode()).build();
	}

}
