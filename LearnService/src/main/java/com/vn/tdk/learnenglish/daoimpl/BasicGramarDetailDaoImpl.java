package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.BasicGrammarDetailDao;
import com.vn.tdk.learnenglish.entity.BasicGrammarDetail;
import com.vn.tdk.learnenglish.entity.VocabularyDetail;
@Repository
public class BasicGramarDetailDaoImpl implements BasicGrammarDetailDao {
	private final static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;
	private Logger Log = Logger.getLogger(VocabularyDaoImpl.class.getName());
	@Override
	public Integer insert(BasicGrammarDetail object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(BasicGrammarDetail object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BasicGrammarDetail> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BasicGrammarDetail getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BasicGrammarDetail> getListBasicGramarDetailByIdGramar(int id) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		List<BasicGrammarDetail> basicGrammarDetails = null;
		StringBuilder sql = new StringBuilder();
		sql.append("from "+BasicGrammarDetail.class.getName()+ " bsgd");
		sql.append(" where bsgd.basicGrammar.id_basic_grammar = :id_basic_grammar");
		try {
			basicGrammarDetails = session.createQuery(sql.toString()).setParameter("id_basic_grammar", id).list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return basicGrammarDetails;
	}

}
