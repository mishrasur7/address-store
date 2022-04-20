package com.example.address.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.address.domain.User;
import com.example.address.domain.UserRepository;

@Service
public class UserDetailServiceImplementation implements UserDetailsService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserDetailServiceImplementation(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User currentUser = userRepository.findByUserName(username); 
		UserDetails user = new org.springframework.security.core.userdetails.User(username, currentUser.getHashedPassword(), 
        		AuthorityUtils.createAuthorityList(currentUser.getRole()));
		return user;
	}

}
