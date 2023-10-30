package com.atividadeUm.atividadeUm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atividadeUm.atividadeUm.dto.ClientDTO;
import com.atividadeUm.atividadeUm.entities.Client;
import com.atividadeUm.atividadeUm.exceptions.EntityNotFoundException;
import com.atividadeUm.atividadeUm.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		return repository.findAll().stream().map(x -> new ClientDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity =  obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new ClientDTO(entity);
	}

}
