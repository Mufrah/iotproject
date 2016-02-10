package com.iot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tblrfc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tblrfc", catalog = "iot")
public class Tblrfc implements java.io.Serializable {

	// Fields

	private Long intrfcid;
	private String txtrfcname;
	private String txtrfcurl;

	// Constructors

	/** default constructor */
	public Tblrfc() {
	}

	/** full constructor */
	public Tblrfc(String txtrfcname, String txtrfcurl) {
		this.txtrfcname = txtrfcname;
		this.txtrfcurl = txtrfcurl;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "intrfcid", unique = true, nullable = false)
	public Long getIntrfcid() {
		return this.intrfcid;
	}

	public void setIntrfcid(Long intrfcid) {
		this.intrfcid = intrfcid;
	}

	@Column(name = "txtrfcname", nullable = false)
	public String getTxtrfcname() {
		return this.txtrfcname;
	}

	public void setTxtrfcname(String txtrfcname) {
		this.txtrfcname = txtrfcname;
	}

	@Column(name = "txtrfcurl", nullable = false)
	public String getTxtrfcurl() {
		return this.txtrfcurl;
	}

	public void setTxtrfcurl(String txtrfcurl) {
		this.txtrfcurl = txtrfcurl;
	}

}