package com.vn.tdk.learnenglish.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tb_Theme")
public class Theme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "SEQ_TB_THEME_ENGLISH")
	// @SequenceGenerator(name = "SEQ_TB_THEME_ENGLISH", sequenceName =
	// "SEQ_TB_THEME_ENGLISH", allocationSize = 1)
	@Column(name = "id_theme", nullable = false)
	private int id_theme;
	@Column(name = "name_theme", nullable = false)
	private String name_them;
	@Column(name = "descript_theme")
	private String descript_theme;
	@Column(name = "short_url_theme")
	private String short_url_theme;
	@Column(name = "image_descript_theme")
	private String image_descript_theme;
	public int getId_theme() {
		return id_theme;
	}
	public void setId_theme(int id_theme) {
		this.id_theme = id_theme;
	}
	public String getName_them() {
		return name_them;
	}
	public void setName_them(String name_them) {
		this.name_them = name_them;
	}
	public String getDescript_theme() {
		return descript_theme;
	}
	public void setDescript_theme(String descript_theme) {
		this.descript_theme = descript_theme;
	}
	public String getShort_url_theme() {
		return short_url_theme;
	}
	public void setShort_url_theme(String short_url_theme) {
		this.short_url_theme = short_url_theme;
	}
	public String getImage_descript_theme() {
		return image_descript_theme;
	}
	public void setImage_descript_theme(String image_descript_theme) {
		this.image_descript_theme = image_descript_theme;
	}
	public Theme(String name_them, String descript_theme,
			String short_url_theme, String image_descript_theme) {
		super();
		this.name_them = name_them;
		this.descript_theme = descript_theme;
		this.short_url_theme = short_url_theme;
		this.image_descript_theme = image_descript_theme;
	}
	public Theme() {
		super();
	}


	

}
