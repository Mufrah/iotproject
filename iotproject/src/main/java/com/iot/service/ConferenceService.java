package com.iot.service;

import java.util.List;

import com.iot.formdata.ConferenceForm;

public interface ConferenceService {

	public abstract List<ConferenceForm> fetchAllConference();

}