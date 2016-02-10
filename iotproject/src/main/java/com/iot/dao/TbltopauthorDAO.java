package com.iot.dao;
import java.util.List;

import com.iot.pojo.Tbltopauthor;

public interface TbltopauthorDAO {

	// property constants
	public static final String TXTTOPAUTHORNAME = "txttopauthorname";
	public static final String TXTTOPAUTHORPUBLISHINGCOUNT = "txttopauthorpublishingcount";

	public abstract void save(Tbltopauthor transientInstance);

	public abstract void delete(Tbltopauthor persistentInstance);

	public abstract Tbltopauthor findById(java.lang.Long id);

	public abstract List<Tbltopauthor> findByExample(Tbltopauthor instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Tbltopauthor> findByTxttopauthorname(
			Object txttopauthorname);

	public abstract List<Tbltopauthor> findByTxttopauthorpublishingcount(
			Object txttopauthorpublishingcount);

	public abstract List findAll();

	public abstract Tbltopauthor merge(Tbltopauthor detachedInstance);

	public abstract void attachDirty(Tbltopauthor instance);

	public abstract void attachClean(Tbltopauthor instance);

}