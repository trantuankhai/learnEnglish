package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.ActiveUser;
import com.vn.tdk.learnenglish.sevices.ActiverUserServices;
@CrossOrigin
@RestController
public class ActiveUserController {
	@Autowired
	private ActiverUserServices activerUserServices;
	@RequestMapping(value = "active/{userName}" , method  = RequestMethod.GET)
	private List<ActiveUser> getListActiveUserById(@PathVariable("userName") int userName){
		return activerUserServices.getByUserName(userName);
		
	}
}
