package com.capgemini.sprint.service;

import java.util.List;

import com.capgemini.sprint.model.Program;

public interface IProgramService {
	public Program addProgram(Program program);
	public List<Program> viewAllProgramDetails();
	//public List<Program>getProgramDetailsByCollegeName(String collegeName);
	public List<Program> getProgramDetailsByName(String programName);
	public List<Program> getProgramDetailsByEligibility(String eligibility);
	public int deleteProgramById(int programId);
	public int deleteProgamByName(String programName);
	public int getProgramById(int programId);
	public int updateProgramStatus(Program program);
	

}
