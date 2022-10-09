package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.service.PatientService;

@Entity
@Table(name="patient")
public class Patient
{
	@Column(name="patientid")
	private int patienttid;
	@Column(name="patientname")
	private String patientname;
	@Column(name="padress")
	private String padress;
	@Column(name="patientno")
	private float patientno;
	public Patient()
	{
		
	}
	public void patient(int patientid, String patientname, String padress, float patientno) {

		this.patienttid = patientid;
		this.patientname = patientname;
		this.padress = padress;
		this.patientno = patientno;
	}
	public int getPatientid() {
		return patienttid;
	}
	public void setpatientid(int patientid) {
		this.patienttid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getProductdes() {
		return padress;
	}
	public void setPadress(String padress) {
		this.padress = padress;
	}
	public float getPatientno() {
		return patientno;
	}
	public void setPatientno(float patientno) {
		this.patientno = patientno;
	}
	public void save1(Patient p) {
		// TODO Auto-generated method stub
		
	}
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public void PatientfindById(int id) {
		// TODO Auto-generated method stub
		
	}
	public void save(PatientService p) {
		// TODO Auto-generated method stub
		
	}
	public void save1(PatientService p) {
		// TODO Auto-generated method stub
		
	}
	public void saveorUpdate(Patient e) {
		// TODO Auto-generated method stub
		
	}
	public void deleteById(int patientid) {
		// TODO Auto-generated method stub
		
	}
	public void save(Patient p) {
		// TODO Auto-generated method stub
		
	}
}
	
		
		
		
		
		
		
	