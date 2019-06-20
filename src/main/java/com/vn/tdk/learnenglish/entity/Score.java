package com.vn.tdk.learnenglish.entity;

import javax.persistence.*;

@Entity(name="score")
public class Score {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idScore")
	private int idScore;
	@Column(name="list")
	private int list;
	@Column(name="readEnglish")
	private int read;
	
	public Score() {
		super();
	}
	public Score(int id, int list, int read) {
		super();
		this.idScore = id;
		this.list = list;
		this.read = read;
	}
	public int getId() {
		return idScore;
	}
	public void setId(int id) {
		this.idScore = id;
	}
	public int getList() {
		return list;
	}
	public void setList(int list) {
		this.list = list;
	}
	public int getRead() {
		return read;
	}
	public void setRead(int read) {
		this.read = read;
	}
}