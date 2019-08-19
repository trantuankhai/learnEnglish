package com.vn.tdk.learnenglish.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tb_Question")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_question")
	private int id_question;
	@ManyToOne()
	@JoinColumn(name = "id_lession_type")
	private Lession_Type lession_type;
	@Column(name = "concept_suggest")
	private String concept_suggest;
	@Column(name = "example_question")
	private String example_question;
	@Column(name = "vietSub_concept_suggest")
	private String vietSub_concept_suggest;
//	@OneToMany(mappedBy = "question",fetch =FetchType.EAGER)
//	private List<QuestionQuiz> questionQuizs = new ArrayList<QuestionQuiz>();
	public String getVietSub_concept_suggest() {
		return vietSub_concept_suggest;
	}

	public void setVietSub_concept_suggest(String vietSub_concept_suggest) {
		this.vietSub_concept_suggest = vietSub_concept_suggest;
	}

	// @Column(name = "content_question")
//	private String content_question;
	@Column(name = "image_question")
	private String image_question;
	@Column(name = "order_question")
	private int order_question;

	public int getId_question() {
		return id_question;
	}

	public void setId_question(int id_question) {
		this.id_question = id_question;
	}

	public Lession_Type getLession_type() {
		return lession_type;
	}

	public void setLession_type(Lession_Type lession_type) {
		this.lession_type = lession_type;
	}

	public String getConcept_suggest() {
		return concept_suggest;
	}

	public void setConcept_suggest(String concept_suggest) {
		this.concept_suggest = concept_suggest;
	}

	public String getExample_question() {
		return example_question;
	}

	public void setExample_question(String example_question) {
		this.example_question = example_question;
	}

	public int getOrder() {
		return order_question;
	}

	public void setOrder(int order_question) {
		this.order_question = order_question;
	}

	public String getImage_question() {
		return image_question;
	}

	public void setImage_question(String image_question) {
		this.image_question = image_question;
	}

	public int getOrder_question() {
		return order_question;
	}

	public void setOrder_question(int order_question) {
		this.order_question = order_question;
	}

	public Question() {
		super();
	}
	

//	public List<QuestionQuiz> getQuestionQuizs() {
//		return questionQuizs;
//	}
//
//	public void setQuestionQuizs(List<QuestionQuiz> questionQuizs) {
//		this.questionQuizs = questionQuizs;
//	}

	public Question(Lession_Type lession_type, String concept_suggest, String example_question,
			String vietSub_concept_suggest,  String image_question,
			int order_question) {
		super();
		this.lession_type = lession_type;
		this.concept_suggest = concept_suggest;
		this.example_question = example_question;
		this.vietSub_concept_suggest = vietSub_concept_suggest;
	//	this.questionQuizs = questionQuizs;
		this.image_question = image_question;
		this.order_question = order_question;
	}



}
