package com.vn.tdk.learnenglish.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tb_Lession_Type")
public class Lession_Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lession_type")
	private int id_lession_type;
	@ManyToOne()
	@JoinColumn(name="id_basic_grammar_detail")
	private BasicGrammarDetail basicGrammarDetail;
	@ManyToOne()
	@JoinColumn(name = "id_type")
	private Type type;
	public int getId_lession_type() {
		return id_lession_type;
	}
	public void setId_lession_type(int id_lession_type) {
		this.id_lession_type = id_lession_type;
	}
	public BasicGrammarDetail getBasicGrammarDetail() {
		return basicGrammarDetail;
	}
	public void setBasicGrammarDetail(BasicGrammarDetail basicGrammarDetail) {
		this.basicGrammarDetail = basicGrammarDetail;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Lession_Type(int id_lession_type, BasicGrammarDetail basicGrammarDetail, Type type) {
		super();
		this.id_lession_type = id_lession_type;
		this.basicGrammarDetail = basicGrammarDetail;
		this.type = type;
	}
	public Lession_Type() {
		super();
	}
	

}
