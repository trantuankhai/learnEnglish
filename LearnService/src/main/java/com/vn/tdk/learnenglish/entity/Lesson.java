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
@Table(name = "Tb_Lesson")
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
	@Column(name = "image_descript")
	private String image_descript;
	@Column(name = "short_descript")
	private String short_descript;

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

	public String getImage_descript() {
		return image_descript;
	}

	public void setImage_descript(String image_descript) {
		this.image_descript = image_descript;
	}

	public String getShort_descript() {
		return short_descript;
	}

	public void setShort_descript(String short_descript) {
		this.short_descript = short_descript;
	}

	public Lesson(Theme theme, String content, String image_descript,
			String short_descript) {
		super();
		this.theme = theme;
		this.content = content;
		this.image_descript = image_descript;
		this.short_descript = short_descript;
	}

	public Lesson() {
		super();
	}

}
