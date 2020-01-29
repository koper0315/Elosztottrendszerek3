package com.example;

import com.example.*;
import com.example.b.Answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Answer answer = new Answer();
	
	@GetMapping("/")
	public String Barmi() {
		return answer.Valasz();
	}
	
	
}
