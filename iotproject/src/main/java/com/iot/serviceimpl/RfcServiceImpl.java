package com.iot.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.dao.TblrfcDAO;
import com.iot.pojo.Tblrfc;
import com.iot.service.RfcService;

@Service
public class RfcServiceImpl implements RfcService {
	private static final Logger logger = LoggerFactory.getLogger(RfcServiceImpl.class);

	@Autowired
	TblrfcDAO tblrfcDAO;
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.ConferenceService#fetchAllConference()
	 */
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.TopUniversitiesService#fetchAllTopUniversities()
	 */
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.RfcService#fetchAllRFc()
	 */
	public List<Tblrfc> fetchAllRFc(){
		logger.debug("-------Enter fetchAllRFc----------");
		List<Tblrfc> tblrfcList=new ArrayList<Tblrfc>();
		//List<Tblrfc> topUniversitiesFormList= new ArrayList<TopUniversitiesForm>();
		tblrfcList=tblrfcDAO.findAll();
		System.out.println("tblrfcList Count: "+tblrfcList.size());
		
	/*	for (Iterator iterator = tbltopuniversitiesList.iterator(); iterator.hasNext();) {
			Tbltopuniversities tbltopuniversities = (Tbltopuniversities) iterator.next();
			TopUniversitiesForm form = new TopUniversitiesForm();
			form.setInttopuniversitiesid(tbltopuniversities.getInttopuniversitiesid());
			form.setInttopuniversitiesname(tbltopuniversities.getInttopuniversitiesname());
			form.setTxttopuniversitiesrank(tbltopuniversities.getTxttopuniversitiesrank());
			form.setTxttopuniversitiesurl(tbltopuniversities.getTxttopuniversitiesurl());
			form.setTexttopuniversitiesdescription(tbltopuniversities.getTexttopuniversitiesdescription());
			topUniversitiesFormList.add(form);
		}
*/		logger.debug("--------End fetchAllRFc-------- ");
 		return tblrfcList;
		
	}
}
