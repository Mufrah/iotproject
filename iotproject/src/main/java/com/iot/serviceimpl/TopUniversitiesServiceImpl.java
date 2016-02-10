package com.iot.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.dao.TbltopuniversitiesDAO;
import com.iot.formdata.TopUniversitiesForm;
import com.iot.pojo.Tbltopuniversities;
import com.iot.service.TopUniversitiesService;

@Service
public class TopUniversitiesServiceImpl implements TopUniversitiesService {
	private static final Logger logger = LoggerFactory.getLogger(TopUniversitiesServiceImpl.class);

	@Autowired
	TbltopuniversitiesDAO tbltopuniversitiesDAO;
	
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.ConferenceService#fetchAllConference()
	 */
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.TopUniversitiesService#fetchAllTopUniversities()
	 */
	public List<TopUniversitiesForm> fetchAllTopUniversities(){
		logger.debug("-------Enter fetchAllTopUniversities----------");
		List<Tbltopuniversities> tbltopuniversitiesList=new ArrayList<Tbltopuniversities>();
		List<TopUniversitiesForm> topUniversitiesFormList= new ArrayList<TopUniversitiesForm>();
		topUniversitiesFormList=tbltopuniversitiesDAO.findAll();
		System.out.println("topUniversitiesFormList Count: "+topUniversitiesFormList.size());
		
		for (Iterator iterator = tbltopuniversitiesList.iterator(); iterator.hasNext();) {
			Tbltopuniversities tbltopuniversities = (Tbltopuniversities) iterator.next();
			TopUniversitiesForm form = new TopUniversitiesForm();
			form.setInttopuniversitiesid(tbltopuniversities.getInttopuniversitiesid());
			form.setInttopuniversitiesname(tbltopuniversities.getInttopuniversitiesname());
			form.setTxttopuniversitiesrank(tbltopuniversities.getTxttopuniversitiesrank());
			form.setTxttopuniversitiesurl(tbltopuniversities.getTxttopuniversitiesurl());
			form.setTexttopuniversitiesdescription(tbltopuniversities.getTexttopuniversitiesdescription());
			topUniversitiesFormList.add(form);
		}
		logger.debug("--------End fetchAllTopUniversities-------- ");
 		return topUniversitiesFormList;
		
	}

}
