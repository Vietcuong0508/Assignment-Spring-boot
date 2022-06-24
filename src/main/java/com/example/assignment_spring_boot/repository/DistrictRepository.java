package com.example.assignment_spring_boot.repository;

import com.example.assignment_spring_boot.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

}
