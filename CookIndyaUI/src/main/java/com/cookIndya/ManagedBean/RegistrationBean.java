package com.cookIndya.ManagedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cookIndya.BackingBean.RegistrationBackingBean;
import com.cookIndya.Delegate.RegistrationDeligate;
import com.cookIndya.VO.RegistrationVO;


@ManagedBean(name="registrationBean")
@SessionScoped

public class RegistrationBean extends RegistrationBackingBean {
	
	
	public String signUp(){
		
		RegistrationVO regsVO = new RegistrationVO();
		RegistrationDeligate regDeligate = new RegistrationDeligate();
		
		try{
			
			
			if(getEmailId()!=null && getEmailId().getValue().toString()!=null){
				regsVO.setEmailId(getEmailId().getValue().toString());
			}
			
			if(getMobileNumber()!=null && getMobileNumber().getValue().toString()!=null){
				regsVO.setMobileNumber(getMobileNumber().getValue().toString());
			}
			
			if(getName()!=null && getName().getValue().toString()!=null){
				regsVO.setName(getName().getValue().toString());
			}
			
			if(getPassword()!=null && getPassword().getValue().toString()!=null){
				regsVO.setPassword(getPassword().getValue().toString());
			}
			
			if(getUserType()!=null && getUserType().getValue().toString()!=null){
				regsVO.setUserType(getUserType().getValue().toString());
			}
			regDeligate.userRegistration(regsVO);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
		
		return "";
	}

}
