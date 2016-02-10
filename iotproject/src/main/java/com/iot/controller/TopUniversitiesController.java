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

import com.iot.formdata.TopUniversitiesForm;
import com.iot.service.TopUniversitiesService;

@Controller
public class TopUniversitiesController extends MultiActionController{

	private static final Logger logger = LoggerFactory.getLogger(TopUniversitiesController.class);

	@Autowired
	 TopUniversitiesService topUniversitiesService;

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
    public TopUniversitiesController(SessionRegistry sessionRegistry) {
        if (sessionRegistry == null) {
            throw new IllegalArgumentException("sessionRegistry cannot be null");
        }
        this.sessionRegistry = sessionRegistry;
    }
    /*************************Function Top Univeersities************************************/
	@RequestMapping(value="/topuniversities", method=RequestMethod.GET)
    public ModelAndView redirectTopUniversitiesPage(){
    	logger.debug("--------Enter redirectTopUniversitiesPage-------- ");
    	applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
    	
    	ModelAndView mv=new ModelAndView("topuniversities");
    	List<TopUniversitiesForm> topUniversitiesFormList=new ArrayList<TopUniversitiesForm>();
    	topUniversitiesFormList= topUniversitiesService.fetchAllTopUniversities();
		System.out.println("topUniversitiesFormList Count: "+topUniversitiesFormList.size());
		mv.addObject("topUniversitiesFormList",topUniversitiesFormList);
		
		logger.debug("--------End redirectTopUniversitiesPage-------- ");
    	return mv;
    }
}
