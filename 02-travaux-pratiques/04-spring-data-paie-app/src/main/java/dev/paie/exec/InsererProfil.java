package dev.paie.exec;

import java.math.BigDecimal;
import java.util.List;

import dev.paie.entite.Cotisation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;


import dev.paie.entite.ProfilRemuneration;
import dev.paie.repository.GradeRepository;import dev.paie.repository.ProfilRepository;

@Controller
@Profile("InsererProfil")
public class InsererProfil implements CommandLineRunner {

	private ProfilRepository profilRepository;

	public InsererProfil(ProfilRepository profilRepository) {
		super();
		this.profilRepository = profilRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		ProfilRemuneration profil = new ProfilRemuneration();
		profil.setCode("apprenti");
		profil.setCotisations(List.of(
				new Cotisation(1),
				new Cotisation(10)
		));
		this.profilRepository.save(profil);
	}
}
