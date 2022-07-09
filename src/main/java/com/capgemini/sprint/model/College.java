package com.capgemini.sprint.model;
import java.util.*;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.capgemini.sprint.model.Program;
import com.capgemini.sprint.model.University;


@Entity
@Table(name="College_Table")
public class College {
	@Id
	private int collegeId;
	private String collegeName;
	 @OneToOne(cascade=CascadeType.ALL)
	private Address address;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Program> programList;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Course>  courseList;
    @OneToMany(cascade=CascadeType.ALL)
	private List<Branch> branchList;
    @ManyToOne(cascade=CascadeType.ALL)
    private University university;
    
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Program> getProgram() {
		return programList;
	}
	public void setProgram(List<Program> programList) {
		this.programList = programList;
	}
	public List<Branch> getBranch() {
		return branchList;
	}
	public void setBranch(List<Branch> branchList) {
		this.branchList = branchList;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	public List<Program> getProgramList() {
		return programList;
	}
	public void setProgramList(List<Program> programList) {
		this.programList = programList;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public List<Branch> getBranchList() {
		return branchList;
	}
	public void setBranchList(List<Branch> branchList) {
		this.branchList = branchList;
	}
	
	
	
}
