package com.cookIndya.Delegate;

import org.json.JSONObject;

import com.cookIndya.Service.ServiceImpl;
import com.cookIndya.Service.ServiceIn;
import com.cookIndya.VO.RegistrationVO;

public class RegistrationDeligate {
	
	public void userRegistration(RegistrationVO regsVO) throws Exception{
		
		try{
			
			JSONObject json = new JSONObject(); hjjhvjhvjhvj
			
			if(regsVO.getEmailId().length() > 0){
				json.put("emailId", regsVO.getEmailId());
			}
			
			if(regsVO.getMobileNumber().length() > 0){
				json.put("mobileNumber", regsVO.getMobileNumber());
			}
			
			if(regsVO.getName().length() > 0){
				json.put("userName", regsVO.getName());
			}
			
			if(regsVO.getPassword().length() > 0){
				json.put("password", regsVO.getPassword());
			}
			
			if(regsVO.getUserType().length() > 0){
				json.put("userType", regsVO.getUserType());
			}
			
			ServiceIn service = new ServiceImpl();
			
			service.userRegistration(json);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
