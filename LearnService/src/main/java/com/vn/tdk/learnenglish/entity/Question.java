package com.vn.tdk.learnenglish.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tb_Question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_question")
	private int id_question;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_lesson", nullable = false)
	private Lesson lesson;
	@Column(name = "content_question")
	private String content_question;

	public Question() {
		super();
	}

	public Question(int id_question, Lesson lesson, String content_question) {
		super();
		this.id_question = id_question;
		this.lesson = lesson;
		this.content_question = content_question;
	}

	public int getId_question() {
		return id_question;
	}

	public void setId_question(int id_question) {
		this.id_question = id_question;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public String getContent_question() {
		return content_question;
	}

	public void setContent_question(String content_question) {
		this.content_question = content_question;
	}

}
