package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.LessionTypeDao;
import com.vn.tdk.learnenglish.entity.Lession_Type;

@Repository
public class LessionTypeDaoImpl implements LessionTypeDao{
	private final static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;
	@Override
	public Integer insert(Lession_Type object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(Lession_Type object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lession_Type> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lession_Type getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lession_Type> getListLesionTypeByIdLessin(int id_lession) {
		List<Lession_Type> lession_Types = null;
		try {
			session = sessionFactory.openSession();
			lession_Types =	session.createQuery("from "+Lession_Type.class.getName()+" lt " +"where lt.basicGrammarDetail.id_basic_grammar_detail = :id_basic_grammar_detail")
					.setParameter("id_basic_grammar_detail", id_lession).list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return lession_Types;
	}

}
