package com.project.rest;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.model.UserDetail;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
		
		
		
		JSONObject employeeDetails = new JSONObject();
		UserDetail userDetail = new UserDetail();
		employeeDetails.put("id", userDetail.getUserDetailId());
		employeeDetails.put("firstName", userDetail.getFirstName());
		employeeDetails.put("lastName", userDetail.getLastName());
		employeeDetails.put("birthOfDate", userDetail.getBirthOfDate());
		
		JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee", employeeDetails);
		
		JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
		
		try (FileWriter file = new FileWriter("jsonObject.json")) {
			
			file.write(employeeList.toJSONString());
			file.flush();
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
	}
}