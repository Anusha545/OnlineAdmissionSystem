package com.capgemini.sprint.service;

import java.util.List;

import com.capgemini.sprint.model.Login;
import com.capgemini.sprint.model.User1;

public interface IUser1Service {
	public User1 addUserDetails(User1 user);
	public Login addLoginDetails(Login login);
	public List<User1> getAllUserDetails();
	public User1 getUserDetailsById(String userId);
	public Login getLoginDetailsById(String userId);
	public User1 deleteUserDetailsById(String userId);
	public Login deleteLoginDetailsById(String Id);
	public Login changePassword(Login login);
	public Login resetPassword(Login login);
	public User1 updateUserDetails(User1 user);

}
