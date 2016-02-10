package com.iot.dao;
import java.util.List;

import com.iot.pojo.Tbltopuniversities;

public interface TbltopuniversitiesDAO {

	// property constants
	public static final String INTTOPUNIVERSITIESNAME = "inttopuniversitiesname";
	public static final String TXTTOPUNIVERSITIESURL = "txttopuniversitiesurl";
	public static final String TXTTOPUNIVERSITIESRANK = "txttopuniversitiesrank";
	public static final String TEXTTOPUNIVERSITIESDESCRIPTION = "texttopuniversitiesdescription";

	public abstract void save(Tbltopuniversities transientInstance);

	public abstract void delete(Tbltopuniversities persistentInstance);

	public abstract Tbltopuniversities findById(java.lang.Long id);

	public abstract List<Tbltopuniversities> findByExample(
			Tbltopuniversities instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Tbltopuniversities> findByInttopuniversitiesname(
			Object inttopuniversitiesname);

	public abstract List<Tbltopuniversities> findByTxttopuniversitiesurl(
			Object txttopuniversitiesurl);

	public abstract List<Tbltopuniversities> findByTxttopuniversitiesrank(
			Object txttopuniversitiesrank);

	public abstract List<Tbltopuniversities> findByTexttopuniversitiesdescription(
			Object texttopuniversitiesdescription);

	public abstract List findAll();

	public abstract Tbltopuniversities merge(Tbltopuniversities detachedInstance);

	public abstract void attachDirty(Tbltopuniversities instance);

	public abstract void attachClean(Tbltopuniversities instance);

}