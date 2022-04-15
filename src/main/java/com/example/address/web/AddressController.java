package com.example.address.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.address.domain.AddressRepository;


@Controller
public class AddressController {
	
	@Autowired
	private AddressRepository repository;  
	
	@RequestMapping(value= {"/"})
	public String addressList(Model model) {
		model.addAttribute("addresses", repository.findAll()); 
		return "addressList"; 
	}

}
