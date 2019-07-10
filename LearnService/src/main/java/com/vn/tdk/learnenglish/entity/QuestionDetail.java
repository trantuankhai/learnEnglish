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
@Table(name = "tb_question_detail")
public class QuestionDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_question_detail")
	private int id_question_detail;
	@ManyToOne
	@JoinColumn(name = "id_question")
	private Question Question;
	@Column(name = "answer_question")
	private String answer_question;
	@Column(name = "correct_answer_question")
	private String correct_answer_question;

	public QuestionDetail() {
		super();
	}

	public QuestionDetail(int id_question_detail, Question question, String answer_question,
			String correct_answer_question) {
		super();
		this.Question = question;
		this.id_question_detail = id_question_detail;
		this.answer_question = answer_question;
		this.correct_answer_question = correct_answer_question;
	}

	public Question getQuestion() {
		return Question;
	}

	public void setQuestion(Question question) {
		Question = question;
	}

	public int getId_question_detail() {
		return id_question_detail;
	}

	public void setId_question_detail(int id_question_detail) {
		this.id_question_detail = id_question_detail;
	}

	public String getAnswer_question() {
		return answer_question;
	}

	public void setAnswer_question(String answer_question) {
		this.answer_question = answer_question;
	}

	public String getCorrect_answer_question() {
		return correct_answer_question;
	}

	public void setCorrect_answer_question(String correct_answer_question) {
		this.correct_answer_question = correct_answer_question;
	}
}
