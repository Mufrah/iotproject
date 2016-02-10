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
import com.iot.pojo.Tblrfc;
import com.iot.service.ProtocolService;
import com.iot.service.RfcService;

@Controller
public class ProtocolController extends MultiActionController{
	private static final Logger logger = LoggerFactory.getLogger(ProtocolController.class);

	@Autowired
	 ProtocolService protocolService;
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
    public ProtocolController(SessionRegistry sessionRegistry) {
        if (sessionRegistry == null) {
            throw new IllegalArgumentException("sessionRegistry cannot be null");
        }
        this.sessionRegistry = sessionRegistry;
    }
    /*************************Function redirectProtocolPage************************************/
	@RequestMapping(value="/protocol", method=RequestMethod.GET)
    public ModelAndView redirectProtocolPage(){
    	logger.debug("--------Enter redirectRfcPage-------- ");
    	applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
    	
    	ModelAndView mv=new ModelAndView("protocol");
    	List<Tblprotocol> tblprotocolList=new ArrayList<Tblprotocol>();
    	tblprotocolList= protocolService.fetchAllProtocols();
		System.out.println("tblrfcList Count: "+tblprotocolList.size());
		mv.addObject("tblprotocolList",tblprotocolList);
		
		logger.debug("--------End redirectProtocolPage-------- ");
    	return mv;
    }

}
