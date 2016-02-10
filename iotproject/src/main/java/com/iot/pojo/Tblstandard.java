package com.iot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tblstandard entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tblstandard", catalog = "iot")
public class Tblstandard implements java.io.Serializable {

	// Fields

	private Long intstandardid;
	private String txtstandardname;
	private String txtstandarddescription;

	// Constructors

	/** default constructor */
	public Tblstandard() {
	}

	/** minimal constructor */
	public Tblstandard(String txtstandardname) {
		this.txtstandardname = txtstandardname;
	}

	/** full constructor */
	public Tblstandard(String txtstandardname, String txtstandarddescription) {
		this.txtstandardname = txtstandardname;
		this.txtstandarddescription = txtstandarddescription;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "intstandardid", unique = true, nullable = false)
	public Long getIntstandardid() {
		return this.intstandardid;
	}

	public void setIntstandardid(Long intstandardid) {
		this.intstandardid = intstandardid;
	}

	@Column(name = "txtstandardname", nullable = false)
	public String getTxtstandardname() {
		return this.txtstandardname;
	}

	public void setTxtstandardname(String txtstandardname) {
		this.txtstandardname = txtstandardname;
	}

	@Column(name = "txtstandarddescription")
	public String getTxtstandarddescription() {
		return this.txtstandarddescription;
	}

	public void setTxtstandarddescription(String txtstandarddescription) {
		this.txtstandarddescription = txtstandarddescription;
	}

}