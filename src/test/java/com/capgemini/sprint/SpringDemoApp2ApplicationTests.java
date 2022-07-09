package com.capgemini.sprint;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.sprint.exception.UniversityCreationException;
import com.capgemini.sprint.model.University;
import com.capgemini.sprint.repository.IUniversityRepository;
import com.capgemini.sprint.service.IUniversityService;

@SpringBootTest
class SpringDemoApp2ApplicationTests {
	@Autowired
	private IUniversityRepository repositoryUniversity;
	@Autowired
	IUniversityService service;

	@Test
	public void testSave() {
		University university=new University();
		university.setUniversityId(2347);
		university.setName("jntul");
		University u=null;
		try {
		 	u= service.addUniversity(university);
		} catch (UniversityCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	assertNotNull(u);
		}

	@Test
	public  void viewAllUniversityDetails()
	{
		
	List<University> list=	service.viewAllUniversityDetails();
	assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testForUpdate()
	{
		
		University u=repositoryUniversity.findById(2347).get();
		u.setName("Data Science");
		repositoryUniversity.save(u);
		//assertNotEquals("xyz", trainRepos.findById(1144).get().getTarinName());
	assertNotEquals("adfd", repositoryUniversity.findById(2347).get().getName());	
	
	}
}
