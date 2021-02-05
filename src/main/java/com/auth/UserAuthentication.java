//package com.auth;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.config.CLECConfiguration;
//
//@Component
//public class UserAuthentication {
//
//	@Autowired
//	CLECConfiguration nsConfiguraiton;
//
//	private static Logger logger = LoggerFactory.getLogger(UserAuthentication.class);
//
//	public boolean authenticateUser(String userName, String password) {
//		boolean response = false;
//
//		if ((userName == null) || (password == null)) {
//			response = false;
//			
//		} else {
//
//			if (userName.equals(nsConfiguraiton.getUserid()) && password.equals(nsConfiguraiton.getPassword())) {
//				response = true;
//				// logger.info("username: " + userName + " , password: " + password);
//
//			} else {
//				response = false;
//			}
//		}
//		return response;
//	}
//}
