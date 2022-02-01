package dev.hotel.services;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dev.hotel.entite.Client;
import dev.hotel.entite.Reservation;
import dev.hotel.repository.ReservationRepository;

@Service
public class ReservationService {

	private ReservationRepository reservationRepository;
	
	public ReservationService(ReservationRepository reservationRepository) {
		super();
		this.reservationRepository=reservationRepository;
	}
	
	/*
	public ResponseEntity<?> creerReservationJson(Reservation reservation) {
		
		Optional <Client> unClient=this.reservationRepository.clientRep.findById(id);
		if (reservation.getClient() != null) {
			
			
			
			this.reservationRepository.save(reservation);
			return (ResponseEntity.status(200).body(reservation));
		} else {
			return (ResponseEntity.status(404).body("Client non trouvé"));
		}
		

	}*/
	}


