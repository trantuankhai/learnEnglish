package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.BasicGrammerDao;
import com.vn.tdk.learnenglish.entity.BasicGrammar;
import com.vn.tdk.learnenglish.sevices.BasicGrammerService;

@Service
public class BasicGrammerServiceImpl implements BasicGrammerService {
	@Autowired
	private BasicGrammerDao BasicGrammerDao;

	@Override
	public Integer insert(BasicGrammar object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(Integer id, BasicGrammar object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BasicGrammar> getAll() {
		// TODO Auto-generated method stub
		return BasicGrammerDao.getAll();
	}

	@Override
	public BasicGrammar getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

}
