package com.iot.dao;

import java.util.List;

import com.iot.pojo.Tblstandard;

public interface TblstandardDAO {

	// property constants
	public static final String TXTSTANDARDNAME = "txtstandardname";
	public static final String TXTSTANDARDDESCRIPTION = "txtstandarddescription";

	public abstract void save(Tblstandard transientInstance);

	public abstract void delete(Tblstandard persistentInstance);

	public abstract Tblstandard findById(java.lang.Long id);

	public abstract List<Tblstandard> findByExample(Tblstandard instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Tblstandard> findByTxtstandardname(
			Object txtstandardname);

	public abstract List<Tblstandard> findByTxtstandarddescription(
			Object txtstandarddescription);

	public abstract List findAll();

	public abstract Tblstandard merge(Tblstandard detachedInstance);

	public abstract void attachDirty(Tblstandard instance);

	public abstract void attachClean(Tblstandard instance);

}