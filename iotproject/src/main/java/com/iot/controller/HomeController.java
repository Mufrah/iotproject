package com.iot.controller;

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

@Controller
public class HomeController extends MultiActionController {
	 
	private static final Logger logger = LoggerFactory.getLogger(JournalController.class);
	private final SessionRegistry sessionRegistry;
	protected ApplicationContext springAppContext = null;

	/**
    * Creates a new {@link UserSessionController}
    *
    * @param sessionRegistry the {@link SessionRegistry} to use. Cannot be null.
    * @throws IllegalArgumentException if sessionRegistry is null.
    */    
    
	/*************************Function HomeController************************************/

	@Autowired
    public HomeController(SessionRegistry sessionRegistry) {
        if (sessionRegistry == null) {
            throw new IllegalArgumentException("sessionRegistry cannot be null");
        }
        this.sessionRegistry = sessionRegistry;
    }
    
    
    /*************************Function Home************************************/
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView home()	
	{
		logger.debug("Enter home");
		springAppContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	/*************************Function TimeOut************************************/
	@RequestMapping(value = "/timeout", method = RequestMethod.GET)
	public ModelAndView TimeOut() {
		logger.debug("********Timeout********");
		return new ModelAndView("redirect:/");
	}

}
