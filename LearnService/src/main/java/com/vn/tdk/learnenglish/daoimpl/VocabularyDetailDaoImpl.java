package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.VocabularyDetailDao;
import com.vn.tdk.learnenglish.entity.Vocabulary;
import com.vn.tdk.learnenglish.entity.VocabularyDetail;
import com.vn.tdk.learnenglish.sevices.VocabularyDetailServices;

@Repository
public class VocabularyDetailDaoImpl implements VocabularyDetailDao {
	private final static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;
	private Logger Log = Logger.getLogger(VocabularyDaoImpl.class.getName());

	@Override
	public Integer insert(VocabularyDetail object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(VocabularyDetail object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VocabularyDetail> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VocabularyDetail getByKey(int key) {
		session = sessionFactory.openSession();
		VocabularyDetail vocabularyDetails = null;
		StringBuilder sql = new StringBuilder();
		sql.append("from "+VocabularyDetail.class.getName()+ " vbd");
		try {
			vocabularyDetails = (VocabularyDetail)session.createQuery(sql.toString()).uniqueResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return vocabularyDetails;
	}

	@Override
	public List<VocabularyDetail> getListVocabularyDetailById(int id) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		List<VocabularyDetail> vocabularyDetails = null;
		StringBuilder sql = new StringBuilder();
		sql.append("from "+VocabularyDetail.class.getName()+ " vbd");
		sql.append(" where vbd.vocabulary.id_vocabulary = :id_vocabulary");
		try {
			vocabularyDetails = session.createQuery(sql.toString()).setParameter("id_vocabulary", id).list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return vocabularyDetails;
	}

}
