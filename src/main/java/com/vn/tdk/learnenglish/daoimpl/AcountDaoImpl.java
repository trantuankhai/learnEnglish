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

}
