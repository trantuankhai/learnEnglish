package com.vn.tdk.learnenglish.daoimpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.common.Role;
import com.vn.tdk.learnenglish.dao.AcountDao;
import com.vn.tdk.learnenglish.entity.Account;
import com.vn.tdk.learnenglish.util.Status;

@Repository
public class AcountDaoImpl implements AcountDao {
	private final static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;
	private static Logger log = Logger.getLogger(AcountDaoImpl.class.getName());
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();

	@Override
	public Integer insert(Account object) {
		Integer id = null;
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			id = (Integer) session.save(object);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
		} finally {
			session.close();
		}
		return id;
	}

	@Override
	public String edit(Account account) {
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(account);
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
		Account account = getByKey(id);
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			session.delete(account);
			transaction.commit();
			return Status.SUCCESS;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Status.ERROR;
	}

	@SuppressWarnings("all")
	@Override
	public List<Account> getAll() {
		List<Account> acount = null;
		session = sessionFactory.openSession();
		String hql = "from " + Account.class.getName();
		try {
			acount = session.createQuery(hql.toString()).list();
		} catch (HibernateException e) {
		} finally {
			session.close();
		}
		return acount;

	}

	@Override
	public int register(String username, String Email, String fullname,
			String passWord) {
		Account acount = new Account.AcountBuilder(username, passWord, Email)
				.withFullName(fullname).withIsActive(Status.NONE_ACTIVE)
				.withRole(Role.USER).withDateCreate(new Date().toString())
				.build();
		Integer id = null;
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			id = (Integer) session.save(acount);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
		} finally {
			session.close();
		}
		return id;
	}

	@Override
	public Account getByKey(int key) {
		session = sessionFactory.openSession();
		try {
			return session.get(Account.class, key);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public String activeAcount(int id_acount) {
		Account acount = getByKey(id_acount);
		acount.setIsActive(Status.ACTIVE);
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			session.update(acount);
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

	@Override
	public Account logInWhithAcount(String userName, String passWord) {
		session = sessionFactory.openSession();
		StringBuilder hql = new StringBuilder();
		hql.append("from " + Account.class.getName() + " ac");
		hql.append(" where ac.userName = :userName ");
		hql.append(" and ac.passWord = :passWord ");
		Account account = null;
		try {
			account = (Account) session.createQuery(hql.toString())
					.setParameter("userName", userName)
					.setParameter("passWord", passWord).uniqueResult();
			log.info("User " + userName + "login at " + dtf.format(now));
			return account;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return null;
	}

	@Override
	public Account getAcountByUserName(String userName) {
		session = sessionFactory.openSession();
		StringBuilder hql = new StringBuilder();
		hql.append("from " + Account.class.getName() + " ac");
		hql.append(" where ac.userName = :userName ");
		Account account = null;
		try {
			account = (Account) session.createQuery(hql.toString())
					.setParameter("userName", userName).uniqueResult();
			return account;
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
	public String nonActiveAcount(int id_acount) {
		Account acount = getByKey(id_acount);
		acount.setIsActive(Status.NONE_ACTIVE);
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			session.update(acount);
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

	@Override
	public int addAcountWithRoleAdmin(String username, String Email,
			String fullname, String passWord, Role role) {
		Account acount = new Account.AcountBuilder(username, passWord, Email)
				.withFullName(fullname).withIsActive(Status.ACTIVE)
				.withRole(role).withDateCreate(new Date().toString())
				.build();
		Integer id = null;
		session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			id = (Integer) session.save(acount);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
		} finally {
			session.close();
		}
		return id;
	}

}
