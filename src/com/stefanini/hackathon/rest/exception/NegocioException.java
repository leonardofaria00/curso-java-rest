package com.stefanini.hackathon.rest.exception;

public class NegocioException extends Exception {

	private static final long serialVersionUID = 1L;

	public NegocioException(final String mensagem) {
		super(mensagem);// lança a mensagem de erro para a classe Exception
	}

	public NegocioException(final Throwable error) {
		super(error);// lança a mensagem de erro para a classe Throwable
	}

	public NegocioException(final String mensagem, final Throwable error) {
		super(mensagem, error);
	}
}