package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="jpa")
public interface DoctorDa extends JpaRepository<DoctorDa, Integer> {

}