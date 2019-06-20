package com.vn.tdk.learnenglish.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.vn.tdk.learnenglish.entity.*;

public class UserDao {
	private final static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public static List<User> listDeparts() {
		Session session = sessionFactory.openSession();
		List<User> listDeparts = null;
		try {
			session.getTransaction().begin();
			Query<User> query = session.createQuery("from "+User.class.getName());
			listDeparts = query.list();
			session.getTransaction().commit();

		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
		} finally {
			session.close();
		}
		return listDeparts;
	}
	public static void main(String[] args) {
		List<User> users = listDeparts();
	}
}
