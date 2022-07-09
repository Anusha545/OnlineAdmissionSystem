package com.capgemini.sprint.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.sprint.model.Address;
@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer> {
	
	@Transactional
	@Modifying
	@Query(value="update  Address a set a.city=?1,a.district=?2 where a.addressid=?3")
	public int UpdateAddById(String city,String district,int addressid);
	@Transactional
	@Modifying
	@Query(value="delete from Address a where a.addressid=?1")
	public int deleteAddById(int addressid);
	

}
