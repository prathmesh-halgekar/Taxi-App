package com.example.taxiapp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.taxiapp.model.Customer;

@RestController
public class HelloController {

	@RequestMapping(value="/welcome", method = RequestMethod.GET, produces="application/json")
    public String loginSuccess() {
		
	    return "Success123";        
    }
	
	@RequestMapping(value="/register", method = RequestMethod.POST, produces="application/json")
    public String createUser(@RequestBody Customer customer) {
		
	    return "{ \"Customer\" : \""+customer.getFirstName()+" registered successfully.\"}";        
    }
}
