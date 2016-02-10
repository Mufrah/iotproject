package com.iot.dao;

import java.util.List;

import com.iot.pojo.Tblconference;

public interface TblconferenceDAO {

	// property constants
	public static final String TXTCONFERENCENAME = "txtconferencename";
	public static final String TXTCONFERENCEURL = "txtconferenceurl";
	public static final String TXTCONFERENCEDESCRIPTION = "txtconferencedescription";
	public static final String TXT_PAID = "txtPaid";

	public abstract void save(Tblconference transientInstance);

	public abstract void delete(Tblconference persistentInstance);

	public abstract Tblconference findById(java.lang.Long id);

	public abstract List<Tblconference> findByExample(Tblconference instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Tblconference> findByTxtconferencename(
			Object txtconferencename);


	public abstract List<Tblconference> findByTxtconferenceurl(
			Object txtconferenceurl);

	public abstract List<Tblconference> findByTxtconferencedescription(
			Object txtconferencedescription);

	public abstract List<Tblconference> findByTxtPaid(Object txtPaid);

	public abstract List findAll();

	public abstract Tblconference merge(Tblconference detachedInstance);

	public abstract void attachDirty(Tblconference instance);

	public abstract void attachClean(Tblconference instance);

}