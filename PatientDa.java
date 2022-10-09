package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="jpa")
public interface PatientDa extends JpaRepository<PatientDa, Integer> {

}