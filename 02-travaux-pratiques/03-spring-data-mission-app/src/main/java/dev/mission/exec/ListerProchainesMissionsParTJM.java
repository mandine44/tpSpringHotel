package dev.mission.exec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import dev.mission.repository.MissionRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
@Profile("listerTJM")
public class ListerProchainesMissionsParTJM implements CommandLineRunner {

	private MissionRepository missionRepository;

	public ListerProchainesMissionsParTJM(MissionRepository missionRepository) {
		this.missionRepository = missionRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("---- findByDateDebutGreaterThanEqualAndTauxJournalierGreaterThanEqual");
		this.missionRepository.findByDateDebutGreaterThanEqualAndTauxJournalierGreaterThanEqual(
				LocalDate.now(),
				new BigDecimal("101")
		).forEach(System.out::println);

		System.out.println("---- listerProchainesMissionsParTJM");
		this.missionRepository.listerProchainesMissionsParTJM(
				LocalDate.now(),
				new BigDecimal("101")
		).forEach(System.out::println);

		
	}

}
