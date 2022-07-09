package com.capgemini.sprint.service;

import java.util.List;

import com.capgemini.sprint.model.Branch;

public interface IBranchService {
	public boolean addBranch(Branch branch);
	public List<Branch> viewAllBranchDetails();
	public List<Branch> getBranchDetailsByName(String branchName);
	public int deleteBranchById(int branchId);
	public Branch getBranchById(int branchId);
	public int deleteBranchByName(String branchName);
	public int updateBranch(Branch branch);

}
