package br.com.learning.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.learning.spring.mvc.model.Student;

@Controller
public class StudentController {

	@RequestMapping("newStudent")
	public String form() {
		return "student/newStudent";
	}
	
	@RequestMapping("addStudent")
	public String add(@Validated Student student, BindingResult result) {
		
		if (result.hasFieldErrors("nome")) {
			return "student/newStudent";
		}
	
		return "student/addedStudent";
	}
}
