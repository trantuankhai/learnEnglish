package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.ActiveUserDao;
import com.vn.tdk.learnenglish.entity.ActiveUser;
import com.vn.tdk.learnenglish.sevices.ActiverUserServices;

@Service
public class ActiveUserServiceImpl implements ActiverUserServices {
	@Autowired
	private ActiveUserDao activeUserDao;

	@Override
	public Integer insert(ActiveUser object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit( ActiveUser object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActiveUser> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActiveUser getByKey(int key) {
		// TODO Auto-generated method stub
		return activeUserDao.getByKey(key);
	}

	@Override
	public List<ActiveUser> getByUserName(int userName) {
		// TODO Auto-generated method stub
		return activeUserDao.getByUserName(userName);
	}

}
