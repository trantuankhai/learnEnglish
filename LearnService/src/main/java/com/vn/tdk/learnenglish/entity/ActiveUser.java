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
@Table(name = "TB_ACTIVER_USER")
public class ActiveUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TB_ACTIVER_USER")
//	@SequenceGenerator(name = "SEQ_TB_ACTIVER_USER", sequenceName = "SEQ_TB_ACTIVER_USER", allocationSize = 1)
	private int id_active_user;
	@ManyToOne()
	@JoinColumn(name = "Id_Acount", nullable = false)
	private Account account;
	@Column(name = "content_active_user")
	private String content_active_user;
	@Column(name = "time_active_user")
	private String time_active_user;
	public int getId_active_user() {
		return id_active_user;
	}
	public void setId_active_user(int id_active_user) {
		this.id_active_user = id_active_user;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getContent_active_user() {
		return content_active_user;
	}
	public void setContent_active_user(String content_active_user) {
		this.content_active_user = content_active_user;
	}
	public String getTime_active_user() {
		return time_active_user;
	}
	public void setTime_active_user(String time_active_user) {
		this.time_active_user = time_active_user;
	}
	public ActiveUser() {
		// TODO Auto-generated constructor stub
	}
	public ActiveUser(int id_active_user, Account account, String content_active_user, String time_active_user) {
		super();
		this.id_active_user = id_active_user;
		this.account = account;
		this.content_active_user = content_active_user;
		this.time_active_user = time_active_user;
	}
	

}
