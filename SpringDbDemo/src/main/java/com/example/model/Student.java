package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="StudentID",unique=true)
	private int rollNo;
	
	@Column(name="name")
	private String studentName;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="age")
	private int age;

	public Student(String studentName, String branch, int age) {
		super();
		this.studentName = studentName;
		this.branch = branch;
		this.age = age;
	}
	
	
	
	
}
