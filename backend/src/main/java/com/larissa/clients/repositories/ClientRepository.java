package com.larissa.clients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.larissa.clients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
