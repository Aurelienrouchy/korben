package korben;

import korben.provider.Provider;
import korben.provider.ProviderName;
import korben.provider.ProviderRepository;
import korben.user.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KorbenApplication {

	public static void main(String[] args) {
		SpringApplication.run(KorbenApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository) {
//		return args -> {
//			Provider provider = new Provider(
//				ProviderName.GOOGLE,
//				"1234567890",
//				"621a3f76986ecd1384e5e7d6"
//			);
//			Provider provider2 = new Provider(
//				ProviderName.GOOGLE,
//				"12345",
//				"621a3fc45b72cf7e5de445ff"
//			);
//
//			repository.insert(provider);
//			repository.insert(provider2);
//		};
//	};
		return args -> {
			String email = "fabien.bidault@gmail.com";
			Address address = new Address(
					"France",
					"75016",
					"Paris"
			);

			Position pos = new Position(12.345643, 90.2345345);
			PositionInfo pos_info = new PositionInfo(
					"Fr-fr",
					new Country(
							"France",
							"tt",
							"3"
					)
			);
			File file = new File(
					3,
					"url blabla",
					10
			);
			List<File> files = new ArrayList<File>();
			files.add(file);

			Photo photo = new Photo(
					"jpeg",
					"Photo d'621bb8a902d3b819e51796d8",
					MediaType.PHOTO,
					files,
					"url blabla"
			);
			int[] i = {};

			User user = new User(
					29,
					45,
					9,
					"14-05-1992",
					LocalDateTime.now(),
					true,
					(short) 30,
					Gender.MALE,
					0,
					i,
					"none",
					"Aurelien",
					pos,
					pos_info,
					"I'm hsdfgdbrre",
					"Paris",
					false,
					photo
			);

			repository.insert(user);

		};
	}
}
