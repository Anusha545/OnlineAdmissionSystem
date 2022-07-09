package com.capgemini.sprint.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.sprint.exception.InvalidUniversityException;
import com.capgemini.sprint.exception.UniversityCreationException;
import com.capgemini.sprint.model.University;
import com.capgemini.sprint.repository.IUniversityRepository;
import com.capgemini.sprint.service.IUniversityService;
@Service
public class IUniversityDao implements IUniversityService {
	@Autowired
	private IUniversityRepository repositoryUniversity;

	@Override
	public University addUniversity(University university) throws UniversityCreationException{
		// TODO Auto-generated method stub
		if(repositoryUniversity.existsById(university.getUniversityId()))
		{
			throw new UniversityCreationException("University Id is already Available");
		}
		else {
			return repositoryUniversity.save(university);
			
		}
		//University univer=repositoryUniversity.save(university);
		//return univer;
		
	}

	@Override
	public List<University> viewAllUniversityDetails() {
		// TODO Auto-generated method stub
		return repositoryUniversity.findAll();
		//return null;
	}

	@Override
	public List<University> getUniversityDetailsByCity(String city) {
		// TODO Auto-generated method stub
		return repositoryUniversity.getUniversityDetailsByCity(city);
		//return null;
	}

	@Override
	public List<University> getUniversityDetailsByCollegeName(String collegeName) {
		// TODO Auto-generated method stub
		return repositoryUniversity.getUniversityDetailsByCollegeName(collegeName);
		//return null;
	}

	@Override
	public int deleteUniversityById(int universityId) {
		// TODO Auto-generated method stub
		return repositoryUniversity.deleteUniversityById(universityId);
		//return 0;
		
	}

	@Override
	public University getUniversityById(int universityId) {
		// TODO Auto-generated method stub
		University u= repositoryUniversity.findById(universityId).get();
		return u;
		//return null;
	}

	@Override
	public int updateUniversity(University university) throws InvalidUniversityException{
		// TODO Auto-generated method stub
		int status=0;
		if(repositoryUniversity.existsById(university.getUniversityId()))
		{
		int k=university.getUniversityId();
		String name=university.getName();
		return status=repositoryUniversity.updateUniversity(name,k);
		}
		else
		{
			throw new InvalidUniversityException("University Id is not available");
		}
	}
}


