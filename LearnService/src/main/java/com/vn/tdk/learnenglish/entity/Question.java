package com.vn.tdk.learnenglish.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "Tb_Question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_question")
	private int id_question;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_basic_grammar_detail")
	private BasicGrammarDetail BasicGrammarDetail;
	@Column(name = "content_question")
	private String content_question;

	public Question() {
		super();
	}



	public Question(com.vn.tdk.learnenglish.entity.BasicGrammarDetail basicGrammarDetail, String content_question) {
		super();
		BasicGrammarDetail = basicGrammarDetail;
		this.content_question = content_question;
	}



	public BasicGrammarDetail getBasicGrammarDetail() {
		return BasicGrammarDetail;
	}



	public void setBasicGrammarDetail(BasicGrammarDetail basicGrammarDetail) {
		BasicGrammarDetail = basicGrammarDetail;
	}



	public int getId_question() {
		return id_question;
	}

	public void setId_question(int id_question) {
		this.id_question = id_question;
	}


	public String getContent_question() {
		return content_question;
	}

	public void setContent_question(String content_question) {
		this.content_question = content_question;
	}

}
