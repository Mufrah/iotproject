package com.iot.service;

import java.util.List;

import com.iot.formdata.ResearchGroupForm;

public interface ResearchGroupService {

	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.JournalService#fetchAllJournals()
	 */
	public abstract List<ResearchGroupForm> fetchAllResearchGroup();

}