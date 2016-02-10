package com.iot.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tblbook entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tblbook", catalog = "iot")
public class Tblbook implements java.io.Serializable {

	// Fields

	private Long intbookid;
	private String txtbookname;
	private String txtbookprice;
	private String txtbookurl;
	private String txtbookauthor;
	private String txtpublishername;
	private String txtpublishdate;

	// Constructors

	/** default constructor */
	public Tblbook() {
	}

	/** minimal constructor */
	public Tblbook(String txtbookname, String txtbookurl) {
		this.txtbookname = txtbookname;
		this.txtbookurl = txtbookurl;
	}

	/** full constructor */
	public Tblbook(String txtbookname, String txtbookprice, String txtbookurl,
			String txtbookauthor, String txtpublishername, String txtpublishdate) {
		this.txtbookname = txtbookname;
		this.txtbookprice = txtbookprice;
		this.txtbookurl = txtbookurl;
		this.txtbookauthor = txtbookauthor;
		this.txtpublishername = txtpublishername;
		this.txtpublishdate = txtpublishdate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "intbookid", unique = true, nullable = false)
	public Long getIntbookid() {
		return this.intbookid;
	}

	public void setIntbookid(Long intbookid) {
		this.intbookid = intbookid;
	}

	@Column(name = "txtbookname", nullable = false)
	public String getTxtbookname() {
		return this.txtbookname;
	}

	public void setTxtbookname(String txtbookname) {
		this.txtbookname = txtbookname;
	}

	@Column(name = "txtbookprice")
	public String getTxtbookprice() {
		return this.txtbookprice;
	}

	public void setTxtbookprice(String txtbookprice) {
		this.txtbookprice = txtbookprice;
	}

	@Column(name = "txtbookurl", nullable = false)
	public String getTxtbookurl() {
		return this.txtbookurl;
	}

	public void setTxtbookurl(String txtbookurl) {
		this.txtbookurl = txtbookurl;
	}

	@Column(name = "txtbookauthor")
	public String getTxtbookauthor() {
		return this.txtbookauthor;
	}

	public void setTxtbookauthor(String txtbookauthor) {
		this.txtbookauthor = txtbookauthor;
	}

	@Column(name = "txtpublishername")
	public String getTxtpublishername() {
		return this.txtpublishername;
	}

	public void setTxtpublishername(String txtpublishername) {
		this.txtpublishername = txtpublishername;
	}

	@Column(name = "txtpublishdate")
	public String getTxtpublishdate() {
		return this.txtpublishdate;
	}

	public void setTxtpublishdate(String txtpublishdate) {
		this.txtpublishdate = txtpublishdate;
	}

}