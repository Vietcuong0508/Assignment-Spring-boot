package com.example.assignment_spring_boot.service;

import com.example.assignment_spring_boot.entity.Street;
import com.example.assignment_spring_boot.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreetService {
    @Autowired
    private StreetRepository streetRepository;

    public List<Street> findAll() {
        return streetRepository.findAll();
    }

    public Optional<Street> findById(int id) {
        return streetRepository.findById(id);
    }

    public Street save(Street street) {
        return streetRepository.save(street);
    }

    public void deleteById(int id) {
        streetRepository.deleteById(id);
    }
}
