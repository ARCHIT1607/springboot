package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.model.Person;

@Component
public interface UserRepository extends JpaRepository<Person, Long> {

}
