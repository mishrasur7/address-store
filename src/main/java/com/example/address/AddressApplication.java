package com.example.address;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.address.domain.Address;
import com.example.address.domain.AddressRepository;
import com.example.address.domain.User;
import com.example.address.domain.UserRepository;

@SpringBootApplication
public class AddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner addressDemo(AddressRepository repository, UserRepository userRepository) {
		return (args) -> {
			repository.save(new Address("Alpo Remes", "Kannelmäentie", 2, 'D', "00450", "Helsinki"));
			repository.save(new Address("Mariia Solo", "Porvoontie", 3, 'A', "00250", "Provoo"));
			repository.save(new Address("Sudarsan Koirala", "Kristinharju", 7, 'B', "00750", "Espoo"));
			
			userRepository.save(new User("user", "$2a$10$HUI4EdIy.z7VmZ3wlLiU7eNKeRz4/QZRzy8G1.tm2Rm1Up2T/81v2", "user@gmail.com", "USER"));
			userRepository.save(new User("admin", "$2a$10$v7DsrzLHLjJggNLwHCx5DuKg1w96zJIA17jGcZgHD.sdwB/Bh/ptm", "admin@gmail.com", "ADMIN")); 
		}; 
	}

}
