package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Component
@Profile("lister")
public class ListerProchainesMissionsParTJM implements CommandLineRunner {

	@Autowired
	private MissionRepository missionRepository;
	
	//filtrage des dates et affichage
	private void afficher(List<Mission> missions){
		missions.stream()
			.filter(x -> x.getDateDebut().isAfter(LocalDate.now()))
			.forEach(System.out::println);
	}
	
	// avec Query JPQL
	private void afficherV1(BigDecimal taux) {
		this.afficher(this.missionRepository.selectMissionsTauxSuperieur(taux));
	}
	
	// avec requête dynamique
	private void afficherV2(BigDecimal taux) {
		this.afficher(this.missionRepository.findByTauxJournalierGreaterThanEqual(taux));
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n");
		this.afficherV1(new BigDecimal("150.00"));
		System.out.println("\n");
		this.afficherV2(new BigDecimal("150.00"));
		
	}

}
