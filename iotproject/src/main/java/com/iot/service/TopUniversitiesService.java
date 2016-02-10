package com.iot.service;

import java.util.List;

import com.iot.formdata.TopUniversitiesForm;

public interface TopUniversitiesService {

	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.ConferenceService#fetchAllConference()
	 */
	public abstract List<TopUniversitiesForm> fetchAllTopUniversities();

}