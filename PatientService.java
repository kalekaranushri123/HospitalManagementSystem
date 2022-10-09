package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.PatientDao;


public interface PatientService {

	public List<PatientDao> findAll();
	public void PatientfindById(int id);
	public void save1 (PatientService p);
	void save11(PatientService p);
	public void saveorUpdate(PatientService e);
	public void deleteById(int patientid);
	void save(PatientService p);

}
