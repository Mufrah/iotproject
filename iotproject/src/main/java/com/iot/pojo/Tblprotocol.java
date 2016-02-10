package com.iot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tblprotocol entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tblprotocol", catalog = "iot")
public class Tblprotocol implements java.io.Serializable {

	// Fields

	private Long intprotocolid;
	private String txtprotocolname;
	private String txtprotocoldescription;

	// Constructors

	/** default constructor */
	public Tblprotocol() {
	}

	/** minimal constructor */
	public Tblprotocol(String txtprotocolname) {
		this.txtprotocolname = txtprotocolname;
	}

	/** full constructor */
	public Tblprotocol(String txtprotocolname, String txtprotocoldescription) {
		this.txtprotocolname = txtprotocolname;
		this.txtprotocoldescription = txtprotocoldescription;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "intprotocolid", unique = true, nullable = false)
	public Long getIntprotocolid() {
		return this.intprotocolid;
	}

	public void setIntprotocolid(Long intprotocolid) {
		this.intprotocolid = intprotocolid;
	}

	@Column(name = "txtprotocolname", nullable = false)
	public String getTxtprotocolname() {
		return this.txtprotocolname;
	}

	public void setTxtprotocolname(String txtprotocolname) {
		this.txtprotocolname = txtprotocolname;
	}

	@Column(name = "txtprotocoldescription")
	public String getTxtprotocoldescription() {
		return this.txtprotocoldescription;
	}

	public void setTxtprotocoldescription(String txtprotocoldescription) {
		this.txtprotocoldescription = txtprotocoldescription;
	}

}