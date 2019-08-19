package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.dao.QuestionDao;
import com.vn.tdk.learnenglish.entity.Question;
import com.vn.tdk.learnenglish.sevices.QuestionService;
@CrossOrigin
@RestController
public class QuestionController {
	@Autowired
	private QuestionService questionService;
	@Autowired
	private QuestionDao qs;

	@RequestMapping(value = "question", method = RequestMethod.GET)
	private List<Question> getAllQuestion() {
		return questionService.getAll();
	}
	@RequestMapping(value = "question/{id_lesion}/{id_type}/{order_question}", method = RequestMethod.GET)
	private Question getAllQuestionByIdLesion(@PathVariable int id_lesion,@PathVariable int id_type,@PathVariable int order_question) {
		return qs.getListQuestionByIdLessionAndType(id_lesion, id_type, order_question);
	}
}
