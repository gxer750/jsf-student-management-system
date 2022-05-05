package com.elias.jsfstudentmanagementsystem;

import com.elias.jsfstudentmanagementsystem.entity.Student;
import com.elias.jsfstudentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsfStudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JsfStudentManagementSystemApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {


		//Student student1 = new Student("John", "Frank", "john@gmail.com");
		//studentRepository.save(student1);

		//Student student2 = new Student("Smith", "Don", "smith@gmail.com");
		//studentRepository.save(student2);


	}
}
