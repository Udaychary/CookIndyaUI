package com.cookIndya.BackingBean;

import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;

public class RegistrationBackingBean {
	
	private HtmlInputText name;
	private HtmlInputText emailId;
	private HtmlInputSecret password;
	private HtmlInputSecret confirmPwd;
	private HtmlInputText mobileNumber;
	private HtmlInputText add1;
	private HtmlInputText add2;
	private HtmlInputText postalCode;
	private HtmlInputText shopName;
	private HtmlInputText aboutMe;
	private HtmlInputText expertise;
	
	

	public HtmlInputText getEmailId() {
		return emailId;
	}

	public void setEmailId(HtmlInputText emailId) {
		this.emailId = emailId;
	}

	public HtmlInputSecret getPassword() {
		return password;
	}

	public void setPassword(HtmlInputSecret password) {
		this.password = password;
	}

	public HtmlInputSecret getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(HtmlInputSecret confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public HtmlInputText getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(HtmlInputText mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public HtmlInputText getAdd1() {
		return add1;
	}

	public void setAdd1(HtmlInputText add1) {
		this.add1 = add1;
	}

	public HtmlInputText getAdd2() {
		return add2;
	}

	public void setAdd2(HtmlInputText add2) {
		this.add2 = add2;
	}

	public HtmlInputText getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(HtmlInputText postalCode) {
		this.postalCode = postalCode;
	}

	public HtmlInputText getShopName() {
		return shopName;
	}

	public void setShopName(HtmlInputText shopName) {
		this.shopName = shopName;
	}

	

	public HtmlInputText getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(HtmlInputText aboutMe) {
		this.aboutMe = aboutMe;
	}

	public HtmlInputText getExpertise() {
		return expertise;
	}

	public void setExpertise(HtmlInputText expertise) {
		this.expertise = expertise;
	}

	public HtmlInputText getName() {
		return name;
	}

	public void setName(HtmlInputText name) {
		this.name = name;
	}
	
	

}
