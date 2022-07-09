package com.capgemini.sprint.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.sprint.model.ProgramScheduleId;
@Repository
public interface IProgramScheduleIdRepository extends JpaRepository<ProgramScheduleId, Integer> {
    @Query(value="select * from schedule1_table where start_date=?1",nativeQuery=true)  
	public List<ProgramScheduleId> getProgramScheduleByDate(Date startDate);
    
    @Transactional
	@Modifying
	@Query(value="delete from ProgramScheduleId b where b.scheduleId=?1")
    public int deleteProgramScheduleById(int scheduleId);
    
    //@Query(value="Select * from ProgramScheduleId inner join College on College.college_id=ProgramScheduleId.college_college_id where college.college_name=?1",nativeQuery = true)
    @Query(value="Select ps from ProgramScheduleId ps inner join College c ON ps.college=c.collegeId where c.collegeName=?1")
    public List<ProgramScheduleId> getProgramScheduleByCollegeName(String collegeName);
    @Transactional
	@Modifying
	@Query(value="Update ProgramScheduleId ps set ps.startDate=?1 where ps.scheduleId=?2")
	public int updateProgramSchedule(Date p,int scheduleId );
}


