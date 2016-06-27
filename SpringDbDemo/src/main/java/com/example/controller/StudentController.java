package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.repository.StudnetRepository;



@RestController
public class StudentController {
	
	@Autowired
	private static  StudnetRepository studentRepo;

	@RequestMapping(value="/addstudent")
	public void addStudent()
	{
		System.out.println("inside add students method");
		for(int i=0;i<10000;i++)
		{
			Student s=new Student("mohan", "cse", 23);
			studentRepo.save(s);
			
		}
	}
}
