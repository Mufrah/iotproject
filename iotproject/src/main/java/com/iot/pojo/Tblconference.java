package com.iot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tblconference entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tblconference", catalog = "iot")
public class Tblconference implements java.io.Serializable {

	// Fields

	private Long intconferenceid;
	private String txtconferencename;
	private String txtconferenceurl;
	private String txtconferencedescription;
	private String txtPaid;
	// Constructors

	/** default constructor */
	public Tblconference() {
	}

	/** minimal constructor */
	public Tblconference(String txtconferencename, String txtconferenceurl) {
		this.txtconferencename = txtconferencename;
		this.txtconferenceurl = txtconferenceurl;
	}

	/** full constructor */
	public Tblconference(String txtconferencename,
			String txtconferenceimpactfactor, String txtconferenceurl,
			String txtconferencedescription) {
		this.txtconferencename = txtconferencename;
		this.txtconferenceurl = txtconferenceurl;
		this.txtconferencedescription = txtconferencedescription;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "intconferenceid", unique = true, nullable = false)
	public Long getIntconferenceid() {
		return this.intconferenceid;
	}

	public void setIntconferenceid(Long intconferenceid) {
		this.intconferenceid = intconferenceid;
	}

	@Column(name = "txtconferencename", nullable = false)
	public String getTxtconferencename() {
		return this.txtconferencename;
	}

	public void setTxtconferencename(String txtconferencename) {
		this.txtconferencename = txtconferencename;
	}

	
	@Column(name = "txtconferenceurl", nullable = false)
	public String getTxtconferenceurl() {
		return this.txtconferenceurl;
	}

	public void setTxtconferenceurl(String txtconferenceurl) {
		this.txtconferenceurl = txtconferenceurl;
	}

	@Column(name = "txtconferencedescription")
	public String getTxtconferencedescription() {
		return this.txtconferencedescription;
	}

	public void setTxtconferencedescription(String txtconferencedescription) {
		this.txtconferencedescription = txtconferencedescription;
	}
	@Column(name = "txtPaid")
	public String getTxtPaid() {
		return this.txtPaid;
	}

	public void setTxtPaid(String txtPaid) {
		this.txtPaid = txtPaid;
	}


}