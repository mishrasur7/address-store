package com.example.address.domain;

import org.springframework.data.repository.CrudRepository;

//UserRepository interface that extends CrudRepository interface to use different crud functionality
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserName(String userName); 
}
