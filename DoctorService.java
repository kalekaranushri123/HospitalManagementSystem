package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import com.example.demo.entity.Doctor;



public interface DoctorService {

	public Collection<Doctor> findAll();
	public Doctor findById(int id);
	public void save1 (Doctor d);
	void save(Doctor d);
	public void saveorUpdate(Doctor e);
	public void deleteById(int doctorid);

}
