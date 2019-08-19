package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.BasicGrammarDetailDao;
import com.vn.tdk.learnenglish.entity.BasicGrammarDetail;
import com.vn.tdk.learnenglish.sevices.BasicGrammarDetailService;

@Service
public class BasicGramarDetailServiceImpl implements BasicGrammarDetailService {
	@Autowired
	private BasicGrammarDetailDao basicGramarDetail;

	@Override
	public Integer insert(BasicGrammarDetail object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(BasicGrammarDetail object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BasicGrammarDetail> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BasicGrammarDetail getByKey(int key) {
		// TODO Auto-generated method stub
		return basicGramarDetail.getByKey(key);
	}

	@Override
	public List<BasicGrammarDetail> getListBasicGramarDetailByIdGramar(int id) {
		// TODO Auto-generated method stub
		return basicGramarDetail.getListBasicGramarDetailByIdGramar(id);
	}

}
