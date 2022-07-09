package com.capgemini.sprint.service;

import java.util.List;

import com.capgemini.sprint.exception.InvalidUniversityException;
import com.capgemini.sprint.exception.UniversityCreationException;
import com.capgemini.sprint.model.University;

public interface IUniversityService {
	public University addUniversity(University university) throws UniversityCreationException ;
	public List<University> viewAllUniversityDetails();
	public List<University> getUniversityDetailsByCity(String city);
	public List<University> getUniversityDetailsByCollegeName(String collegeName);
	public int deleteUniversityById(int universityId);
	public University getUniversityById(int universityId);
	public int updateUniversity(University university) throws InvalidUniversityException;

}
