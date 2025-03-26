package com.example.demospring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Aventador
 * @create 2025-03-23-22:48
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
