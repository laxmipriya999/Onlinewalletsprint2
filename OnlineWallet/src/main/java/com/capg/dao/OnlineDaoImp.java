package com.capg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capg.model.Online;

import java.util.Optional;

import com.capg.exceptions.IdNotFoundException;
@Repository
public  class OnlineDaoImp implements OnlineDao {

	@Autowired
	OnlineRepo brepo;
	

@SuppressWarnings("null")
@Override
public boolean  loginUser(Online u)
{
    Online ud=brepo.findByAccNo(u.getAccNo());
		
		  if(ud!=null)
		  {
		   if((ud.getPassword()).equals(u.getPassword()))
		  { 
			 return true;
		  }
		  }
		   return false;
		  }
	

	@Override
	public Online deposite(Long accNo, Double depositeAmount) {
		
		Online online= brepo.findByAccNo(accNo);
		Double currentBal= online.getBalance();
	     online.setBalance(currentBal+depositeAmount);
		return brepo.save(online);
	}

	
}
