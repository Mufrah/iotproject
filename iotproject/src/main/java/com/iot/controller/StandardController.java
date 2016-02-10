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

import com.iot.pojo.Tblprotocol;
import com.iot.pojo.Tblstandard;
import com.iot.service.ProtocolService;
import com.iot.service.StandardService;

@Controller
public class StandardController extends MultiActionController{
	private static final Logger logger = LoggerFactory.getLogger(StandardController.class);

	@Autowired
	 StandardService standardService;
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
    public StandardController(SessionRegistry sessionRegistry) {
        if (sessionRegistry == null) {
            throw new IllegalArgumentException("sessionRegistry cannot be null");
        }
        this.sessionRegistry = sessionRegistry;
    }
    /*************************Function redirectStandardPage************************************/
	@RequestMapping(value="/standard", method=RequestMethod.GET)
    public ModelAndView redirectStandardPage(){
    	logger.debug("--------Enter redirectStandardPage-------- ");
    	applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
    	
    	ModelAndView mv=new ModelAndView("standard");
    	List<Tblstandard> tblstandardsList=new ArrayList<Tblstandard>();
    	tblstandardsList= standardService.fetchAllStandards();
		System.out.println("tblstandardsList Count: "+tblstandardsList.size());
		mv.addObject("tblstandardsList",tblstandardsList);
		
		logger.debug("--------End redirectStandardPage-------- ");
    	return mv;
    }

}
