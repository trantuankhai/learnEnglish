package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.QuestionDao;
import com.vn.tdk.learnenglish.entity.Question;
import com.vn.tdk.learnenglish.sevices.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	private QuestionDao questionDao;

	@Override
	public Integer insert(Question object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit( Question object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getAll() {
		// TODO Auto-generated method stub
		return questionDao.getAll();
	}

	@Override
	public Question getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getListQuestionByIdLession(int id_lession) {
		// TODO Auto-generated method stub
		return questionDao.getListQuestionByIdLession(id_lession);
	}

}
