package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.ActiveUserDao;
import com.vn.tdk.learnenglish.entity.ActiveUser;
import com.vn.tdk.learnenglish.util.Status;
@Repository
public class ActiveUserDaoImpl implements ActiveUserDao {
	private final static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;

	@Override
	public Integer insert(ActiveUser object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(ActiveUser object) {
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
		session = sessionFactory.openSession();
		try {
			return session.get(ActiveUser.class, key);
		} catch (HibernateError e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<ActiveUser> getByUserName(int userName) {
		session = sessionFactory.openSession();
		List<ActiveUser> listActiveUsers = null;
		
		try {
			listActiveUsers = session.createQuery("from "+ActiveUser.class.getName()+" where Id_Acount =:Id_Acount").setParameter("Id_Acount", userName).list();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			session.close();
		}
		return listActiveUsers;
	}

}
