package com.larissa.clients.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.larissa.clients.dtos.ClientDTO;
import com.larissa.clients.entities.Client;
import com.larissa.clients.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public Page<ClientDTO> findAllPaged (PageRequest pageRequest){
		Page<Client> page = repository.findAll(pageRequest);
		
		return page.map(x -> new ClientDTO(x));
	}
}
