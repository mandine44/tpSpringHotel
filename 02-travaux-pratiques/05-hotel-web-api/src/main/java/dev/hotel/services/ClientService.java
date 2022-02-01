package dev.hotel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import dev.hotel.entite.Client;
import dev.hotel.repository.ClientRepository;

@Service
public class ClientService {

	public ClientRepository clientRep;

	public ClientService(ClientRepository clientrep) {
		super();
		this.clientRep = clientrep;
	}

	public Page<Client> listerClients(int start, int size) {
		return this.clientRep.findAll(PageRequest.of(start, size));
	}

	@Transactional
	public ResponseEntity<?> creerClientJson(Client client) {
		if (client.getNom().length() >= 2) {
			client.setId(clientRep.findAll().size() + 1);
			client.setNumero("azdadhoa");
			this.clientRep.save(client);
			return (ResponseEntity.status(200).body(client));
		} else {
			return (ResponseEntity.status(404).body("le nom et le prenom doivent etre superieur à un caractere"));
		}

	}

}
