package com.vn.tdk.learnenglish.sevices;

import javax.servlet.http.HttpServletRequest;

import com.vn.tdk.learnenglish.common.Role;
import com.vn.tdk.learnenglish.entity.Account;

public interface AcountServices extends services<Account> {
	public int register(String username, String Email, String fullname,
			String passWord);

	public String activeAcount(Integer id_acount);

	public String nonActiveAcount(int id_acount);

	public String logInWhithAcount(String userName, String passWord);

	public Account getAcountByUserName(String userName);

	public Account getAcountByToken(HttpServletRequest request);

	public int addAcountWithRoleAdmin(String username, String Email,
			String fullname, String passWord, Role role);
}
