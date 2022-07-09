package com.capgemini.sprint.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.sprint.model.Application;
@Repository
public interface IApplicationRepository extends JpaRepository<Application,Integer>{
	
	@Query(value="select * from Application_table where application_Id=?1",nativeQuery=true)
	public Application getApplicationById(int applicationId);
	
	@Transactional
	@Modifying
	@Query(value="delete from Application a where a.emailId=?1")
	public int deleteApplicationByEmail(String email);
	
	@Transactional
	@Modifying
	@Query(value="delete from Application a where a.applicationId=?1")
	public int deleteApplicationById(int applicationId);
	
	@Query(value="select * from Application_table where email_id=?1",nativeQuery=true)
	public List<Application> getApplicationDetailsByEmail(String email);

}
