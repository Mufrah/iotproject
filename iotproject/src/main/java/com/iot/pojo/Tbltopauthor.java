package com.iot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tbltopauthor entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tbltopauthor", catalog = "iot")
public class Tbltopauthor implements java.io.Serializable {

	// Fields

	private Long inttopauthorid;
	private String txttopauthorname;
	private String txttopauthorpublishingcount;

	// Constructors

	/** default constructor */
	public Tbltopauthor() {
	}

	/** minimal constructor */
	public Tbltopauthor(String txttopauthorname) {
		this.txttopauthorname = txttopauthorname;
	}

	/** full constructor */
	public Tbltopauthor(String txttopauthorname,
			String txttopauthorpublishingcount) {
		this.txttopauthorname = txttopauthorname;
		this.txttopauthorpublishingcount = txttopauthorpublishingcount;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "inttopauthorid", unique = true, nullable = false)
	public Long getInttopauthorid() {
		return this.inttopauthorid;
	}

	public void setInttopauthorid(Long inttopauthorid) {
		this.inttopauthorid = inttopauthorid;
	}

	@Column(name = "txttopauthorname", nullable = false)
	public String getTxttopauthorname() {
		return this.txttopauthorname;
	}

	public void setTxttopauthorname(String txttopauthorname) {
		this.txttopauthorname = txttopauthorname;
	}

	@Column(name = "txttopauthorpublishingcount")
	public String getTxttopauthorpublishingcount() {
		return this.txttopauthorpublishingcount;
	}

	public void setTxttopauthorpublishingcount(
			String txttopauthorpublishingcount) {
		this.txttopauthorpublishingcount = txttopauthorpublishingcount;
	}

}