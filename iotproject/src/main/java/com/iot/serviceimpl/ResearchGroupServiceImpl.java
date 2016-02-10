package com.iot.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.dao.TblresearchgroupDAO;
import com.iot.formdata.ResearchGroupForm;
import com.iot.pojo.Tblresearchgroup;
import com.iot.service.ResearchGroupService;

@Service
public class ResearchGroupServiceImpl implements ResearchGroupService {
	private static final Logger logger = LoggerFactory.getLogger(ResearchGroupServiceImpl.class);

	@Autowired
	TblresearchgroupDAO tblresearchgroupDAO;	
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.JournalService#fetchAllJournals()
	 */
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.ResearchGroupService#fetchAllResearchGroup()
	 */
	public List<ResearchGroupForm> fetchAllResearchGroup(){
		logger.debug("-------Enter fetchAllResearchGroup----------");
		List<Tblresearchgroup> tblresearchgroupList=new ArrayList<Tblresearchgroup>();
		List<ResearchGroupForm> researchGroupFormList= new ArrayList<ResearchGroupForm>();
		tblresearchgroupList=tblresearchgroupDAO.findAll();
		System.out.println("tblresearchgroupList Count: "+tblresearchgroupList.size());
		
		for (Iterator iterator = tblresearchgroupList.iterator(); iterator.hasNext();) {
			Tblresearchgroup tblresearchgroup = (Tblresearchgroup) iterator.next();
			ResearchGroupForm form = new ResearchGroupForm();
			form.setIntreseatchgroupid(tblresearchgroup.getIntreseatchgroupid());
			form.setTxtreseacrgroupname(tblresearchgroup.getTxtreseacrgroupname());
			form.setTxtresearchgroupurl(tblresearchgroup.getTxtresearchgroupurl());
			form.setTxtresearchgroupdescription(tblresearchgroup.getTxtresearchgroupdescription());
			researchGroupFormList.add(form);
		}
		logger.debug("--------End fetchAllResearchGroup-------- ");
    	
		return researchGroupFormList;
		
	}

}
