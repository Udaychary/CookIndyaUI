package com.cookIndya.Service;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ServiceImpl implements ServiceIn {

	@Override
	public void userRegistration(JSONObject userInfoJson) throws Exception {
		// TODO Auto-generated method stub
		try{
			
			System.out.println("Input JSON is " + userInfoJson);
			
			Client client = Client.create();
			
			WebResource webResource = client.resource("http://localhost:8080/cookindya/api/user/register");
			
			ClientResponse response = webResource.type("application/json").post(ClientResponse.class,userInfoJson.toString());
			
			if(response.getStatus() != 200){
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}
			
			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
