package dev.mission.exec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.repository.MissionRepository;

@Controller
@Profile("insert")
public class InsererMission implements CommandLineRunner {
	@SuppressWarnings("unused")
	private MissionRepository missionRepository;

	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}	

	@Override
	public void run(String... args) throws Exception {
//		Mission mission = new Mission();
//		mission.setLibelle("Mission 1");
//		mission.setTauxJournalier(new BigDecimal("100.90"));
//		mission.setDateDebut(LocalDate.of(2019, 1, 1));
//		mission.setDateFin(LocalDate.of(2019, 3, 4));
//		this.missionRepository.save(mission);
		
//		Mission m2 = new Mission("Mission 2", LocalDate.of(2023, 3, 7), LocalDate.of(2023, 6, 1), new BigDecimal("200.00"));
//		Mission m3 = new Mission("Mission 3", LocalDate.of(2024, 3, 7), LocalDate.of(2024, 6, 1), new BigDecimal("100.00"));
//		Mission m4 = new Mission("Mission 4", LocalDate.of(2025, 3, 7), LocalDate.of(2025, 6, 1), new BigDecimal("155.55"));
//		Mission m5 = new Mission("Mission 5", LocalDate.of(2026, 3, 7), LocalDate.of(2026, 6, 1), new BigDecimal("102.55"));
//		
//		this.missionRepository.save(m2);
//		this.missionRepository.save(m3);
//		this.missionRepository.save(m4);
//		this.missionRepository.save(m5);
	}
}