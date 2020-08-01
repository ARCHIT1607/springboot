package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserRepository userdao;
	
	@RequestMapping("/springboot")
	public String home() {
		System.out.println("Hi");
		return "home.jsp";
	}
	
	@PostMapping("/employees")
    public Person addEmployee(@RequestBody Person employee) {
        return userdao.save(employee);
    }
}
