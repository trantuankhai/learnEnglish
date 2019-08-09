package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.pattern.LogEvent;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.VocabularyDao;
import com.vn.tdk.learnenglish.entity.Vocabulary;
import com.vn.tdk.learnenglish.util.Status;

@Repository
public class VocabularyDaoImpl implements VocabularyDao {
	private final static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;
	private Logger Log = Logger.getLogger(VocabularyDaoImpl.class.getName());

	@Override
	public Integer insert(Vocabulary vocabulary) {
		session = sessionFactory.openSession();
		Integer idAuto = null;
		try {
			transaction = session.beginTransaction();
			idAuto = (Integer) session.save(vocabulary);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return idAuto;
	}

	@Override
	public String edit(Vocabulary vocabulary) {
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(vocabulary);
			transaction.commit();
			return Status.SUCCESS;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Status.ERROR;
	}

	@Override
	public String delete(Integer id) {
		// Vocabulary vocabulary = getByKey(id);
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			session.delete(session.get(Vocabulary.class, id));
			transaction.commit();
			return Status.SUCCESS;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Status.ERROR;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vocabulary> getAll() {
		session = sessionFactory.openSession();
		List<Vocabulary> vocabularies = null;
		try {
			vocabularies = session.createQuery(
					"from " + Vocabulary.class.getName()).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return vocabularies;
	}

	@Override
	public Vocabulary getByKey(int key) {
		Vocabulary vocabulary = null;
		session = sessionFactory.openSession();
		try {
			vocabulary = session.get(Vocabulary.class, key);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return vocabulary;
	}

}
