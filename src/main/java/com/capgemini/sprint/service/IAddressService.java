package com.capgemini.sprint.service;

import com.capgemini.sprint.model.Address;

public interface IAddressService {
	public Address addAddress(Address address);
	public int deleteAddressById(int addressid);
	public Address updateAddress(Address add);
	public Address getAddressById(int id);

}
