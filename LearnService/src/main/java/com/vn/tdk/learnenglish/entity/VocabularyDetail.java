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
@Table(name = "Tb_Vocabulary_Detail")
public class VocabularyDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vocabularyDetail")
	private int id_vocabularyDetail;
	@ManyToOne()
	@JoinColumn(name = "id_vocabulary", nullable = false)
	private Vocabulary vocabulary;
	@Column(name = "image_descript")
	private String image_descript;
	@Column(name = "english")
	private String english;
	@Column(name = "vn")
	private String vn;

	public int getId_vocabularyDetail() {
		return id_vocabularyDetail;
	}

	public void setId_vocabularyDetail(int id_vocabularyDetail) {
		this.id_vocabularyDetail = id_vocabularyDetail;
	}

	public Vocabulary getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(Vocabulary vocabulary) {
		this.vocabulary = vocabulary;
	}

	public String getImage_descript() {
		return image_descript;
	}

	public void setImage_descript(String image_descript) {
		this.image_descript = image_descript;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getVn() {
		return vn;
	}

	public void setVn(String vn) {
		this.vn = vn;
	}

	public VocabularyDetail() {
		super();
	}

	public VocabularyDetail(Vocabulary vocabulary, String image_descript, String english, String vn) {
		super();
		this.vocabulary = vocabulary;
		this.image_descript = image_descript;
		this.english = english;
		this.vn = vn;
	}

}
