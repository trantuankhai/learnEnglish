package com.vn.tdk.learnenglish.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "activity")
public class Activity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "activityid")
	private int activityid;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID")
	private Account user;
	@Column(name = "content", columnDefinition = "TEXT")
	private String content;

	@Column(name = "createDate")
	private Date createDate;

	public Activity() {
		super();
	}

	public Activity(int activityid, String content, Date createDate, Account user) {
		super();
		this.activityid = activityid;
		this.content = content;
		this.createDate = createDate;
		this.user = user;
	}

	public int getActivityid() {
		return activityid;
	}

	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Account getUser() {
		return user;
	}

	public void setUser(Account user) {
		this.user = user;
	}
}