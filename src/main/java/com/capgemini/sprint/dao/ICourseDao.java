package com.capgemini.sprint.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.sprint.model.Course;
import com.capgemini.sprint.repository.ICourseRepository;
import com.capgemini.sprint.service.ICourseService;
@Service
public class ICourseDao  implements ICourseService{
	@Autowired
	private ICourseRepository repositoryCourse;

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return repositoryCourse.save(course);
	}

	@Override
	public List<Course> viewAllCourseDetails() {
		// TODO Auto-generated method stub
		
		return repositoryCourse.findAll();
	}

	@Override
	public List<Course> getCourseDetailsByCourseName(String courseName) {
		// TODO Auto-generated method stub

		return repositoryCourse.getCourseDetailsByCourseName(courseName);
	}

	@Override
	public List<Course> getCourseDetailsByCollegeName(String collegeName) {
		// TODO Auto-generated method stub
		return repositoryCourse.getCourseDetailsByCollegeName(collegeName);
	}

	@Override
	public List<Course> getCourseDetailsByEligibility(String eligibility) {
		// TODO Auto-generated method stub
		return repositoryCourse.getCourseDetailsByEligibility(eligibility);
	}

	@Override
	public Course getCourseDetailsByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return repositoryCourse.findById(courseId).get();
	}

	@Override
	public int deleteCourseById(int courseId) {
		// TODO Auto-generated method stub
		return repositoryCourse.deleteCourseById(courseId);
	}

	@Override
	public int deleteCourseByName(String courseName) {
		// TODO Auto-generated method stub
		return repositoryCourse.deleteCourseByName(courseName);
	}

	@Override
	public int updateCourseDetails(Course course) {
		// TODO Auto-generated method stub
		int k=course.getCourseId();
		String e=course.getEligibility();
		return repositoryCourse.updateCourseDetails(e,k);
	}


}
