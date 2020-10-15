package com.atif.studentProject.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.atif.studentProject.dal.entities.Student;
import com.atif.studentProject.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepo;

	@Test
	public void testCreateStudent() {

		Student student = new Student();
		student.setName("Iron Man");
		student.setCourse("Arc");
		student.setFee(100d);

		studentRepo.save(student);
	}

	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepo.findById(1L);
		System.out.println(student.get());
	}

	@Test
	public void testUpdateStudent() {
		Optional<Student> student = studentRepo.findById(1L);
		student.get().setFee(20d);

		studentRepo.save(student.get());
	}
	
	@Test
	public void testDeleteStudent() {
		//studentRepo.deleteById(3l);
		Student student = new Student();
		student.setId(4l);
		studentRepo.delete(student);
	}

}
