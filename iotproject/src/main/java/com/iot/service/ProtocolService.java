package com.iot.service;

import java.util.List;

import com.iot.pojo.Tblprotocol;

public interface ProtocolService {

	/*************************************************************************/
	public abstract List<Tblprotocol> fetchAllProtocols();

}