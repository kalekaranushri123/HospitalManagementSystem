package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.DoctorDao;
import com.example.demo.entity.Doctor;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
@Service
public abstract class DoctorServiceImpl implements DoctorService
{
@Autowired
DoctorDao dao;
	@Override
	public Collection<Doctor> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public void save(Doctor p) {
		dao.save(p);
		
	}
	@Override
	public Doctor findById(@PathVariable int id) {
		// TODO Auto-generated method stub
		java.util.Optional<Doctor> p= dao.findById(id);
		Doctor p1=null;
		if(p.isPresent())
		{
			p1=p.get();
		}
		return p1;
	}

	

}