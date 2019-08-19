package com.vn.tdk.learnenglish.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tb_Type")
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type")
	private int id_type;
	@Column(name = "content_type")
	private String content_type;
	@Column(name = "descript_type")
	private String descript_type;
	

	
	
	public Type(int id_type, String content_type, String descript_type) {
		super();
		this.id_type = id_type;
		this.content_type = content_type;
		this.descript_type = descript_type;
	}

	public String getDescript_type() {
		return descript_type;
	}

	public void setDescript_type(String descript_type) {
		this.descript_type = descript_type;
	}

	public int getId_type() {
		return id_type;
	}
	public void setId_type(int id_type) {
		this.id_type = id_type;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public Type() {
		super();
	}
	

}
