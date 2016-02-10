package com.iot.dao;

import java.util.List;

import com.iot.pojo.Tblbook;

public interface TblbookDAO {

	// property constants
	public static final String TXTBOOKNAME = "txtbookname";
	public static final String TXTBOOKPRICE = "txtbookprice";
	public static final String TXTBOOKURL = "txtbookurl";
	public static final String TXTBOOKAUTHOR = "txtbookauthor";
	public static final String TXTPUBLISHERNAME = "txtpublishername";
	public static final String TXTPUBLISHDATE = "txtpublishdate";

	public abstract void save(Tblbook transientInstance);

	public abstract void delete(Tblbook persistentInstance);

	public abstract Tblbook findById(java.lang.Long id);

	public abstract List<Tblbook> findByExample(Tblbook instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Tblbook> findByTxtbookname(Object txtbookname);

	public abstract List<Tblbook> findByTxtbookprice(Object txtbookprice);

	public abstract List<Tblbook> findByTxtbookurl(Object txtbookurl);

	public abstract List<Tblbook> findByTxtbookauthor(Object txtbookauthor);

	public abstract List<Tblbook> findByTxtpublishername(Object txtpublishername);

	public abstract List<Tblbook> findByTxtpublishdate(Object txtpublishdate);

	public abstract List findAll();

	public abstract Tblbook merge(Tblbook detachedInstance);

	public abstract void attachDirty(Tblbook instance);

	public abstract void attachClean(Tblbook instance);

}