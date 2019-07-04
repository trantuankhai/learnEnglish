package com.vn.tdk.learnenglish.entity;

import javax.persistence.*;

import com.vn.tdk.learnenglish.common.Role;

@Entity
@Table(name = "TB_Acount")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TB_ACCOUNT")
	@SequenceGenerator(name = "SEQ_TB_ACCOUNT", sequenceName = "SEQ_TB_ACCOUNT", allocationSize = 1)
	@Column(name = "Id_Acount", nullable = false)
	private java.lang.Integer id_account;
	@Column(name = "userName_Acount", nullable = false, unique = true)
	private java.lang.String userName;
	@Column(name = "passWord_Acount", nullable = false)
	private java.lang.String passWord;
	@Column(name = "fullName_Acount", nullable = false)
	private java.lang.String FullName;
	@Column(name = "phone_Acount")
	private java.lang.String Phone;
	@Column(name = "address_Acount")
	private java.lang.String address;
	@Column(name = "email_Acount")
	private java.lang.String email_address;
	@Column(name = "sex_Acount")
	private java.lang.Integer sex;
	@Column(name = "isActive")
	private java.lang.Integer isActive;
	@Column(name = "role_Acount")
	private Role role;
	@Column(name = "date_create")
	private String date_create;

	public Account(String userName, String passWord, String fullName, String phone, String address,
			String email_address, Integer sex, Integer isActive, Role role,String date_create) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		FullName = fullName;
		Phone = phone;
		this.address = address;
		this.email_address = email_address;
		this.sex = sex;
		this.isActive = isActive;
		this.role = role;
		this.date_create = date_create;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void setId_account(java.lang.Integer id_account) {
		this.id_account = id_account;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public void setPassWord(java.lang.String passWord) {
		this.passWord = passWord;
	}

	public void setFullName(java.lang.String fullName) {
		FullName = fullName;
	}

	public void setPhone(java.lang.String phone) {
		Phone = phone;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public void setEmail_address(java.lang.String email_address) {
		this.email_address = email_address;
	}

	public void setSex(java.lang.Integer sex) {
		this.sex = sex;
	}

	public void setIsActive(java.lang.Integer isActive) {
		this.isActive = isActive;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public java.lang.Integer getId_account() {
		return id_account;
	}

	public java.lang.String getUserName() {
		return userName;
	}

	public java.lang.String getPassWord() {
		return passWord;
	}

	public java.lang.String getFullName() {
		return FullName;
	}

	public java.lang.String getPhone() {
		return Phone;
	}

	public java.lang.String getAddress() {
		return address;
	}

	public java.lang.String getEmail_address() {
		return email_address;
	}

	public java.lang.Integer getSex() {
		return sex;
	}

	public java.lang.Integer getIsActive() {
		return isActive;
	}

	public Role getRole() {
		return role;
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
		private Role role;
		private String date_create;

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

		public AcountBuilder withRole(Role role) {
			this.role = role;
			return this;
		}
		public AcountBuilder withDateCreate(String date_create) {
			this.date_create = date_create;
			return this;
		}

		public Account build() {
			Account account = new Account(this.userName, this.passWord, this.FullName, this.Phone, this.address,
					this.email_address, this.sex, this.isActive, this.role,this.date_create);
			return account;
		}
	}

}