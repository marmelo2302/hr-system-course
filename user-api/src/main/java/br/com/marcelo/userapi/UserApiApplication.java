package br.com.marcelo.userapi;

import br.com.marcelo.userapi.Repositories.UserRepository;
import br.com.marcelo.userapi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(0,"Marcelo Melo","marcelo@mail.com","123",20.0),
				new User(0,"Marcelo Melo","marcelo@mail.com","123",30.0)
		));
	}
}
