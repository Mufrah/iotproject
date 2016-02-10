package com.iot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tblresearchgroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tblresearchgroup", catalog = "iot")
public class Tblresearchgroup implements java.io.Serializable {

	// Fields

	private Long intreseatchgroupid;
	private String txtreseacrgroupname;
	private String txtresearchgroupurl;
	private String txtresearchgroupdescription;

	// Constructors

	/** default constructor */
	public Tblresearchgroup() {
	}

	/** full constructor */
	public Tblresearchgroup(String txtreseacrgroupname,
			String txtresearchgroupurl, String txtresearchgroupdescription) {
		this.txtreseacrgroupname = txtreseacrgroupname;
		this.txtresearchgroupurl = txtresearchgroupurl;
		this.txtresearchgroupdescription = txtresearchgroupdescription;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "intreseatchgroupid", unique = true, nullable = false)
	public Long getIntreseatchgroupid() {
		return this.intreseatchgroupid;
	}

	public void setIntreseatchgroupid(Long intreseatchgroupid) {
		this.intreseatchgroupid = intreseatchgroupid;
	}

	@Column(name = "txtreseacrgroupname", nullable = false)
	public String getTxtreseacrgroupname() {
		return this.txtreseacrgroupname;
	}

	public void setTxtreseacrgroupname(String txtreseacrgroupname) {
		this.txtreseacrgroupname = txtreseacrgroupname;
	}

	@Column(name = "txtresearchgroupurl", nullable = false, length = 100)
	public String getTxtresearchgroupurl() {
		return this.txtresearchgroupurl;
	}

	public void setTxtresearchgroupurl(String txtresearchgroupurl) {
		this.txtresearchgroupurl = txtresearchgroupurl;
	}

	@Column(name = "txtresearchgroupdescription", nullable = false)
	public String getTxtresearchgroupdescription() {
		return this.txtresearchgroupdescription;
	}

	public void setTxtresearchgroupdescription(
			String txtresearchgroupdescription) {
		this.txtresearchgroupdescription = txtresearchgroupdescription;
	}

}