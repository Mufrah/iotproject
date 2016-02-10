package com.iot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tbljournal entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tbljournal", catalog = "iot")
public class Tbljournal implements java.io.Serializable {

	// Fields

	private Long intjournalid;
	private String txtjournalname;
	private String txtjournalimpactfactor;
	private String txtjournalurl;
	private String txtjournaldescription;
	private String txtPaid;

	// Constructors

	/** default constructor */
	public Tbljournal() {
	}

	/** minimal constructor */
	public Tbljournal(String txtjournalname, String txtjournalurl) {
		this.txtjournalname = txtjournalname;
		this.txtjournalurl = txtjournalurl;
	}

	/** full constructor */
	public Tbljournal(String txtjournalname, String txtjournalimpactfactor,
			String txtjournalurl, String txtjournaldescription) {
		this.txtjournalname = txtjournalname;
		this.txtjournalimpactfactor = txtjournalimpactfactor;
		this.txtjournalurl = txtjournalurl;
		this.txtjournaldescription = txtjournaldescription;
		this.txtPaid = txtPaid;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "intjournalid", unique = true, nullable = false)
	public Long getIntjournalid() {
		return this.intjournalid;
	}

	public void setIntjournalid(Long intjournalid) {
		this.intjournalid = intjournalid;
	}

	@Column(name = "txtjournalname", nullable = false)
	public String getTxtjournalname() {
		return this.txtjournalname;
	}

	public void setTxtjournalname(String txtjournalname) {
		this.txtjournalname = txtjournalname;
	}

	@Column(name = "txtjournalimpactfactor")
	public String getTxtjournalimpactfactor() {
		return this.txtjournalimpactfactor;
	}

	public void setTxtjournalimpactfactor(String txtjournalimpactfactor) {
		this.txtjournalimpactfactor = txtjournalimpactfactor;
	}

	@Column(name = "txtjournalurl", nullable = false)
	public String getTxtjournalurl() {
		return this.txtjournalurl;
	}

	public void setTxtjournalurl(String txtjournalurl) {
		this.txtjournalurl = txtjournalurl;
	}

	@Column(name = "txtjournaldescription")
	public String getTxtjournaldescription() {
		return this.txtjournaldescription;
	}

	public void setTxtjournaldescription(String txtjournaldescription) {
		this.txtjournaldescription = txtjournaldescription;
	}
	@Column(name = "txtPaid")
	public String getTxtPaid() {
		return this.txtPaid;
	}

	public void setTxtPaid(String txtPaid) {
		this.txtPaid = txtPaid;
	}


}