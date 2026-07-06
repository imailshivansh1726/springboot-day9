package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/hello")
public String home() {
	return "welcome to public page";
}
@GetMapping("/user")
public String userPage() {
	return"welcome user ";
}
@GetMapping("/admin")
public String adminPage() {
	return"welcome admin";
}

}
