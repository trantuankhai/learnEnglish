package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.QuestionQuizDao;
import com.vn.tdk.learnenglish.entity.QuestionQuiz;
import com.vn.tdk.learnenglish.sevices.QuestionQuizServices;

@Service
public class QuestionQuizServiceImpl implements QuestionQuizServices {
	@Autowired
	private QuestionQuizDao qusdao;

	@Override
	public Integer insert(QuestionQuiz object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(QuestionQuiz object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionQuiz> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionQuiz getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionQuiz> getQuestionQuizByIdLession(int id_lession) {
		// TODO Auto-generated method stub
		return qusdao.getQuestionQuizByIdLession(id_lession);
	}

}
