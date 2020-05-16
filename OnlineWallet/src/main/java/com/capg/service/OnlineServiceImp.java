package com.capg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.OnlineDao;
import com.capg.model.Online;
import com.capg.dao.OnlineDaoImp;
import com.capg.dao.OnlineRepo;
import com.capg.exceptions.IdNotFoundException;

@Service
public  class OnlineServiceImp implements OnlineService{
	@Autowired
	OnlineRepo brepo;

	@Autowired
	private OnlineDao dao;
	
	
	@Override
	public Online deposite(Long accNo, Double depositeAmount) 
	{
		
		return dao.deposite(accNo,depositeAmount);
	}

	
	@Override
	public boolean loginUser(Online u) 
	
	{
		
		return dao.loginUser(u);        
	}
}
