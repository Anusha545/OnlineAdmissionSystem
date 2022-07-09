package com.capgemini.sprint.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;
@Entity
@Table(name="university_table")
public class University {
	@Id
	@Range(min=1)
	public int universityId;
	@NotBlank(message="name cannot be blank")
	public String name;
	@OneToOne(cascade=CascadeType.ALL)
	public Address address;
	@OneToMany(cascade=CascadeType.ALL)
	public List<College>collegeList;
	
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<College> getCollegeList() {
		return collegeList;
	}
	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	
	
	}
