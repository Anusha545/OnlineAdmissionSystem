package com.capgemini.sprint.repository;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.sprint.model.University;

@Repository
public interface IUniversityRepository extends JpaRepository<University,Integer> {
	
	
	

	
	@Query(value="Select * from university_table inner join address_table on university_table.address_addressid=address_table.addressid where address_table.city=?1",nativeQuery=true)
	public List<University> getUniversityDetailsByCity(String city);
	
	//query (value="select * from University inner join College on College.college_id=University)
	@Query(value="Select * from university_table inner join College_Table on university_table.university_id=college_table.university_university_id where college_table.college_name=?1",nativeQuery=true)
	public List<University> getUniversityDetailsByCollegeName(String collegeName);
	
	@Transactional
	@Modifying
	@Query(value="delete from University u where u.universityId=?1")
	public int deleteUniversityById(int universityId);
	
	@Query(value="Select * from university_table where university_Id=?1",nativeQuery=true)
	public University getUniversityById(int universityId);
	
	
	
	@Transactional
	@Modifying
	@Query(value="update University u set u.name=?1 where u.universityId=?2")
	public int updateUniversity(String name, int universityId);  
	
	

}
