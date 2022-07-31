package com.example.assignmentspringboot.service;

import com.example.assignmentspringboot.entity.User;
import com.example.assignmentspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    final UserRepository userRepository;
    public User save(User user) {
        return userRepository.save(user);
    }

    public Page<User> findAll(int page, int limit) {
        return userRepository.findAll(PageRequest.of(page - 1, limit, Sort.by(Sort.Direction.ASC, "name")));
    }
}
