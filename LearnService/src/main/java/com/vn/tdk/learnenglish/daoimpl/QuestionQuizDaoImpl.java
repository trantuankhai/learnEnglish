package com.vn.tdk.learnenglish.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vn.tdk.learnenglish.dao.QuestionQuizDao;
import com.vn.tdk.learnenglish.entity.Question;
import com.vn.tdk.learnenglish.entity.QuestionQuiz;
@Repository
public class QuestionQuizDaoImpl implements QuestionQuizDao {
	private final static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	private static Session session;
	private static Transaction transaction;
	@Override
	public Integer insert(QuestionQuiz object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(QuestionQuiz object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionQuiz> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionQuiz getByKey(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionQuiz> getQuestionQuizByIdLession(int id_question) {
		session = sessionFactory.openSession();
		List<QuestionQuiz> questionQuizs = null;
		try {
			questionQuizs = session.createQuery("from " + QuestionQuiz.class.getName()+ " qs where qs.question.id_question = :id_question")
					.setParameter("id_question", id_question)
					.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return questionQuizs;
	}

	@Override
	public Integer checkAnswerCorrect(int id_question_quiz) {
		session = sessionFactory.openSession();
		Integer result = 0;
		try {
			result =(Integer) session.createQuery("select is_true from "+QuestionQuiz.class.getName()+" where id_question_quiz = :id_question_quiz")
					.setParameter("id_question_quiz", id_question_quiz)
					.uniqueResult();
			System.out.println(result);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return result;
	}

}
