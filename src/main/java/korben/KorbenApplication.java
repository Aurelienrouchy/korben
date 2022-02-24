package korben;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class KorbenApplication {

	public static void main(String[] args) {
		SpringApplication.run(KorbenApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(Studentrepository repository) {
		return args -> {
			Address address = new Address(
					"France",
					"75010",
					"Paris"
			);
			Student student = new Student(
					"Aurelien",
					"Rouchy",
					"rouchy.aurelien@gmail.com",
					Gender.MALE,
					address,
					List.of("Computer Science"),
					BigDecimal.TEN,
					LocalDateTime.now()
			);

			repository.insert(student);
		};
	}
}
