package com.iot.dao;

import java.util.List;

import com.iot.pojo.Tbljournal;

public interface TbljournalDAO {

	// property constants
	public static final String TXTJOURNALNAME = "txtjournalname";
	public static final String TXTJOURNALIMPACTFACTOR = "txtjournalimpactfactor";
	public static final String TXTJOURNALURL = "txtjournalurl";
	public static final String TXTJOURNALDESCRIPTION = "txtjournaldescription";
	public static final String TXT_PAID = "txtPaid";

	public abstract void save(Tbljournal transientInstance);

	public abstract void delete(Tbljournal persistentInstance);

	public abstract Tbljournal findById(java.lang.Long id);

	public abstract List<Tbljournal> findByExample(Tbljournal instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Tbljournal> findByTxtjournalname(Object txtjournalname);

	public abstract List<Tbljournal> findByTxtjournalimpactfactor(
			Object txtjournalimpactfactor);

	public abstract List<Tbljournal> findByTxtjournalurl(Object txtjournalurl);

	public abstract List<Tbljournal> findByTxtjournaldescription(
			Object txtjournaldescription);

	public abstract List<Tbljournal> findByTxtPaid(Object txtPaid);

	public abstract List findAll();

	public abstract Tbljournal merge(Tbljournal detachedInstance);

	public abstract void attachDirty(Tbljournal instance);

	public abstract void attachClean(Tbljournal instance);

}