package com.capgemini.sprint.service;

import java.util.List;

import com.capgemini.sprint.model.ProgramScheduleId;
public interface IProgramScheduleService {
public ProgramScheduleId addProgramSchedule(ProgramScheduleId programSchedule);
public List<ProgramScheduleId> viewAllProgramScheduleDetails();
public List<ProgramScheduleId> getProgramScheduleByCollegeName(String collegeName);
public List<ProgramScheduleId> getProgramScheduleByDate(String startDate);
public int deleteProgramScheduleById(int scheduleId);
public ProgramScheduleId getProgramScheduleById(int scheduleId);
public int updateProgramSchedule(ProgramScheduleId ProgramScheduleId);

}