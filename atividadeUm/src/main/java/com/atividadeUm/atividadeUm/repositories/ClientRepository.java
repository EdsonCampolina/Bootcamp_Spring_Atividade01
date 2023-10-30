package com.atividadeUm.atividadeUm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividadeUm.atividadeUm.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
