package com.vn.tdk.learnenglish.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class VocabularyDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vocabularyDetail")
	private int id_vocabularyDetail;
	@ManyToOne()
	@JoinColumn(name = "id_vocabulary", nullable = false)
	private Vocabulary vocabulary;
	@Column(name = "content_vocabulary")
	private String content_vocabulary;

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

	public String getContent_vocabulary() {
		return content_vocabulary;
	}

	public void setContent_vocabulary(String content_vocabulary) {
		this.content_vocabulary = content_vocabulary;
	}

	public VocabularyDetail(Vocabulary vocabulary, String content_vocabulary) {
		super();
		this.vocabulary = vocabulary;
		this.content_vocabulary = content_vocabulary;
	}

	public VocabularyDetail() {
		super();
	}

}
