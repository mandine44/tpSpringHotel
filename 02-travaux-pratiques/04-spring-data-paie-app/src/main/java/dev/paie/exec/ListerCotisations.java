package dev.paie.exec;

import dev.paie.entite.Cotisation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.repository.CotisationRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Profile("ListerCotisations")
@Controller
public class ListerCotisations implements CommandLineRunner {

	
	private CotisationRepository cotisationRepository;

	public ListerCotisations(CotisationRepository cotisationRepository) {
		super();
		this.cotisationRepository = cotisationRepository;
	}
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// tx.begin()
		List<Cotisation> cotisations = cotisationRepository.findAll();

		// cotisations => persistants

		for (Cotisation cotisation: cotisations) {
			System.out.println(cotisation.getCode());
			System.out.println( cotisation.getProfilRemunerations().size());
			System.out.println("----");
		}

		// tx.commit()
	}
}
