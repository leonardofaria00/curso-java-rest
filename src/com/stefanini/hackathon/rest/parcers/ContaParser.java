package com.stefanini.hackathon.rest.parcers;

import com.stefanini.hackathon.rest.dtos.ContaDTO;
import com.stefanini.hackathon.rest.entity.Conta;

public class ContaParser extends AbstracParser<Conta, ContaDTO> {

	@Override
	public Conta toEntity(ContaDTO dto) {
		Conta conta = new Conta();
		conta.setAgencia(dto.getAgencia());
		conta.setConta(dto.getConta());
		return conta;
	}

	@Override
	public ContaDTO toDTO(Conta conta) {
		ContaDTO dto = new ContaDTO();
		dto.setAgencia(conta.getAgencia());
		dto.setConta(conta.getConta());
		return dto;
	}

}
