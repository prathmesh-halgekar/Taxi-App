package com.example.taxiapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/welcome", method = RequestMethod.GET, produces="application/json")
    public String loginSuccess() {
		
	    return "Success123";        
    }
}
