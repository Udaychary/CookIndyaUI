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
			
			if(getName()!=null && getName().getValue().toString()!=null){
				regsVO.setName(getName().getValue().toString());
			}
			
			if(getUserType()!=null && getUserType().getValue().toString()!=null){
				regsVO.setUserType(getUserType().getValue().toString());
			}
			
			System.out.println(getName().getValue().toString() +  "  " +getUserType().getValue().toString() );
			
			regDeligate.userRegistration(regsVO);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
		
		return "";
	}

}
