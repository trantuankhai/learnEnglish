package com.vn.tdk.learnenglish.dao;

import com.vn.tdk.learnenglish.entity.Account;

public interface AcountDao extends TempleteDao<Account> {
	int register(String username, String Email, String fullname, String passWord);

	String activeAcount(int id_acount);

	Account logInWhithAcount(String userName, String passWord);

	Account getAcountByUserName(String userName);
}
