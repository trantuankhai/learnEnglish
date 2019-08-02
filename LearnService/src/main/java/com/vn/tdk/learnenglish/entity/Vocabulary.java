package com.vn.tdk.learnenglish.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Vocabulary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vocabulary")
	private int id_vocabulary;
	@ManyToOne()
	@JoinColumn(name = "id_theme", nullable = false)
	private Theme theme;
	@Column(name = "image_descript")
	private String image_descript;
	@Column(name = "short_descript")
	private String short_descript;
	public int getId_vocabulary() {
		return id_vocabulary;
	}
	public void setId_vocabulary(int id_vocabulary) {
		this.id_vocabulary = id_vocabulary;
	}
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
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
	public Vocabulary(Theme theme, String image_descript, String short_descript) {
		super();
		this.theme = theme;
		this.image_descript = image_descript;
		this.short_descript = short_descript;
	}
	public Vocabulary() {
		super();
	}
	
}
