package com.stefanini.hackathon.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.stefanini.hackathon.rest.entity.Pessoa;

public class PessoaDAO {

	@PersistenceContext
	private EntityManager manager;

	public void salvar(Pessoa pessoa) {
		if (pessoa.getId() == null)
			manager.persist(pessoa);
		else
			manager.merge(pessoa);
	}

	public List<Pessoa> getPessoas() {
		return manager.createQuery("SELECT p FROM pessoa p WHERE status=1 ORDER BY id", Pessoa.class).getResultList();
	}

	public Pessoa getPessoaPorId(Pessoa pessoa) {
		return manager.find(Pessoa.class, pessoa.getId());
	}

	public void remover(Pessoa pessoa) {
		Pessoa pessoaPorId = getPessoaPorId(pessoa);
		manager.remove(pessoaPorId);
	}
}
