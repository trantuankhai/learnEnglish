package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.QuestionDao;
import com.vn.tdk.learnenglish.entity.Lesson;
import com.vn.tdk.learnenglish.entity.Question;

@Repository
public class QuestionDaoImpl implements QuestionDao {
	private final static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;

	@Override
	public Integer insert(Question object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(Question object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getAll() {
		session = sessionFactory.openSession();
		List<Question> questions = null;
		try {
			questions = session.createQuery("from " + Question.class.getName()).list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return questions;
	}

	@Override
	public Question getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

}
