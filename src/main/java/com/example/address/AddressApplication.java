package com.example.address;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.address.domain.Address;
import com.example.address.domain.AddressRepository;

@SpringBootApplication
public class AddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner addressDemo(AddressRepository repository) {
		return (args) -> {
			repository.save(new Address("Alpo Remes", "Kannelmäentie", 2, "D", 00450, "Helsinki"));
			repository.save(new Address("Mariia Solo", "Porvoontie", 3, "A", 00250, "Provoo"));
			repository.save(new Address("Sudarsan Koirala", "Kristinharju", 7, "B", 00750, "Espoo"));
		}; 
	}

}
