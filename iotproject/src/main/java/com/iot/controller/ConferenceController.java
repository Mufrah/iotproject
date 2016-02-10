package com.iot.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.iot.formdata.ConferenceForm;
import com.iot.formdata.JournalForm;
import com.iot.service.ConferenceService;
import com.iot.service.JournalService;
@Controller
public class ConferenceController extends MultiActionController{
	private static final Logger logger = LoggerFactory.getLogger(ConferenceController.class);

	@Autowired
	ConferenceService conferenceService;
	
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
    public ConferenceController(SessionRegistry sessionRegistry) {
        if (sessionRegistry == null) {
            throw new IllegalArgumentException("sessionRegistry cannot be null");
        }
        this.sessionRegistry = sessionRegistry;
    }

    /*************************Function redirectToConferencePage************************************/
  	@RequestMapping(value="/conference", method=RequestMethod.GET)
      public ModelAndView redirectToConferencePage(){
      	logger.debug("--------Enter redirectToConferencePage-------- ");
      	applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
      	
      	ModelAndView mv=new ModelAndView("conference");
      	List<ConferenceForm> conferenceFormsList=new ArrayList<ConferenceForm>();
      	conferenceFormsList= conferenceService.fetchAllConference();
  		System.out.println("conferenceFormsList Count: "+conferenceFormsList.size());
  		mv.addObject("conferenceFormsList",conferenceFormsList);
  		mv.addObject(conferenceFormsList);
  		
  		logger.debug("--------End redirectToConferencePage-------- ");
      	return mv;
      }

}
