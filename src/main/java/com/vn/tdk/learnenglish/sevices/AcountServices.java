package com.vn.tdk.learnenglish.sevices;

import com.vn.tdk.learnenglish.entity.Account;

public interface AcountServices extends services<Account> {
	public int register(String username, String Email, String fullname, String passWord);

	String activeAcount(Integer id_acount);
}
