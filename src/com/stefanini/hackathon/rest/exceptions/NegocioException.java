package com.stefanini.hackathon.rest.exceptions;

public class NegocioException extends Exception {

	public NegocioException(final String mensagem) {
		super(mensagem);// lança a mensagem de erro para a classe Exception
	}

	public NegocioException(final Throwable t) {
		super(t);// lança a mensagem de erro para a classe Throwable
	}

	public NegocioException(final String mensagem, final Throwable t) {
		super(mensagem, t);
	}
}