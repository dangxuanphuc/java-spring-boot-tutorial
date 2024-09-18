package com.phucdx.spring_data_jpa_example.repo;

import com.phucdx.spring_data_jpa_example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
//    @Query("select s from Student s where s.name = ?1")
    List<Student> findByName(String name);
    List<Student> findByAge(int age);
    List<Student> findByAgeGreaterThan(int age);
}
