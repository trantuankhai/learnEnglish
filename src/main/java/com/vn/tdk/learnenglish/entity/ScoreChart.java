package com.vn.tdk.learnenglish.entity;

public class ScoreChart {
	private int score;
	private String time;
	public ScoreChart(int score, String time) {
		super();
		this.score = score;
		this.time = time;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}