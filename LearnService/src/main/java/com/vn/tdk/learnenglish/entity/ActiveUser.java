package com.vn.tdk.learnenglish.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ACTIVER_USER")
public class ActiveUser {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TB_ACTIVER_USER")
	@SequenceGenerator(name = "SEQ_TB_ACTIVER_USER", sequenceName = "SEQ_TB_ACTIVER_USER", allocationSize = 1)
	private int id_active_user;

}
