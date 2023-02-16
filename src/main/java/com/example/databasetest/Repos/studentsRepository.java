package com.example.databasetest.Repos;

import com.example.databasetest.entity.students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentsRepository extends JpaRepository<students, Integer> {
}
