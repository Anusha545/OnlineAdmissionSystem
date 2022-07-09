package com.capgemini.sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.sprint.dao.IApplicationDao;
import com.capgemini.sprint.model.Application;

@RestController
public class IApplicationController {
	@Autowired
	private IApplicationDao dao;
	
	@GetMapping(path="/viewAllApplicationDetails")
	 public List<Application>viewAllApplicationDetails(){
		return dao.viewAllApplicationDetails();
	}
	@PostMapping(path="/addApplication ")
	public Application addApplication(@RequestBody Application application) {
		return dao.addApplication(application);
	}
	@GetMapping(path="/getApplicationById/{applicationId}")
	public Application getApplicationById(@PathVariable int applicationId) {
		return dao.getApplicationById(applicationId);
	}
	@DeleteMapping(path="/deleteApplicationByEmail{email}")
	public int deleteApplicationByEmail(@PathVariable String email) {
		return dao.deleteApplicationByEmail(email);
	}
	
	@DeleteMapping(path="/deleteApplicationById{applicationId}")
	public int deleteApplicationById(@PathVariable int applicationId) {
		return dao.deleteApplicationById(applicationId);
	}
	
	@GetMapping(path="/getApplicationDetailsByEmail{email}")
	public List<Application> getApplicationDetailsByEmail(@PathVariable String email){
		return dao.getApplicationDetailsByEmail(email);
	}
	
}
