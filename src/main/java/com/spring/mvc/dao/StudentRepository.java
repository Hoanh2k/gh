package com.spring.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.mvc.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
