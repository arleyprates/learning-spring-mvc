package br.com.learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("helloWorldSpring")
	public String execute() {
		System.out.println("Executing logic with spring MVC");
		return "OK!";
	}
}
