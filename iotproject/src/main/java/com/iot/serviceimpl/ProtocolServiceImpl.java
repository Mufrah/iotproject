package com.iot.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.dao.TblprotocolDAO;
import com.iot.dao.TblrfcDAO;
import com.iot.pojo.Tblprotocol;
import com.iot.pojo.Tblrfc;
import com.iot.service.ProtocolService;

@Service
public class ProtocolServiceImpl implements ProtocolService {

	private static final Logger logger = LoggerFactory.getLogger(ProtocolServiceImpl.class);

	@Autowired
	TblprotocolDAO tblprotocolDAO;
	
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.ProtocolService#fetchAllProtocols()
	 */
	public List<Tblprotocol> fetchAllProtocols(){
		logger.debug("-------Enter fetchAllProtocols----------");
		List<Tblprotocol> tblprotocolList=new ArrayList<Tblprotocol>();
		tblprotocolList=tblprotocolDAO.findAll();
		System.out.println("tblprotocolList Count: "+tblprotocolList.size());
		logger.debug("--------End fetchAllProtocols-------- ");
 		return tblprotocolList;
		
	}

	
	
}
