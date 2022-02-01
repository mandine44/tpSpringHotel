package dev.hotel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import dev.hotel.entite.Client;
import dev.hotel.entite.Reservation;
import dev.hotel.services.ClientService;
import dev.hotel.services.ReservationService;

@RestController
@RequestMapping("clients")
public class ClientCtrl {
	
	private ClientService clientService;
	//private ReservationService reservationService;
	
	/*public ClientCtrl(ClientService clientService, ReservationService reservationService) {
		super();
		this.clientService=clientService;
		this.reservationService=reservationService;
		}*/
	public ClientCtrl(ClientService clientService) {
		super();
		this.clientService=clientService;
		}

	@GetMapping
    public Page<Client> lister(@RequestParam int start, @RequestParam int size ) {
        return this.clientService.listerClients(start, size);
    }

	@GetMapping(path = "parnumero/{id}")
	public ResponseEntity<?> trouverClientparNumero(@PathVariable int id)
	{		
		Optional <Client> unClient=this.clientService.clientRep.findById(id);
		if (unClient.isPresent()) {return ResponseEntity.status(200).body(unClient);
					}
		else {return ResponseEntity.status(404).body("pas de client trouvé");}
	}
	
	@PostMapping 
	public ResponseEntity<?> creerClientparNumero(@RequestBody Client client){
		return this.clientService.creerClientJson(client);
	}
	/*
	@PostMapping("reservations")
	public ResponseEntity<?> creerReservation(@RequestBody Reservation reservation){
		return this.reservationService.creerReservationJson(reservation); 
}*/
}
