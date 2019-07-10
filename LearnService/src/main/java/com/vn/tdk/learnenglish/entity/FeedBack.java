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
@Table(name = "tb_feedBack")
public class FeedBack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_feedBack")
	private int id_feedBack;
	@ManyToOne
	@JoinColumn(name = "id_lesson")
	private Lesson lesson;
	@ManyToOne()
	@JoinColumn(name = "Id_Acount")
	private Account account;
	@Column(name = "content_feedBack")
	private String content_feedBack;

	public int getId_feedBack() {
		return id_feedBack;
	}

	public void setId_feedBack(int id_feedBack) {
		this.id_feedBack = id_feedBack;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getContent_feedBack() {
		return content_feedBack;
	}

	public void setContent_feedBack(String content_feedBack) {
		this.content_feedBack = content_feedBack;
	}

	public FeedBack() {
		super();
	}

	public FeedBack(int id_feedBack, Lesson lesson, Account account, String content_feedBack) {
		super();
		this.id_feedBack = id_feedBack;
		this.lesson = lesson;
		this.account = account;
		this.content_feedBack = content_feedBack;
	}
}
