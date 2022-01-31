package dev.paie.exec;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entite.Grade;
import dev.paie.repository.GradeRepository;

@Profile("InsererGrade")
@Controller
public class InsererGrade implements CommandLineRunner {

	private GradeRepository gradeRepository;

	public InsererGrade(GradeRepository gradeRepository) {
		super();
		this.gradeRepository = gradeRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Grade grade = new Grade();
		grade.setCode("D001");
		grade.setNbHeuresBase(BigDecimal.valueOf(152.56));
		grade.setTauxBase(BigDecimal.valueOf(41.09));
				
		this.gradeRepository.save(grade);
	}
}
