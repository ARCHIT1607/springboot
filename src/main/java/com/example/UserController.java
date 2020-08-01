package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Person;
import com.example.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userdao;
	
	@RequestMapping("springboot")
	public String home() {
		System.out.println("Hi");
		return "home.jsp";
	}
	
	@RequestMapping("save")
	public String addUser(Person person) {
		userdao.save(person);
		return "home.jsp";
	}
}
