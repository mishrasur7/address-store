package com.example.address.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class AddressController {
	
	@RequestMapping(value="/")
	public String addressList() {
		return "Hello"; 
	}

}
