package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.FeedBackDao;
import com.vn.tdk.learnenglish.entity.FeedBack;
import com.vn.tdk.learnenglish.sevices.FeedBackService;

@Service
public class FeedBackServiceImpl implements FeedBackService {
	@Autowired
	private FeedBackDao feedBackDao;

	@Override
	public Integer insert(FeedBack object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(Integer id, FeedBack object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FeedBack> getAll() {
		// TODO Auto-generated method stub
		return feedBackDao.getAll();
	}

	@Override
	public FeedBack getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

}
