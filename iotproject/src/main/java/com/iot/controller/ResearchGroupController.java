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

import com.iot.formdata.JournalForm;
import com.iot.formdata.ResearchGroupForm;
import com.iot.service.JournalService;
import com.iot.service.ResearchGroupService;

@Controller
public class ResearchGroupController extends MultiActionController{
	private static final Logger logger = LoggerFactory.getLogger(JournalController.class);

	@Autowired
	ResearchGroupService researchGroupService;

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
    public ResearchGroupController(SessionRegistry sessionRegistry) {
        if (sessionRegistry == null) {
            throw new IllegalArgumentException("sessionRegistry cannot be null");
        }
        this.sessionRegistry = sessionRegistry;
    }
    /*************************Function Journal************************************/
	@RequestMapping(value="/researchgroup", method=RequestMethod.GET)
    public ModelAndView redirectToResearchGroupPage(){
    	logger.debug("--------Enter redirectToResearchGroupPage-------- ");
    	applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
    	
    	ModelAndView mv=new ModelAndView("researchgroup");
    	List<ResearchGroupForm> researchGroupFormList=new ArrayList<ResearchGroupForm>();
    	researchGroupFormList= researchGroupService.fetchAllResearchGroup();
		System.out.println("researchGroupFormList Count: "+researchGroupFormList.size());
		mv.addObject("researchGroupFormList",researchGroupFormList);
		
		logger.debug("--------End redirectToResearchGroupPage-------- ");
    	return mv;
    }


}
