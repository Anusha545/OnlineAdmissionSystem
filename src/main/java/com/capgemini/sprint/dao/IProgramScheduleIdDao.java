package com.capgemini.sprint.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.sprint.model.ProgramScheduleId;
import com.capgemini.sprint.repository.IProgramScheduleIdRepository;
import com.capgemini.sprint.service.IProgramScheduleService;


@Service
public class IProgramScheduleIdDao implements IProgramScheduleService {
	@Autowired
	private IProgramScheduleIdRepository repositoryschedule;
	

	@Override
	public ProgramScheduleId addProgramSchedule(ProgramScheduleId programSchedule) {
		// TODO Auto-generated method stub
		return repositoryschedule.save(programSchedule);
		//return null;
	}

	@Override
	public List<ProgramScheduleId> viewAllProgramScheduleDetails() {
		// TODO Auto-generated method stub
		return repositoryschedule.findAll();
		//return null;
	}

	@Override
	public List<ProgramScheduleId> getProgramScheduleByCollegeName(String collegeName) {
		// TODO Auto-generated method stub
		return repositoryschedule.getProgramScheduleByCollegeName(collegeName);
		//return null;
	}

	@Override
	public List<ProgramScheduleId> getProgramScheduleByDate(String startDate) {
		// TODO Auto-generated method stub
		Date sdate=null;
		try {
			sdate = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return repositoryschedule.getProgramScheduleByDate(sdate);
	
		//return null;
	}

	@Override
	public int deleteProgramScheduleById(int scheduleId) {
		// TODO Auto-generated method stub
		return repositoryschedule.deleteProgramScheduleById(scheduleId);
		//return 0;
	}

	@Override
	public ProgramScheduleId getProgramScheduleById(int scheduleId) {
		// TODO Auto-generated method stub
		return repositoryschedule.findById(scheduleId).get();
		//return null;
	}

	@Override
	public int updateProgramSchedule(ProgramScheduleId ProgramScheduleId) {
		// TODO Auto-generated method stub
		int k= ProgramScheduleId.getScheduleId();
		Date p=ProgramScheduleId.getStartDate();
		int w=repositoryschedule.updateProgramSchedule(p,k);
		return w;
	
		
		//return 0;
	}
	

}