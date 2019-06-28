package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.ThemeDao;
import com.vn.tdk.learnenglish.entity.Theme;
import com.vn.tdk.learnenglish.util.Status;

@Repository
public class ThemeDaoImpl implements ThemeDao {
	private final static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;

	@Override
	public Integer insert(Theme theme) {
		Integer id;
		session = sessionFactory.openSession();
		try {
			transaction = session.getTransaction();
			id = (Integer) session.save(theme);
			transaction.commit();
			return id;
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return Status.STATUS_ADD_ERROR;
	}

	@Override
	public String edit(Theme object) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("all")
	@Override
	public List<Theme> getAll() {
		session = sessionFactory.openSession();
		List<Theme> themes = null;
		String hql = "from " + Theme.class.getName();
		try {
			themes = session.createQuery(hql.toString()).list();
			return themes;
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return null;
	}

	@Override
	public Theme getByKey(int key) {
		Theme theme = null;
		session = sessionFactory.openSession();
		try {
			transaction = session.getTransaction();
			theme = session.get(Theme.class, key);
			transaction.commit();
			return theme;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return null;
	}

	@Override
	public String delete(Integer id) {
		Theme theme = getByKey(id);
		session = sessionFactory.openSession();
		try {
			transaction = session.getTransaction();
			session.delete(theme);
			transaction.commit();
			return Status.SUCCESS;
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return Status.ERROR;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Theme> getThem(int min, int max) {
		List<Theme> themes = null;
		session = sessionFactory.openSession();
		String hql = "from " + Theme.class.getName();
		try {
			return themes = session.createQuery(hql.toString()).setFirstResult(min).setMaxResults(max).list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return null;
	}

}
