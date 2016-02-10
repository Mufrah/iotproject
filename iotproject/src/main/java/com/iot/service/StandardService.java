package com.iot.service;

import java.util.List;

import com.iot.pojo.Tblstandard;

public interface StandardService {

	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.ProtocolService#fetchAllProtocols()
	 */
	public abstract List<Tblstandard> fetchAllStandards();

}