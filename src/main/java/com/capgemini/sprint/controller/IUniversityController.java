package com.capgemini.sprint.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.sprint.dao.IUniversityDao;
import com.capgemini.sprint.exception.InvalidUniversityException;
import com.capgemini.sprint.exception.UniversityCreationException;
import com.capgemini.sprint.model.Address;
import com.capgemini.sprint.model.Branch;
import com.capgemini.sprint.model.University;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
public class IUniversityController {
	@Autowired
	 private IUniversityDao dao;
	Logger log=LoggerFactory.getLogger(IUniversityController.class);
	@PostMapping(path="/create University")
	public University addUniversity(@Valid @RequestBody University university) throws UniversityCreationException {
		          University k= dao.addUniversity(university); 
		          if(k!=null)
		          {
		        	  
		        	  System.out.println("University is added");
		        	  log.info("University is added ");
		          }
		          else
		          {
		        	  
		        	  System.out.println("University is not added");
		        	  log.error("University is not added");
		          }
		          return k;
		
     }
	
	@GetMapping(path="/viewAllUniversvityDetails")
	public List<University> viewAllUniversityDetails(){
		log.info("viewAllUniversvityDetails");
		return dao.viewAllUniversityDetails();
	}
	
	@DeleteMapping(path="/deleteUniversityById/{universityId}")
	public int deleteUniversityById(@PathVariable int universityId){
		return dao.deleteUniversityById(universityId);
	}
	
	@PutMapping(path="/UpdateUniversity/{universityId}")
	public int updateUniversity(@Valid @RequestBody University name, @PathVariable int universityId) throws InvalidUniversityException{
		int k1=dao.updateUniversity(name);
		if(k1!=0)
        {
      	  System.out.println("University is Updated");
      	log.info("University is updated ");
        }
        else
        {
      	  System.out.println("University is not Updated");
      	  log.error("University is not Updated");
        }
        return k1;
	
	}
	@GetMapping(path="/getUniversityById/{universityId}")
	public University getUniversityById(@PathVariable int universityId) {
		return dao.getUniversityById(universityId);
	}
	@GetMapping(path="/getUniversityDetailsByCollegeName/{collegeName}")
	public List<University>getUniversityDetailsByCollegeName(@PathVariable String collegeName){
	return dao.getUniversityDetailsByCollegeName(collegeName);
	}
	@GetMapping(path="/getUniversityDetailsByCity/{city}")
	public List<University> getUniversityDetailsByCity(@PathVariable String city){
		return dao. getUniversityDetailsByCity(city);
		
		
	}
	

	

}
