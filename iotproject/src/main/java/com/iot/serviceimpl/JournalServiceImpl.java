package com.iot.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.dao.TbljournalDAO;
import com.iot.formdata.JournalForm;
import com.iot.pojo.Tbljournal;
import com.iot.service.JournalService;


@Service
public class JournalServiceImpl implements JournalService{
	private static final Logger logger = LoggerFactory.getLogger(JournalServiceImpl.class);

	@Autowired
	TbljournalDAO tbljournalDAO;
	
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.JournalService#fetchAllJournals()
	 */
	public List<JournalForm> fetchAllJournals(){
		logger.debug("-------Enter fetchAllJournals----------");
		List<Tbljournal> tbljournalsPojo=new ArrayList<Tbljournal>();
		List<JournalForm> journalFormsList= new ArrayList<JournalForm>();
		tbljournalsPojo=tbljournalDAO.findAll();
		System.out.println("Jornal Count: "+tbljournalsPojo.size());
		
		for (Iterator iterator = tbljournalsPojo.iterator(); iterator.hasNext();) {
			Tbljournal tbljournal = (Tbljournal) iterator.next();
			JournalForm form = new JournalForm();
			form.setIntjournalid(tbljournal.getIntjournalid());
			form.setTxtjournalname(tbljournal.getTxtjournalname());
			form.setTxtjournalimpactfactor(tbljournal.getTxtjournalimpactfactor());
			form.setTxtjournalurl(tbljournal.getTxtjournalurl());
			form.setTxtjournaldescription(tbljournal.getTxtjournaldescription());;
			form.setTxtPaid(tbljournal.getTxtPaid());
			journalFormsList.add(form);
		}
		logger.debug("--------End fetchAllJournals-------- ");
    	
		return journalFormsList;
		
	}
}
