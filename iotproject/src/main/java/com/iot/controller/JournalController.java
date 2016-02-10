package com.iot.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import sun.awt.ModalityEvent;

import com.iot.formdata.JournalForm;
import com.iot.service.JournalService;

@Controller
public class JournalController extends MultiActionController{

	private static final Logger logger = LoggerFactory.getLogger(JournalController.class);

	@Autowired
	JournalService journalService;

	private final SessionRegistry sessionRegistry;
	protected ApplicationContext applicationContext = null;

	/********************************************************************************/
	
	
	/**
    * Creates a new {@link UserSessionController}
    *
    * @param sessionRegistry the {@link SessionRegistry} to use. Cannot be null.
    * @throws IllegalArgumentException if sessionRegistry is null.
    */    
    @Autowired
    public JournalController(SessionRegistry sessionRegistry) {
        if (sessionRegistry == null) {
            throw new IllegalArgumentException("sessionRegistry cannot be null");
        }
        this.sessionRegistry = sessionRegistry;
    }
    /*************************Function Journal************************************/
	@RequestMapping(value="/journal", method=RequestMethod.GET)
    public ModelAndView redirectToJournalPage(){
    	logger.debug("--------Enter redirectToJournalPage-------- ");
    	applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
    	
    	ModelAndView mv=new ModelAndView("journal");
    	List<JournalForm> journalFormsList=new ArrayList<JournalForm>();
		journalFormsList= journalService.fetchAllJournals();
		System.out.println("journalFormsList Count: "+journalFormsList.size());
		String string="Mufrah";
		mv.addObject("journalFormsList",journalFormsList);
		mv.addObject(string);
		
		logger.debug("--------End redirectToJournalPage-------- ");
    	return mv;
    }

}
