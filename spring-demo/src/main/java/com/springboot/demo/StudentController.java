package com.springboot.demo;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Muthu", "Vel");
	}
	
	@GetMapping(path="/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Muthu vel", "Kannan"));
		students.add(new Student("Muthu vel", "Kannan"));
		students.add(new Student("Muthu vel", "Kannan"));
		students.add(new Student("Muthu vel", "Kannan"));
		students.add(new Student("Muthu vel", "Kannan"));
		
		return students;
	}
	
}
