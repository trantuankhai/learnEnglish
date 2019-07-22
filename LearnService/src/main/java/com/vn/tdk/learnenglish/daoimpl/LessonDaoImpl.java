package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.LessonDao;
import com.vn.tdk.learnenglish.entity.Lesson;

@Repository
public class LessonDaoImpl implements LessonDao {
	private final static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;

	@Override
	public Integer insert(Lesson object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(Lesson object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lesson> getAll() {
		session = sessionFactory.openSession();
		List<Lesson> lessons = null;
		try {
			lessons = session.createQuery("from " + Lesson.class.getName()).list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return lessons;
	}

	@Override
	public Lesson getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

}
