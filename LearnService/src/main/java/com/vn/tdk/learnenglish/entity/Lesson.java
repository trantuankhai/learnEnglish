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
@Table(name = "tb_lesson")
public class Lesson {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lesson")
	private int id_lesson;
	@ManyToOne()
	@JoinColumn(name = "id_theme", nullable = false)
	private Theme theme;
	@Column(name = "content")
	private String content;

	public int getId_lesson() {
		return id_lesson;
	}

	public void setId_lesson(int id_lesson) {
		this.id_lesson = id_lesson;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Lesson(int id_lesson, Theme theme, String content) {
		super();
		this.id_lesson = id_lesson;
		this.theme = theme;
		this.content = content;
	}

	public Lesson() {
		super();
	}

}
