package com.example.taxiapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.taxiapp.model.Customer;
import com.example.taxiapp.repository.CustomerRepository;
import com.example.taxiapp.service.SuburbService;

@RestController
public class LoginController {
	@Autowired
	CustomerRepository customerRepository;
	
	private SuburbService suburbService = new SuburbService();

	@RequestMapping(value="/welcome", method = RequestMethod.GET, produces="application/json")
    public String loginSuccess() {
		
	    return "Success123";        
    }
	
	@RequestMapping(value="/register", method = RequestMethod.POST, produces="application/json")
    public Map<String, String>  createUser(@RequestBody Customer customer) {
		Map<String, String> response = new HashMap<String,String>();
		response.put("customer", customer.getFirstName());
		return response;
	    //return "{ \"Customer\" : \""+customer.getFirstName()+" registered successfully.\"}";        
    }
	
	@RequestMapping(value="/login", method = RequestMethod.POST, produces="application/json")
    public Map<String, Object>  login(@RequestBody Customer customer) {
		Map<String, Object> response = new HashMap<String,Object>();
		if(null != customer && ("rocky").equalsIgnoreCase(customer.getFirstName()) && ("pass123").equalsIgnoreCase(customer.getPassword())){
			response.put("status", "success");
			response.put("customer", customer);
			response.put("suburbs", suburbService.getSuburbs());
		}else{
			response.put("status", "invalid");
		}
		
		return response;
	    
    }
	
	@RequestMapping(value="/getCustomers", method = RequestMethod.GET, produces="application/json")
    public Map<String, Object> getCustomerDetails() {
		Map<String, Object> response = new HashMap<String,Object>();
		response.put("customers", customerRepository.findAll());
	    return response;        
    }
}
