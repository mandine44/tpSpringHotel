package dev.mission.exec;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import dev.mission.repository.MissionRepository;

@Component
@Profile("lister")
public class ListerProchainesMissions implements CommandLineRunner {
	
	@Autowired
	private MissionRepository missionRepository;
	
	private void afficher() {
		this.missionRepository
			.findAll()
			.stream()
			.filter(x -> x.getDateDebut().isAfter(LocalDate.now()))
			.forEach(System.out::println);
	}

	@Override
	public void run(String... args) throws Exception {
		this.afficher();		
	}

}
