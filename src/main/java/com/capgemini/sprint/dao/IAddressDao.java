package com.capgemini.sprint.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.sprint.model.Address;
import com.capgemini.sprint.repository.IAddressRepository;
import com.capgemini.sprint.service.IAddressService;
@Service
public class IAddressDao implements IAddressService {
	@Autowired
	private IAddressRepository repositoryAddress;

	@Override
	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		Address add=repositoryAddress.save(address);
		return add;
		
		//return null;
	}

	@Override
	public int deleteAddressById(int addressid) {
		// TODO Auto-generated method stub
		/*Address add1=repositoryAddress.findById(addressid).get();
		 repositoryAddress.delete(add1);
		int k= add1.getAddressId();
		if(k==0) {
			return 1;
		}else {
			return 0;*/
			return repositoryAddress.deleteAddById(addressid);
		
		//return 0;
	}

	@Override
	public Address updateAddress(Address add) {
		// TODO Auto-generated method stub
		
		int k=add.getAddressid();
		String city=add.getCity();
		String district=add.getDistrict();
		int status=repositoryAddress.UpdateAddById(city,district,k);
		if(status==1) {
		return add; 
		}else {
			return null;
		}
		//return null;
	}

	@Override
	public Address getAddressById(int id) {
		// TODO Auto-generated method stub
		
		Address add1=repositoryAddress.findById(id).get();
		return add1;
		
		//return null;
	}

}
