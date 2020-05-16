package com.capg.dao;


  import java.util.List;
import java.util.Optional;

import com.capg.model.Online; 
  
  
  public interface OnlineDao 
  {
	
  public abstract Online deposite(Long accNo, Double depositeAmount);
  
public abstract boolean loginUser(Online u);







  }
 


