package com.stefanini.hackathon.rest;

import javax.persistence.EntityManager;

import com.stefanini.hackathon.rest.entity.Pessoa;
import com.stefanini.hackathon.rest.persistence.ConnectorBD;

public class Main {

	public static void main(String[] args) {
		System.out.println("run");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Leonardo");
		pessoa.setCpf("02188477955");

		System.out.println(pessoa);

		// consegue a entity manager
		EntityManager em = new ConnectorBD().getEntityManager();

		// abre transacao
		em.getTransaction().begin();

		// persiste o objeto
		em.persist(pessoa);

		// commita a transacao
		em.getTransaction().commit();

		// fecha a entity manager
		em.close();
	}

}
