package com.vn.tdk.learnenglish.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.AcountDao;
import com.vn.tdk.learnenglish.entity.Account;
import com.vn.tdk.learnenglish.mailServices.MailServices;
import com.vn.tdk.learnenglish.sevices.AcountServices;
import com.vn.tdk.learnenglish.util.ConstanValue;
import com.vn.tdk.learnenglish.util.Status;

@Service
public class AcountServiesImpl implements AcountServices {
	@Autowired
	AcountDao acountDao;
	@Autowired
	MailServices mailServices;

	@Override
	public Integer insert(Account object) {
		// TODO Auto-generated method stub
		return acountDao.insert(object);
	}

	@Override
	public String edit(Integer id, Account object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int register(String username, String Email, String fullname, String passWord) {
		if (ConstanValue.NULL_VALUE.equals(username) || ConstanValue.NULL_VALUE.equals(Email)
				|| ConstanValue.NULL_VALUE.equals(fullname) || ConstanValue.NULL_VALUE.equals(passWord)) {
			return Status.ERROR_ADD_NULL;
		} else {
			String passWordHash = getHashPassword(passWord);
			Integer id_acount = acountDao.register(username, Email, fullname, passWordHash);
			if (id_acount != Status.STATUS_ADD_ERROR) {
				String statusSendMail = mailServices.sendMail(Email, id_acount);
				return id_acount;
			} else {
				return Status.STATUS_ADD_ERROR;
			}

		}

	}

	public String getHashPassword(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(password);
	}

	@Override
	public String activeAcount(Integer id_acount) {
		// TODO Auto-generated method stub
		if(id_acount !=null) {
			return acountDao.activeAcount(id_acount);
		}else {
			return Status.ERROR;
		}
	
	}

}
