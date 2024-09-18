package com.phucdx.spring_data_jpa_example;

import com.phucdx.spring_data_jpa_example.model.Student;
import com.phucdx.spring_data_jpa_example.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExampleApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExampleApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
//
//		s1.setId(1);
//		s1.setName("John");
//		s1.setAge(22);
//
//		s2.setId(2);
//		s2.setName("Jane");
//		s2.setAge(27);
//
		s3.setId(3);
		s3.setName("Mary");
		s3.setAge(39);
//
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());
//		System.out.println(repo.findById(2));

//		Optional<Student> s = repo.findById(5);
//		System.out.println(s.orElse(new Student()));

//		System.out.println(repo.findByName("Jane"));
//		System.out.println(repo.findByAge(18));
//		System.out.println(repo.findByAgeGreaterThan(18));

//		repo.save(s3);
		repo.delete(s3);
	}
}
