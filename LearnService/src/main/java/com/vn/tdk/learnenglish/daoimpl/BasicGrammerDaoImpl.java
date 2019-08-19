package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.BasicGrammerDao;
import com.vn.tdk.learnenglish.entity.BasicGrammar;
@Repository
public class BasicGrammerDaoImpl implements BasicGrammerDao {
	private final static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;

	@Override
	public Integer insert(BasicGrammar object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(BasicGrammar object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BasicGrammar> getAll() {
		session = sessionFactory.openSession();
		List<BasicGrammar> basicGrammars = null;
		try {
			basicGrammars = session.createQuery(
					"from " + BasicGrammar.class.getName()).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return basicGrammars;
	}

	@Override
	public BasicGrammar getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

}
