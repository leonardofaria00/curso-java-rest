package com.stefanini.hackathon.rest.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.stefanini.hackathon.rest.entity.Pessoa;

public class ConnectorBD {

	@PersistenceContext(unitName = "bancoHackatonUnit")
	EntityManager em;
	
	public Pessoa getPessoa() {
		return em.find(Pessoa.class, 1);
		
//	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("stefanini");
//
//	public EntityManager getEntityManager() {
//		return emf.createEntityManager();
//	}
//
//	public void close(EntityManager em) {
//		em.close();
//	}
	}
}
