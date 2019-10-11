package com.stefanini.hackathon.rest.parcers;

import com.stefanini.hackathon.rest.dtos.PessoaDTO;
import com.stefanini.hackathon.rest.entity.Pessoa;

public class PessoaParser extends AbstracParser<Pessoa, PessoaDTO> {

	@Override
	public Pessoa toEntity(PessoaDTO dto) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(dto.getNome());
		return pessoa;
	}

	@Override
	public PessoaDTO toDTO(Pessoa pessoa) {
		PessoaDTO dto = new PessoaDTO();
		dto.setNome(pessoa.getNome());
		return dto;
	}

}
