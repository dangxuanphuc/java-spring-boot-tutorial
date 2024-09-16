package com.phucdx.SpringJDBCExample;

import com.phucdx.SpringJDBCExample.model.Student;
import com.phucdx.SpringJDBCExample.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExampleApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExampleApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setId(1);
		s.setName("Martin");
		s.setAge(24);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}
}
