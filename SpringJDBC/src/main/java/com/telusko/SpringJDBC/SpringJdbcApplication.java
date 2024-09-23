package com.telusko.SpringJDBC;

import com.telusko.SpringJDBC.model.Student;
import com.telusko.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRoll_no(1);
		s.setName("Suneel");
		s.setMarks(75);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students = service.getAllStudents();

		System.out.println(students);
	}

}
