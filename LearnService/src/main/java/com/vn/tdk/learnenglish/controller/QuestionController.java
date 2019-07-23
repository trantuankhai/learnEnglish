package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.entity.Question;
import com.vn.tdk.learnenglish.sevices.QuestionService;
@CrossOrigin
@RestController
public class QuestionController {
	@Autowired
	private QuestionService questionService;

	@RequestMapping(value = "question", method = RequestMethod.GET)
	private List<Question> getAllQuestion() {
		return questionService.getAll();
	}
}
