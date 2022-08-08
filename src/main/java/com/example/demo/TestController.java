package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class TestController {
	@GetMapping("/")
    public HashMap<String, Object> test(){
		HashMap<String, Object> result = new HashMap<>();
		result.put("nom", "Rakotoarivony");
		result.put("prenom", "Andrisoa Nirina Princie");
		result.put("age", 20);
        return result;
    }
}
