package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.FeedBackDao;
import com.vn.tdk.learnenglish.entity.FeedBack;
import com.vn.tdk.learnenglish.entity.Lesson;
@Repository
public class FeedBackDaoImpl implements FeedBackDao {
	private final static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;

	@Override
	public Integer insert(FeedBack object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(FeedBack object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FeedBack> getAll() {
		session = sessionFactory.openSession();
		List<FeedBack> feedBacks = null;
		try {
			feedBacks = session.createQuery("from " + FeedBack.class.getName()).list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return feedBacks;
	}

	@Override
	public FeedBack getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

}
