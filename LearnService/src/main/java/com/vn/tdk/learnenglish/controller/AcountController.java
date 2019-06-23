package com.vn.tdk.learnenglish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.Account;
import com.vn.tdk.learnenglish.sevices.AcountServices;

@RestController
public class AcountController {
	@Autowired
	AcountServices acountServices;

	@RequestMapping(method = RequestMethod.POST, value = "acount")

	public Integer insertAcount(@RequestBody Account account) {
		return acountServices.insert(account);
	}

	@RequestMapping(method = RequestMethod.POST, value = "acount/register")
	public Integer register(@RequestParam("username") String userName ,@RequestParam("passWord") String passWord,@RequestParam("email") String email,@RequestParam("fullname") String fullname) {
		return acountServices.register(userName, email, fullname, passWord);
	}
	@RequestMapping(method = RequestMethod.PUT,value = "acount/active/{id_acount}")
	public String activeAcounr(@PathVariable("id_acount") Integer id_acount) {
		return acountServices.activeAcount(id_acount);
	}
	@RequestMapping(method = RequestMethod.GET,value = "acount/login")
	public String loginWithAcount(@RequestParam("userName") String userName , @RequestParam("passWord") String passWord) {
		return acountServices.logInWhithAcount(userName, passWord);
	}
}
