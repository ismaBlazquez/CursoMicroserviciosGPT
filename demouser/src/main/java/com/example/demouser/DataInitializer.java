package com.example.demouser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demouser.model.User;
import com.example.demouser.repository.UserRepository;

@Component
public class DataInitializer implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	
	@Override
	public void run(String... args) throws Exception {
		initializeData();
	}
	
	 private void initializeData() {
        // Agregar ejemplos de usuarios a la base de datos
        userRepository.save(new User("Alice", "alice@example.com"));
        userRepository.save(new User("Bob", "bob@example.com"));
        userRepository.save(new User("Ismael", "ismael@example.com"));
	 }

}
