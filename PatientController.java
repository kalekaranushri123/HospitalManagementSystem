package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PatientDa;
import com.example.demo.dao.PatientDao;
import com.example.demo.service.PatientService;
@RestController
@RequestMapping("/patient")
public class PatientController 
{
	@Autowired
	PatientService service;
	@GetMapping("/list")
	public List<PatientDao> listpatient()
	{
		return service.findAll();
		
	}
	
	@PutMapping("/update")
    public PatientDao Update(@RequestBody PatientDao e)
    {
    	//e.setPatienttid(0);
		service.saveorUpdate((PatientService) e);
    	return e;
    	
    }
	
	@DeleteMapping("/delete/{patientid}")
    public String delete(@PathVariable int patienttid)
    {
    	PatientDa e=(PatientDa) findById(patienttid);
    	if(e==null)
    	{
    		throw new RuntimeException("delete id not found");
    	}
    	else
    	{
    	service.deleteById(patienttid);
    	}
    	return "patient id"+patienttid;
    	
    }

	private PatientService findById(int patientid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	


}


