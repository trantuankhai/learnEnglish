package com.vn.tdk.learnenglish.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_Acount")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_Acount", nullable = false)
	private final java.lang.Integer id_account;
	@Column(name = "userName_Acount", nullable = false)
	private final java.lang.String userName;
	@Column(name = "passWord_Acount", nullable = false)
	private final java.lang.String passWord;
	@Column(name = "fullName_Acount", nullable = false)
	private final java.lang.String FullName;
	@Column(name = "phone_Acount", nullable = false)
	private final java.lang.String Phone;
	@Column(name = "address_Acount")
	private final java.lang.String address;
	@Column(name = "email_Acount")
	private final java.lang.String email_address;
	@Column(name = "sex_Acount")
	private final java.lang.Integer sex;
	@Column(name = "isActive")
	private final java.lang.Integer isActive;
	@Column(name = "role_Acount")
	private final java.lang.String role;

	public Account(Integer id_account, String userName, String passWord, String fullName, String phone, String address,
			String email_address, Integer sex, Integer isActive, String role) {
		super();
		this.id_account = id_account;
		this.userName = userName;
		this.passWord = passWord;
		FullName = fullName;
		Phone = phone;
		this.address = address;
		this.email_address = email_address;
		this.sex = sex;
		this.isActive = isActive;
		this.role = role;
	}

	public static class AcountBuilder {
		private java.lang.Integer id_account;
		private java.lang.String userName;
		private java.lang.String passWord;
		private java.lang.String FullName;
		private java.lang.String Phone;
		private java.lang.String address;
		private java.lang.String email_address;
		private java.lang.Integer sex;
		private java.lang.Integer isActive;
		private java.lang.String role;

		public AcountBuilder(java.lang.String userName, java.lang.String passWord, java.lang.String email_address) {
			this.userName = userName;
			this.passWord = passWord;
			this.email_address = email_address;

		}

		public AcountBuilder withFullName(java.lang.String FullName) {
			this.FullName = FullName;
			return this;
		}

		public AcountBuilder withPhone(java.lang.String Phone) {
			this.Phone = Phone;
			return this;
		}

		public AcountBuilder withAddress(java.lang.String address) {
			this.address = address;
			return this;
		}

		public AcountBuilder withSex(java.lang.Integer sex) {
			this.sex = sex;
			return this;
		}

		public AcountBuilder withIsActive(java.lang.Integer isActive) {
			this.isActive = isActive;
			return this;
		}

		public AcountBuilder withRole(java.lang.String role) {
			this.role = role;
			return this;
		}
	}

}