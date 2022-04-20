package com.example.address;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.address.domain.User;
import com.example.address.domain.UserRepository;


//testing UserRepository class with user
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository repository;

	@Test
	public void findByUsername() {
		User users = repository.findByUserName("admin");

		assertThat(users.getUserName()).isEqualTo("admin");
	}
}
