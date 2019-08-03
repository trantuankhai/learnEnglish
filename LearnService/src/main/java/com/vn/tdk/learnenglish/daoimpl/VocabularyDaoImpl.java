package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.pattern.LogEvent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.VocabularyDao;
import com.vn.tdk.learnenglish.entity.Vocabulary;

@Repository
public class VocabularyDaoImpl implements VocabularyDao {
	private final static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;
	private Logger Log = Logger.getLogger(VocabularyDaoImpl.class.getName());

	@Override
	public Integer insert(Vocabulary object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(Vocabulary object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vocabulary> getAll() {
		session = sessionFactory.openSession();
		List<Vocabulary> vocabularies = null;
		try {
			vocabularies = session.createQuery("from " + Vocabulary.class.getName()).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return vocabularies;
	}

	@Override
	public Vocabulary getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

}
