package restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
	/*
	 * @Bean protected CommandLineRunner init(final UserRepository userRepository) {
	 * 
	 * return args -> { User user = new User(); user.setUsername("Adrian");
	 * user.setPassword("password"); user.setName("Adrian Briones");
	 * user.setEmail("adrianb13@yahoo.com"); userRepository.save(user);
	 * 
	 * }; }
	 */
}