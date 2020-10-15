package com.atif.studentProject.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.atif.studentProject.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
