package com.example.address.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.address.domain.Address;
import com.example.address.domain.AddressRepository;


@Controller
public class AddressController {
	
	//dependency injection mapped to AddressRepository 
	@Autowired
	private AddressRepository repository;
	
	//request mapping to list all the addresses stored in database
	@RequestMapping(value= {"/", "/addresslist"})
	public String addressList(Model model) {
		model.addAttribute("addresses", repository.findAll()); 
		return "addressList"; 
	}
	
	//request mapping to add address details into database
	@RequestMapping(value="/add")
	public String addAddress(Model model) {
		model.addAttribute("address", new Address()); 
		return "addAddress"; 
	}
	
	//post request mapping to save address 
	@PostMapping(value="/save")
	public String saveAddress(Address address) {
		repository.save(address); 
		return "redirect:addresslist"; 
	}
	
	//get request mapping to edit address
	@GetMapping(value="/edit/{id}")
	public String editAddress(@PathVariable ("id") Long addressId, Model model) {
		model.addAttribute("addresses", repository.findById(addressId)); 
		return "editAddress"; 
	}

}
