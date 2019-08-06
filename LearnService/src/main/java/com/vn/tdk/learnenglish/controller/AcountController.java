package com.vn.tdk.learnenglish.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.Account;
import com.vn.tdk.learnenglish.sevices.AcountServices;
@CrossOrigin
@RestController
public class AcountController {
	@Autowired
	AcountServices acountServices;

	@RequestMapping(method = RequestMethod.POST, value = "acount/register")
	public Integer register(@RequestParam("userName") String userName,
			@RequestParam("passWord") String passWord,
			@RequestParam("email") String email,
			@RequestParam("fullName") String fullname) {
		return acountServices.register(userName, email, fullname, passWord);
	}

	@RequestMapping(method = RequestMethod.GET, value = "acount/active/{id_acount}")
	public String activeAcounr(@PathVariable("id_acount") Integer id_acount) {
		return acountServices.activeAcount(id_acount);
	}

	@RequestMapping(method = RequestMethod.GET, value = "acount/login")
	public String loginWithAcount(@RequestParam("userName") String userName,
			@RequestParam("passWord") String passWord) {
		return acountServices.logInWhithAcount(userName, passWord);
	}
	@RequestMapping(method = RequestMethod.GET, value = "acount/resolveToken")
	public Account loginWithAcount(HttpServletRequest request) {
		return acountServices.getAcountByToken(request);
	}
}
