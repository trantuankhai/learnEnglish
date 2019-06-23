package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.apache.catalina.CredentialHandler;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.AcountDao;
import com.vn.tdk.learnenglish.entity.Account;
import com.vn.tdk.learnenglish.util.Status;

@Repository
public class AcountDaoImpl implements AcountDao {
	private final static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;

	@Override
	public Integer insert(Account object) {
		Integer id = null;
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			id = (Integer) session.save(object);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
		} finally {
			session.close();
		}
		return id;
	}

	@Override
	public String edit(Account object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Account object) {
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
		Account acount = new Account.AcountBuilder(username, passWord, Email).withFullName(fullname).withIsActive(0)
				.build();
		Integer id = null;
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			id = (Integer) session.save(acount);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
		} finally {
			session.close();
		}
		return id;
	}

	@Override
	public Account getByKey(int key) {
		session = sessionFactory.openSession();
		try {
			return session.get(Account.class, key);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public String activeAcount(int id_acount) {
		Account acount = getByKey(id_acount);
		Account accountUpdate = new Account.AcountBuilder(acount.getUserName(), acount.getPassWord(),
				acount.getEmail_address()).withAddress(acount.getAddress()).withFullName(acount.getFullName())
						.withIsActive(1).withPhone(acount.getPhone()).withRole(acount.getRole())
						.withSex(acount.getSex()).build();

		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			session.update(accountUpdate);
			transaction.commit();
			return Status.SUCCESS;
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return Status.ERROR;
	}

}
