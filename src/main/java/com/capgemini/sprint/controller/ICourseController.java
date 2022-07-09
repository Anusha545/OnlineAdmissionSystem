package com.capgemini.sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.capgemini.sprint.dao.ICourseDao;

import com.capgemini.sprint.model.Course;

@RestController
public class ICourseController {
	
	@Autowired
	private ICourseDao dao;
	@PostMapping(path="/createCourse")
	public Course addCourse(@RequestBody Course course) {
		return dao.addCourse(course);
	}
	
	@GetMapping(path="/getAllCourseDetails")
	public List<Course> viewAllCourseDetails(){
		return dao.viewAllCourseDetails();
	}
	
	@GetMapping(path="/getCourseDetailsByCourseName/{courseName}")
	public List<Course> getCourseDetailsByCourseName(@PathVariable String courseName){
		return dao.getCourseDetailsByCourseName(courseName);
	}

	@GetMapping(path="/getCourseDetailsByCollegeName/{collegeName}")
	public List<Course> getCourseDetailsByCollegeName(@PathVariable String collegeName){
		return dao.getCourseDetailsByCollegeName(collegeName);
	}
	
	@GetMapping(path="/getCourseDetailsByEligibility/{eligibility}")
	public List<Course> getCourseDetailsByEligibility(@PathVariable String eligibility) {
		return dao.getCourseDetailsByEligibility(eligibility);
	}
	
	@GetMapping(path="/getCourseDetailsByCourseId/{courseId}")
	public Course getCourseDetailsByCourseId(@PathVariable int courseId) {
		// TODO Auto-generated method stub
		return dao.getCourseDetailsByCourseId(courseId);
	}

	
	@DeleteMapping(path="/deleteCourse/{courseId}")
	public int deleteCourseById(@PathVariable int courseId) {
		return dao.deleteCourseById(courseId);
			
		}
	
	@DeleteMapping(path="/deleteCourseByName/{courseName}")
	public int deleteCourseByName(@PathVariable String courseName) {
		return dao.deleteCourseByName(courseName);
	}
	
	@PutMapping("/UpdateCourseDetails/{courseId}")
	public int updateCourseDetails(@RequestBody Course course,@PathVariable int courseId) {
		return dao.updateCourseDetails(course);
	}
	
}
