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

	public static List<Activity> listDeparts() {
		Session session = sessionFactory.openSession();
		List<Activity> listDeparts = null;
		try {
			session.getTransaction().begin();
			Query<Activity> query = session.createQuery("from "+Activity.class.getName());
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
		List<Activity> users = listDeparts();
	}
}
