package com.iot.dao;
import java.util.List;

import com.iot.pojo.Tblresearchgroup;

public interface TblresearchgroupDAO {

	// property constants
	public static final String TXTRESEACRGROUPNAME = "txtreseacrgroupname";
	public static final String TXTRESEARCHGROUPURL = "txtresearchgroupurl";
	public static final String TXTRESEARCHGROUPDESCRIPTION = "txtresearchgroupdescription";

	public abstract void save(Tblresearchgroup transientInstance);

	public abstract void delete(Tblresearchgroup persistentInstance);

	public abstract Tblresearchgroup findById(java.lang.Long id);

	public abstract List<Tblresearchgroup> findByExample(
			Tblresearchgroup instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Tblresearchgroup> findByTxtreseacrgroupname(
			Object txtreseacrgroupname);

	public abstract List<Tblresearchgroup> findByTxtresearchgroupurl(
			Object txtresearchgroupurl);

	public abstract List<Tblresearchgroup> findByTxtresearchgroupdescription(
			Object txtresearchgroupdescription);

	public abstract List findAll();

	public abstract Tblresearchgroup merge(Tblresearchgroup detachedInstance);

	public abstract void attachDirty(Tblresearchgroup instance);

	public abstract void attachClean(Tblresearchgroup instance);

}