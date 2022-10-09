package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.PatientDao;
@Service
public abstract class PatientServiceImpl implements PatientService
{
@Autowired
PatientDao dao;
	
	public <Patient> PatientServiceImpl() {
		// TODO Auto-generated method stub
		return;
	}
	public void save(PatientDao p) {
		dao.save(p);
		
	}
	public PatientDao findById(@PathVariable int id) {
		// TODO Auto-generated method stub
		java.util.Optional<PatientDao> p= dao.findById(id);
		PatientDao p1=null;
		if(p.isPresent())
		{
			p1=p.get();
		}
		return p1;
	}

	

}