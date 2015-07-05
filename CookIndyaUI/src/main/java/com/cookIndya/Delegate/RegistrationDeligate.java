package com.cookIndya.Delegate;

import org.json.JSONObject;

import com.cookIndya.Service.ServiceImpl;
import com.cookIndya.Service.ServiceIn;
import com.cookIndya.VO.RegistrationVO;

public class RegistrationDeligate {
	
	public void userRegistration(RegistrationVO regsVO) throws Exception{
		
		try{
			
			JSONObject json = new JSONObject();
			
			json.put("Name", regsVO.getName());
			
			ServiceIn service = new ServiceImpl();
			
			service.userRegistration(json);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
