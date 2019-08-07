package com.vn.tdk.learnenglish.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "Tb_Basic_Grammar")
public class BasicGrammar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_basic_grammar")
	private int id_basic_grammar;
	@ManyToOne()
	@JoinColumn(name = "id_theme")
	private Theme theme;
	@Column(name = "name_english")
	private String name_english;
	@Column(name = "name_vn")
	private String name_vn;
	@Column(name = "short_descript")
	private String short_descript;
	@Column(name = "image_descript")
	private String imange_descript;

	public int getId_basic_grammar() {
		return id_basic_grammar;
	}

	public void setId_basic_grammar(int id_basic_grammar) {
		this.id_basic_grammar = id_basic_grammar;
	}

	public String getName_english() {
		return name_english;
	}

	public void setName_english(String name_english) {
		this.name_english = name_english;
	}

	public String getName_vn() {
		return name_vn;
	}

	public void setName_vn(String name_vn) {
		this.name_vn = name_vn;
	}

	public String getShort_descript() {
		return short_descript;
	}

	public void setShort_descript(String short_descript) {
		this.short_descript = short_descript;
	}

	public String getImange_descript() {
		return imange_descript;
	}

	public void setImange_descript(String imange_descript) {
		this.imange_descript = imange_descript;
	}

	public BasicGrammar(String name_english, String name_vn,
			String short_descript, String imange_descript) {
		super();
		this.name_english = name_english;
		this.name_vn = name_vn;
		this.short_descript = short_descript;
		this.imange_descript = imange_descript;
	}

	public BasicGrammar() {
		super();
	}

}
