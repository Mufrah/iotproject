package com.iot.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.dao.TblprotocolDAO;
import com.iot.dao.TblstandardDAO;
import com.iot.pojo.Tblprotocol;
import com.iot.pojo.Tblstandard;
import com.iot.service.StandardService;

@Service
public class StandardServiceImpl implements StandardService {

	private static final Logger logger = LoggerFactory.getLogger(ProtocolServiceImpl.class);

	@Autowired
	TblstandardDAO tblstandardDAO;
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.ProtocolService#fetchAllProtocols()
	 */
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.StandardService#fetchAllStandards()
	 */
	public List<Tblstandard> fetchAllStandards(){
		logger.debug("-------Enter fetchAllStandards----------");
		List<Tblstandard> tblstandardList=new ArrayList<Tblstandard>();
		tblstandardList=tblstandardDAO.findAll();
		System.out.println("tblstandardList Count: "+tblstandardList.size());
		logger.debug("--------End fetchAllStandards-------- ");
 		return tblstandardList;
		
	}


}
