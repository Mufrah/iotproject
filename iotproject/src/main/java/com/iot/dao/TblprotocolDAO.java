package com.iot.dao;
import java.util.List;

import com.iot.pojo.Tblprotocol;

public interface TblprotocolDAO {

	// property constants
	public static final String TXTPROTOCOLNAME = "txtprotocolname";
	public static final String TXTPROTOCOLDESCRIPTION = "txtprotocoldescription";

	public abstract void save(Tblprotocol transientInstance);

	public abstract void delete(Tblprotocol persistentInstance);

	public abstract Tblprotocol findById(java.lang.Long id);

	public abstract List<Tblprotocol> findByExample(Tblprotocol instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Tblprotocol> findByTxtprotocolname(
			Object txtprotocolname);

	public abstract List<Tblprotocol> findByTxtprotocoldescription(
			Object txtprotocoldescription);

	public abstract List findAll();

	public abstract Tblprotocol merge(Tblprotocol detachedInstance);

	public abstract void attachDirty(Tblprotocol instance);

	public abstract void attachClean(Tblprotocol instance);

}