package com.vn.tdk.learnenglish.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tb_Question_Quiz")
public class QuestionQuiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_question_quiz")
	private int id_question_quiz;
	@Column(name = "answer")
	private String answer;
	@Column(name = "is_true")
	private Integer is_true;
	@ManyToOne
	@JoinColumn(name = "id_question")
	private Question question;

	public QuestionQuiz() {
		super();
	}

	public int getId_question_quiz() {
		return id_question_quiz;
	}

	public void setId_question_quiz(int id_question_quiz) {
		this.id_question_quiz = id_question_quiz;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getIs_true() {
		return is_true;
	}

	public void setIs_true(Integer is_true) {
		this.is_true = is_true;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public QuestionQuiz(String answer, Integer is_true, Question question) {
		super();
		this.answer = answer;
		this.is_true = is_true;
		this.question = question;
	}
	

}
