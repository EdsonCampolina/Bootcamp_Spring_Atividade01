package com.atividadeUm.atividadeUm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atividadeUm.atividadeUm.dto.ClientDTO;
import com.atividadeUm.atividadeUm.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		return repository.findAll().stream().map(x -> new ClientDTO(x)).toList();
	}

}
