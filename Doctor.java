package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor
{
	@Column(name="doctorid")
	private int doctorid;
	@Column(name="doctorname")
	private String doctorname;
	@Column(name="dadress")
	private String dadress;
	@Column(name="doctorno")
	private float doctorno;
	public Doctor()
	{
		
	}
	public void doctor(int doctorid, String doctorname, String dadress, float doctorno) {
		
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.dadress = dadress;
		this.doctorno = doctorno;
	}
	public int getdoctorid() {
		return doctorid;
	}
	public void setdoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getdoctorname() {
		return doctorname;
	}
	public void setdoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getdadress() {
		return dadress;
	}
	public void setdadress(String dadress) {
		this.dadress = dadress;
	}
	public float getdno() {
		return doctorno;
	}
	public void setdno(float dno) {
		this.doctorno = dno;
	}
}
	
		
		
		
		
		
		
	