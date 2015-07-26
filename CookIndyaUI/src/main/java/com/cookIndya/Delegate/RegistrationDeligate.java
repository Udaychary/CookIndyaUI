package com.cookIndya.Delegate;

import org.json.JSONObject;

import com.cookIndya.Service.ServiceImpl;
import com.cookIndya.Service.ServiceIn;
import com.cookIndya.VO.RegistrationVO;

public class RegistrationDeligate {
	
	public void userRegistration(RegistrationVO regsVO) throws Exception{
		
		try{
			
			JSONObject json = new JSONObject();
			
			//json.put("userName", regsVO.getName());
			json.put("userName", "Uday Bhaskar Achary");
			json.put("password", "Password@123");
			json.put("startDate", "18-07-2015");
			json.put("expiry", "18-07-2017");
			json.put("blocked", "N");
			json.put("isAdmin", "N");
			
			
			
			ServiceIn service = new ServiceImpl();
			
			service.userRegistration(json);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
