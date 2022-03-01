package korben;

import korben.positionInfos.models.Address;
import korben.positionInfos.models.Country;
import korben.positionInfos.models.PositionInfo;
import korben.user.*;
import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.geo.Point;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KorbenApplication {

	public static void main(String[] args) {
		SpringApplication.run(KorbenApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(UserRepository repository) {
////		return args -> {
////			Provider provider = new Provider(
////				ProviderName.GOOGLE,
////				"1234567890",
////				"621a3f76986ecd1384e5e7d6"
////			);
////			Provider provider2 = new Provider(
////				ProviderName.GOOGLE,
////				"12345",
////				"621a3fc45b72cf7e5de445ff"
////			);
////
////			repository.insert(provider);
////			repository.insert(provider2);
////		};
////	};
//		return args -> {
//			String email = "fabien.bidault@gmail.com";
//			Address address = new Address(
//					"France",
//					"75016",
//					"Paris"
//			);
//
//			PositionInfo pos_info = new PositionInfo(
//					new ObjectId("sdfgdfbgdfs"),
//					"Fr-fr",
//					new Country(
//							"France",
//							"tt",
//							"3"
//					),
//					address
//			);
//			File file = new File(
//					3,
//					"url blabla",
//					10
//			);
//			List<File> files = new ArrayList<File>();
//			files.add(file);
//
//			Photo photo = new Photo(
//					"jpeg",
//					"Photo d'621bb8a902d3b819e51796d8",
//					MediaType.PHOTO,
//					files,
//					"url blabla"
//			);
//			String[] interested_in = {Gender.FEMALE.getValue()};
//
//			User user = new User(
//					29,
//					45,
//					LocalDate.of(1992, Month.MAY, 14),
//					LocalDateTime.now(),
//					true,
//					(short) 30,
//					Gender.MALE.getValue(),
//					interested_in,
//					"Aurelien",
//					new Point(-73.99756, 40.73083),
//					pos_info,
//					"Bio de Aurelien, nah nah nah",
//					"Paris",
//					true
//			);
//
//			repository.insert(user);
//
//		};
//	}
}
