package com.stefanini.hackathon.rest.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.stefanini.hackathon.rest.entity.Pessoa;

@Transactional
public class PessoaDao {

	@PersistenceContext(unitName = "bancoHackatonUnit")
	private EntityManager manager;

	public void salvar(Pessoa pessoa) {
		if (pessoa.getId() == null)
			manager.persist(pessoa);
		else
			manager.merge(pessoa);
	}

	public List<Pessoa> getPessoas() {
		return manager.createQuery("SELECT p FROM pessoa p ORDER BY id", Pessoa.class).getResultList();
	}

	public Pessoa getPessoaPorId(Pessoa pessoa) {
		return manager.find(Pessoa.class, pessoa.getId());
	}

	public void remover(Pessoa pessoa) {
		Pessoa id = getPessoaPorId(pessoa);
		manager.remove(id);
	}

}
