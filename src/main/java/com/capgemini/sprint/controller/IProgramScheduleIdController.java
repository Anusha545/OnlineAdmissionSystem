package com.capgemini.sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.sprint.dao.IProgramScheduleIdDao;

import com.capgemini.sprint.model.Program;
import com.capgemini.sprint.model.ProgramScheduleId;

@RestController
public class IProgramScheduleIdController {
	@Autowired
	private IProgramScheduleIdDao dao1;
	@PostMapping(path="/create ProgramSchedule")
	public ProgramScheduleId addProgramSchedule(@RequestBody ProgramScheduleId programSchedule) {
		return dao1.addProgramSchedule(programSchedule);
	}
	@GetMapping(path="/getProgramScheduleByDate/{startDate}")
	public List<ProgramScheduleId> getProgramScheduleByDate(@PathVariable String startDate){
		return dao1.getProgramScheduleByDate(startDate);
	}
	@GetMapping(path="/getProgramScheduleByCollegeName/{collegeName}")
	public List<ProgramScheduleId> getProgramScheduleByCollegeName(@PathVariable String collegeName){
		return dao1.getProgramScheduleByCollegeName(collegeName);
	}
	@DeleteMapping(path="/deleteProgramScheduleById/{scheduleId}")
	public int deleteProgramScheduleById(@PathVariable int scheduleId) {
		return dao1.deleteProgramScheduleById(scheduleId);
	}
	@GetMapping(path="/getProgramScheduleById/{scheduleId}")
	public ProgramScheduleId getProgramScheduleById(@PathVariable int scheduleId) {
		return dao1.getProgramScheduleById(scheduleId);
	}
	@PutMapping(path="/UpdateProgramSchedule/{scheduleId}")
	public int updateProgramSchedule(@RequestBody ProgramScheduleId ProgramScheduleId,@PathVariable int scheduleId) {
	return dao1.updateProgramSchedule(ProgramScheduleId);
	}
	}

