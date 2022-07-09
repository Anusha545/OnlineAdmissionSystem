package com.capgemini.sprint.service;

import java.util.List;

import com.capgemini.sprint.model.Course;

public interface ICourseService {
	public Course addCourse(Course course);
	public List<Course> viewAllCourseDetails();
	public List<Course> getCourseDetailsByCourseName(String courseName);
	public List<Course> getCourseDetailsByCollegeName(String collegeName);
	public List<Course> getCourseDetailsByEligibility(String eligibility);
	public Course getCourseDetailsByCourseId(int courseId);
	public int deleteCourseById(int courseId);
	public int deleteCourseByName(String CourseName);
	public int updateCourseDetails(Course course);
	
	

}
