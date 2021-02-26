package com.example.users;

import com.example.users.users.TableUser;
import com.example.users.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class UsersApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initialData() {
		TableUser tableUser = new TableUser(1, "Jengweb", "jengweb@gmail.com");
		userRepository.save(tableUser);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(UsersApplication.class, args);
	}

}
