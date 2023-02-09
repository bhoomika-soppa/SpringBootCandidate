package com.candidate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Model {
	@Id
	@Column
	private int ID;
	
	@Column
	private String name;
	@Column
	private String company;
	@Column
	private int salary;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Model(int iD, String name, String company, int salary) {
		super();
		ID = iD;
		this.name = name;
		this.company = company;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Model [ID=" + ID + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}
	

}
