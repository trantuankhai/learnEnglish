package com.vn.tdk.learnenglish.dao;

import java.util.List;

import com.vn.tdk.learnenglish.entity.ActiveUser;

public interface ActiveUserDao extends TempleteDao<ActiveUser> {
	public List<ActiveUser> getByUserName(int userName);

}
