package com.stefanini.hackathon.rest.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectorBD {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("stefanini");

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void close(EntityManager em) {
		em.close();
	}

}
