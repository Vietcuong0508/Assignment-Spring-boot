package com.example.assignment_spring_boot.repository;

import com.example.assignment_spring_boot.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetRepository extends JpaRepository<Street, Integer> {

}
