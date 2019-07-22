package com.vn.tdk.learnenglish.servicesImpl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.vn.tdk.learnenglish.dao.AcountDao;
import com.vn.tdk.learnenglish.entity.Account;
import com.vn.tdk.learnenglish.mailServices.MailServices;
import com.vn.tdk.learnenglish.security.JwtTokenProvider;
import com.vn.tdk.learnenglish.sevices.AcountServices;
import com.vn.tdk.learnenglish.util.ConstanValue;
import com.vn.tdk.learnenglish.util.Status;

@Service
public class AcountServiesImpl implements AcountServices {
	@Autowired
	AcountDao acountDao;
	@Autowired
	MailServices mailServices;
	@Autowired
	JwtTokenProvider token;

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
		return acountDao.getAll();
	}

	@Override
	public int register(String username, String Email, String fullname,
			String passWord) {
		if (ConstanValue.NULL_VALUE.equals(username)
				|| ConstanValue.NULL_VALUE.equals(Email)
				|| ConstanValue.NULL_VALUE.equals(fullname)
				|| ConstanValue.NULL_VALUE.equals(passWord)) {
			return Status.ERROR_ADD_NULL;
		} else if (getAcountByUserName(username) != null) {
			return Status.ACOUNT_EXITS;
		} else {
			String passWordHash = getHashPasswordMD5(passWord);
			Integer id_acount = acountDao.register(username, Email, fullname,
					passWordHash);
			if (id_acount != Status.STATUS_ADD_ERROR) {
				String statusSendMail = mailServices.sendMail(Email, id_acount);
				return id_acount;
			} else {
				return Status.STATUS_ADD_ERROR;
			}

		}

	}

	public String getHashPasswordMD5(String passWord) {
		String result = "";
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
			digest.update(passWord.getBytes());
			BigInteger bigInteger = new BigInteger(1, digest.digest());
			result = bigInteger.toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String getHashPassword(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(password);
	}

	@Override
	public String activeAcount(Integer id_acount) {
		if (id_acount != null) {
			return acountDao.activeAcount(id_acount);
		} else {
			return Status.INPUT_NULL;
		}

	}

	@Override
	public String logInWhithAcount(String userName, String passWord) {
		if (ConstanValue.NULL_VALUE.equals(userName)
				|| ConstanValue.NULL_VALUE.equals(passWord)) {
			return Status.INPUT_NULL;
		} else {
			String hashPassWord = getHashPasswordMD5(passWord);
			Account account = acountDao
					.logInWhithAcount(userName, hashPassWord);
			if (account != null) {
				if (account.getIsActive() == Status.ACTIVE) {
					return token.createToken(userName);
				} else {
					return Status.STATUS_NONE_ACTIVE;
				}

			} else {
				return Status.ACOUNT_NOT_AVALABLE;
			}
		}
	}

	@Override
	public Account getAcountByUserName(String userName) {
		if (!ConstanValue.NULL_VALUE.equals(userName)) {
			return acountDao.getAcountByUserName(userName);
		} else {
			return null;
		}
	}

	@Override
	public Account getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAcountByToken(HttpServletRequest request) {
		return acountDao.getAcountByUserName(token.getUsername(token.resolveToken(request)));
	}

}
