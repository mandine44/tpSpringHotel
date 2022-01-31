package dev.mission.exec;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import dev.mission.repository.MissionRepository;

@Component
@Profile("lister")
public class ListerProchainesMissions implements CommandLineRunner {

	// Possibilités d'injection de dépendances
	// 1. Injection par champ (via @Autowired)
	// 2. Injection par constructeur (Bonne pratique)
	// 3. Injection par setter (via @Autowired)
	private MissionRepository missionRepository;

	public ListerProchainesMissions(MissionRepository missionRepository) {
		this.missionRepository = missionRepository;
	}

	private void afficher() {
		System.out.println("----- findByDateDebutAfter");
		this.missionRepository
			.findByDateDebutAfter(LocalDate.now().minusDays(1))
			.forEach(System.out::println);

		System.out.println("----- findByDateDebutGreaterThanEqual");
		this.missionRepository
				.findByDateDebutGreaterThanEqual(LocalDate.now())
				.forEach(System.out::println);

		System.out.println("----- listerMissionParDate(date)");
		this.missionRepository
				.listerMissionParDate(LocalDate.now())
				.forEach(System.out::println);

		System.out.println("----- listerMissionParDate()");
		this.missionRepository
				.listerMissionParDate()
				.forEach(System.out::println);
	}

	@Override
	public void run(String... args) throws Exception {
		this.afficher();		
	}

}
