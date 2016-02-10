package com.iot.dao;

import java.util.List;

import com.iot.pojo.Tblrfc;

public interface TblrfcDAO {

	// property constants
	public static final String TXTRFCNAME = "txtrfcname";
	public static final String TXTRFCURL = "txtrfcurl";

	public abstract void save(Tblrfc transientInstance);

	public abstract void delete(Tblrfc persistentInstance);

	public abstract Tblrfc findById(java.lang.Long id);

	public abstract List<Tblrfc> findByExample(Tblrfc instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Tblrfc> findByTxtrfcname(Object txtrfcname);

	public abstract List<Tblrfc> findByTxtrfcurl(Object txtrfcurl);

	public abstract List findAll();

	public abstract Tblrfc merge(Tblrfc detachedInstance);

	public abstract void attachDirty(Tblrfc instance);

	public abstract void attachClean(Tblrfc instance);

}