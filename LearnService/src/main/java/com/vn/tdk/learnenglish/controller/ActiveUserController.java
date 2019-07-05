package com.vn.tdk.learnenglish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.ActiveUser;
import com.vn.tdk.learnenglish.sevices.ActiverUserServices;

@RestController
public class ActiveUserController {
	@Autowired
	private ActiverUserServices activerUserServices;
	@RequestMapping(value = "active/{id}" , method  = RequestMethod.GET)
	private ActiveUser getActiveUserById(@PathVariable("id") int id){
		return activerUserServices.getByKey(id);
		
	}
}
