package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.BasicGrammarDetail;
import com.vn.tdk.learnenglish.sevices.BasicGrammarDetailService;

@RestController
public class BasicGramarDetailController {
	@Autowired
	BasicGrammarDetailService bsgds;
	@RequestMapping(method = RequestMethod.GET, value = "basicGrammarDetail/{id}")
	public List<BasicGrammarDetail> getListBasicGrammarDetailByID(@PathVariable int id) {
		return bsgds.getListBasicGramarDetailByIdGramar(id);

	}
	@RequestMapping(method = RequestMethod.GET, value = "basicGrammarDetail/key/{id}")
	public BasicGrammarDetail getListBasicGrammarDetailBykey(@PathVariable int id) {
		return bsgds.getByKey(id);

	}
}
