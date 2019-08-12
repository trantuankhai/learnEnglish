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
@Table(name = "Tb_Basic_Grammar_Detail")
public class BasicGrammarDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_basic_grammar_detail")
	private int id_basic_grammar_detail;
	@ManyToOne()
	@JoinColumn(name = "id_basic_grammar")
	private BasicGrammar basicGrammar;
	@Column(name = "title")
	private String title;
	@Column(name = "image_descript")
	private String image_descript;
	@Column(name = "short_descript")
	private String short_descript;
	public int getId_basic_grammar_detail() {
		return id_basic_grammar_detail;
	}
	public void setId_basic_grammar_detail(int id_basic_grammar_detail) {
		this.id_basic_grammar_detail = id_basic_grammar_detail;
	}
	public BasicGrammar getBasicGrammar() {
		return basicGrammar;
	}
	public void setBasicGrammar(BasicGrammar basicGrammar) {
		this.basicGrammar = basicGrammar;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public BasicGrammarDetail(BasicGrammar basicGrammar, String title, String image_descript, String short_descript) {
		super();
		this.basicGrammar = basicGrammar;
		this.title = title;
		this.image_descript = image_descript;
		this.short_descript = short_descript;
	}
	public BasicGrammarDetail() {
		super();
	}
	
}
