package com.iot.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.dao.TblconferenceDAO;
import com.iot.formdata.ConferenceForm;
import com.iot.pojo.Tblconference;
import com.iot.service.ConferenceService;

@Service
public class ConferenceServiceImpl implements ConferenceService {
	private static final Logger logger = LoggerFactory.getLogger(ConferenceServiceImpl.class);

	@Autowired
	TblconferenceDAO tblconferenceDAO;
	
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.ConferenceService#fetchAllConference()
	 */
	public List<ConferenceForm> fetchAllConference(){
		logger.debug("-------Enter fetchAllConference----------");
		List<Tblconference> tblconferencesPojo=new ArrayList<Tblconference>();
		List<ConferenceForm> conferenceFormsList= new ArrayList<ConferenceForm>();
		tblconferencesPojo=tblconferenceDAO.findAll();
		System.out.println("Conference Count: "+tblconferencesPojo.size());
		
		for (Iterator iterator = tblconferencesPojo.iterator(); iterator.hasNext();) {
			Tblconference tblconference = (Tblconference) iterator.next();
			ConferenceForm form = new ConferenceForm();
			form.setIntconferenceid(tblconference.getIntconferenceid());
			form.setTxtconferencename(tblconference.getTxtconferencename());
			form.setTxtconferenceurl(tblconference.getTxtconferenceurl());
			form.setTxtconferencedescription(tblconference.getTxtconferencedescription());
			form.setTxtPaid(tblconference.getTxtPaid());
			conferenceFormsList.add(form);
		}
		logger.debug("--------End fetchAllJournals-------- ");
 		return conferenceFormsList;
		
	}
}
