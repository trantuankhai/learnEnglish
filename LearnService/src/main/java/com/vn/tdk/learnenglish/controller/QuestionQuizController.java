package com.vn.tdk.learnenglish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tdk.learnenglish.dao.QuestionQuizDao;
import com.vn.tdk.learnenglish.entity.QuestionQuiz;
import com.vn.tdk.learnenglish.sevices.QuestionQuizServices;

@RestController
public class QuestionQuizController {
	@Autowired
	private QuestionQuizServices qtsv;
	@Autowired
	private QuestionQuizDao qs;

	@RequestMapping(method = RequestMethod.GET, value = "questionQuiz/{id_question}")
	public List<QuestionQuiz> getQuestionQuizByIdQuestion(@PathVariable int id_question) {
		return qtsv.getQuestionQuizByIdLession(id_question);
	}
	@RequestMapping(method = RequestMethod.GET, value = "checkAnswerCorrect/{id_question_quiz}")
	public int checkAnswerCorrect (@PathVariable int id_question_quiz) {
		return qs.checkAnswerCorrect(id_question_quiz);
	}
}
