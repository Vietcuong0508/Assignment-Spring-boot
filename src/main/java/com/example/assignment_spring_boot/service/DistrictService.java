package com.example.assignment_spring_boot.service;

import com.example.assignment_spring_boot.entity.District;
import com.example.assignment_spring_boot.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    public List<District> findAll() {
        return districtRepository.findAll();
    }

    public Optional<District> findById(int id) {
        return districtRepository.findById(id);
    }

    public District save(District District) {
        return districtRepository.save(District);
    }

    public void deleteById(int id) {
        districtRepository.deleteById(id);
    }
}
