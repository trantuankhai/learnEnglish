package com.vn.tdk.learnenglish.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.AcountDao;
import com.vn.tdk.learnenglish.entity.Account;



@Service
public class MyUserDetails implements UserDetailsService {



	@Autowired
	private AcountDao acountDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = acountDao.getAcountByUserName(username);
		if (account == null)
			return null;
		return User.withUsername(username).password(account.getPassWord()).roles(account.getRole().toString()).accountExpired(false).accountLocked(false)
				.credentialsExpired(false).disabled(false).build();
	}

}
