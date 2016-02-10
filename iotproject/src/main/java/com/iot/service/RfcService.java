package com.iot.service;

import java.util.List;

import com.iot.pojo.Tblrfc;

public interface RfcService {

	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.ConferenceService#fetchAllConference()
	 */
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.TopUniversitiesService#fetchAllTopUniversities()
	 */
	public abstract List<Tblrfc> fetchAllRFc();

}