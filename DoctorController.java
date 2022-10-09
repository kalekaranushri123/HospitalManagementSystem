package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;
@RestController
@RequestMapping("/doctor")
public class DoctorController 
{
	@Autowired
	DoctorService service;
	@GetMapping("/list")
	public Collection<Doctor> listdoctor(){	
		return service.findAll();
	}
	
	@PutMapping("/update")
    public Doctor Update(@RequestBody Doctor e)
    {
    	//e.setDoctorid(0);
		service.saveorUpdate(e);
    	return e;
    	
    }
	
	@DeleteMapping("/delete/{doctorid}")
    public String delete(@PathVariable int doctorid, Object e)
    {
    	Doctor d=findById(doctorid);
    	if(e==null)
    	{
    		throw new RuntimeException("delete id not found");
    	}
    	else
    	{
    	service.deleteById(doctorid);
    	}
    	return "doctort id"+doctorid;
    	
    }

	private Doctor findById(int doctorid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	


}


