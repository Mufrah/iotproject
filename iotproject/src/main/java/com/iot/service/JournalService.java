package com.iot.service;

import java.util.List;

import com.iot.formdata.JournalForm;

public interface JournalService {

	/*****************Method fetchAllJournals****************************************/
	public abstract List<JournalForm> fetchAllJournals();

}