package net.javaguides.springboot;

import net.javaguides.springboot.model.Location;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.LocationRepository;
import net.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoTutorialApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Lacin");
		location.setDescription("It is a very nice place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.7);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Rustem");
		user1.setLastName("Kavaklik");
		user1.setEmail("RustemKavaklik@Gmail.Com");
		user1.setPassword("VerySecret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Ethem");
		user2.setLastName("Kavaklik");
		user2.setEmail("EthemKavaklik@Gmail.Com");
		user2.setPassword("VerySecret2");
		user2.setLocation(location);
		userRepository.save(user2);


	}
}
