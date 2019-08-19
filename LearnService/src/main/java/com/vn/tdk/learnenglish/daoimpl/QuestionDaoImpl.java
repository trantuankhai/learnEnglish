package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.QuestionDao;
import com.vn.tdk.learnenglish.entity.Question;
import com.vn.tdk.learnenglish.entity.VocabularyDetail;

@Repository
public class QuestionDaoImpl implements QuestionDao {
	private final static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;

	@Override
	public Integer insert(Question object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(Question object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getAll() {
		session = sessionFactory.openSession();
		List<Question> questions = null;
		try {
			questions = session.createQuery("from " + Question.class.getName()).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return questions;
	}

	@Override
	public Question getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> getListQuestionByIdLession(int id_lession) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		List<Question> questions = null;
		StringBuilder sql = new StringBuilder();
		sql.append("from " + Question.class.getName() + " qs");
		sql.append(" where qs.BasicGrammarDetail.id_basic_grammar_detail = :id_basic_grammar_detail");
		try {
			questions = session.createQuery(sql.toString()).setParameter("id_basic_grammar_detail", id_lession).list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return questions;
	}

	@Override
	public Question getListQuestionByIdLessionAndType(int id_lession, int id_type, int order) {
		Question question = null;
		StringBuilder sql = new StringBuilder();
		sql.append("select *  from Tb_Question ");
		sql.append(" join Tb_Lession_Type on Tb_Question.id_lession_type = Tb_Lession_Type.id_lession_type ");
		sql.append(" where Tb_Lession_Type.id_basic_grammar_detail = " + id_lession);
		sql.append(" and Tb_Lession_Type.id_type = " + id_type);
		sql.append(" and Tb_Question.order_question = " + order);
		session = sessionFactory.openSession();
		try {
			question = (Question) session.createNativeQuery(sql.toString(), Question.class).uniqueResult();
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return question;
	}

	@Override
	public Question getListQuestionByIdLessionAndTypeAndIdQuestion(int id_lession, int id_type, int id_question,
			int order) {
		Question question = null;
		StringBuilder sql = new StringBuilder();
		sql.append("select *  from Tb_Question ");
		sql.append(" join Tb_Lession_Type on Tb_Question.id_lession_type = Tb_Lession_Type.id_lession_type ");
		sql.append(" where Tb_Lession_Type.id_basic_grammar_detail = " + id_lession);
		sql.append(" and Tb_Lession_Type.id_type = " + id_type);
		sql.append(" and Tb_Question.order_question = " + order);
		session = sessionFactory.openSession();
		try {
			question = (Question) session.createNativeQuery(sql.toString(), Question.class).uniqueResult();
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return question;
	}

}
