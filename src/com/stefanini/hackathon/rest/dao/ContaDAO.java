package com.stefanini.hackathon.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.stefanini.hackathon.rest.entity.Conta;

public class ContaDAO {

	@PersistenceContext
	private EntityManager manager;

	public void salvar(Conta conta) {
		if (conta.getId() == null)
			manager.persist(conta);
		else
			manager.merge(conta);
	}

	public List<Conta> getcontas() {
		return manager.createQuery("SELECT c FROM conta c WHERE status=1 ORDER BY id", Conta.class).getResultList();
	}

	public Conta getContaPorId(Conta conta) {
		return manager.find(Conta.class, conta.getId());
	}

	public void remover(Conta conta) {
		Conta contaPorId = getContaPorId(conta);
		manager.remove(contaPorId);
	}
}
