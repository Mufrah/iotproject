package com.iot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tbltopuniversities entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tbltopuniversities", catalog = "iot")
public class Tbltopuniversities implements java.io.Serializable {

	// Fields

	private Long inttopuniversitiesid;
	private String inttopuniversitiesname;
	private String txttopuniversitiesurl;
	private String txttopuniversitiesrank;
	private String texttopuniversitiesdescription;

	// Constructors

	/** default constructor */
	public Tbltopuniversities() {
	}

	/** full constructor */
	public Tbltopuniversities(String inttopuniversitiesname,
			String txttopuniversitiesurl, String txttopuniversitiesrank,
			String texttopuniversitiesdescription) {
		this.inttopuniversitiesname = inttopuniversitiesname;
		this.txttopuniversitiesurl = txttopuniversitiesurl;
		this.txttopuniversitiesrank = txttopuniversitiesrank;
		this.texttopuniversitiesdescription = texttopuniversitiesdescription;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "inttopuniversitiesid", unique = true, nullable = false)
	public Long getInttopuniversitiesid() {
		return this.inttopuniversitiesid;
	}

	public void setInttopuniversitiesid(Long inttopuniversitiesid) {
		this.inttopuniversitiesid = inttopuniversitiesid;
	}

	@Column(name = "inttopuniversitiesname", nullable = false)
	public String getInttopuniversitiesname() {
		return this.inttopuniversitiesname;
	}

	public void setInttopuniversitiesname(String inttopuniversitiesname) {
		this.inttopuniversitiesname = inttopuniversitiesname;
	}

	@Column(name = "txttopuniversitiesurl", nullable = false)
	public String getTxttopuniversitiesurl() {
		return this.txttopuniversitiesurl;
	}

	public void setTxttopuniversitiesurl(String txttopuniversitiesurl) {
		this.txttopuniversitiesurl = txttopuniversitiesurl;
	}

	@Column(name = "txttopuniversitiesrank", nullable = false)
	public String getTxttopuniversitiesrank() {
		return this.txttopuniversitiesrank;
	}

	public void setTxttopuniversitiesrank(String txttopuniversitiesrank) {
		this.txttopuniversitiesrank = txttopuniversitiesrank;
	}

	@Column(name = "texttopuniversitiesdescription", nullable = false)
	public String getTexttopuniversitiesdescription() {
		return this.texttopuniversitiesdescription;
	}

	public void setTexttopuniversitiesdescription(
			String texttopuniversitiesdescription) {
		this.texttopuniversitiesdescription = texttopuniversitiesdescription;
	}

}