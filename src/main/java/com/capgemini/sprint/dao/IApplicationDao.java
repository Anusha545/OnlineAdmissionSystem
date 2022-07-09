package com.capgemini.sprint.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.sprint.model.Application;
import com.capgemini.sprint.repository.IApplicationRepository;
import com.capgemini.sprint.service.IApplicationService;
@Service
public class IApplicationDao implements IApplicationService {
	
	@Autowired 
	private IApplicationRepository repositoryApplication;

	@Override
	public List<Application> viewAllApplicationDetails() {
		// TODO Auto-generated method stub
		return repositoryApplication.findAll();
		//return null;
	}

	@Override
	public List<Application> getApplicationDetailsByEmail(String email) {
		// TODO Auto-generated method stub
		return repositoryApplication.getApplicationDetailsByEmail(email);
		
		//return null;
	}

	@Override
	public Application addApplication(Application application) {
		// TODO Auto-generated method stub
		Application ap=repositoryApplication.save(application);
				return ap;
		//return null;
	}

	@Override
	public List<Application> getApplicationDetailsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteApplicationById(int applicationId) {
		// TODO Auto-generated method stub
		return repositoryApplication.deleteApplicationById(applicationId);
		//return 0;
	}

	@Override
	public int deleteApplicationByEmail(String email) {
		// TODO Auto-generated method stub
		return repositoryApplication.deleteApplicationByEmail(email);
		
	    //return 0;
	}

	@Override
	public Application getApplicationById(int applicationId) {
		// TODO Auto-generated method stub
		return repositoryApplication.getApplicationById(applicationId);
		//return null;
	}

	@Override
	public int updateApplicationStatus(Application app) {
		// TODO Auto-generated method stub
		return 0;
	}

}
