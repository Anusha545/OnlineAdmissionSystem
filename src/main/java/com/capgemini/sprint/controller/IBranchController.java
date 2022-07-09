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

import com.capgemini.sprint.dao.IBranchDao;
import com.capgemini.sprint.model.Branch;
@RestController
public class IBranchController {
	
	@Autowired
	private IBranchDao branchdao;
	@PostMapping(path="/createBranch")
	public boolean addBrancg(@RequestBody Branch branch) {
		return branchdao.addBranch(branch);
	}
	@GetMapping(path="/getAllBranchDetails")
	public List<Branch> viewAllBranchDetails(){
		return branchdao.viewAllBranchDetails();
	}
	@GetMapping(path="/getBranchDetailsByName/{branchName}")
	public List<Branch> getBranchDetailsByName(@PathVariable String branchName){
		return branchdao.getBranchDetailsByName(branchName);
	}
	@GetMapping(path="/getBranchDetailsById/{branchId}")
	public Branch getBranchDetailsById(@PathVariable int branchId){
		return branchdao.getBranchById(branchId);
	}
	@DeleteMapping("/deleteBranchByName/{branchName}")
	public int deleteBranchName(@PathVariable String branchName) {
		return branchdao.deleteBranchByName(branchName);
	}
	@DeleteMapping("/deleteBranchById/{branchId}")
	public int deleteBranchById(@PathVariable int branchId) {
		return branchdao.deleteBranchById(branchId);
	}
	@PutMapping("/UpdateBranch/{branchId}")
	public int updateBranch(@RequestBody Branch branch, @PathVariable int branchId) {
		return branchdao.updateBranch(branch);
	}

}
