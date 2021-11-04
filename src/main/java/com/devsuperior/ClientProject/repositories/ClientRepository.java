package com.devsuperior.ClientProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ClientProject.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
