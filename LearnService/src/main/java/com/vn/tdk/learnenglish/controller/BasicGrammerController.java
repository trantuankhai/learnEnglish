package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.BasicGrammar;
import com.vn.tdk.learnenglish.sevices.BasicGrammerService;

@RestController
public class BasicGrammerController {
	@Autowired
	private BasicGrammerService basicGrammerService;

	@RequestMapping(method = RequestMethod.GET, value = "basicGrammar")
	public List<BasicGrammar> getListBasicGrammar() {
		return basicGrammerService.getAll();

	}
}
