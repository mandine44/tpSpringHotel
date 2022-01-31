package dev.paie.exec;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Scanner;

import dev.paie.entite.Periode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entite.BulletinSalaire;
import dev.paie.entite.Entreprise;
import dev.paie.entite.RemunerationEmploye;
import dev.paie.repository.BulletinRepository;
import dev.paie.repository.RemunerationRepository;



@Profile("InsererBulletin")
@Controller
public class InsererBulletin implements CommandLineRunner{

	private BulletinRepository bulletinRepository;
	private RemunerationRepository remunerationRepository;
	private Scanner scanner;

	public InsererBulletin(BulletinRepository bulletinRepository, RemunerationRepository remunerationRepository, Scanner scanner) {
		super();
		this.bulletinRepository = bulletinRepository;
		this.remunerationRepository=remunerationRepository;
		this.scanner = scanner;
	}

	@Override
	public void run(String... args) throws Exception {
		BulletinSalaire bulletinSalaire = new BulletinSalaire();
		
		System.out.println("Quel est l'id de la remuneration employe?");
		int idRemEmploye= scanner.nextInt();

		RemunerationEmploye remunerationEmploye = new RemunerationEmploye();
		remunerationEmploye.setId(idRemEmploye);
		bulletinSalaire.setRemunerationEmploye(remunerationEmploye);

		System.out.println("Quel est l'id de la période ?");
		int idPeriode = scanner.nextInt();
		Periode periode = new Periode();
		periode.setId(idPeriode);
		bulletinSalaire.setPeriode(periode);

		bulletinSalaire.setPrimeExceptionnelle(new BigDecimal("100.0"));

		this.bulletinRepository.save(bulletinSalaire);
	}
	
}
