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

import com.iot.formdata.BookForm;
import com.iot.formdata.ConferenceForm;
import com.iot.service.BookService;
import com.iot.service.ConferenceService;

@Controller
public class BookController extends MultiActionController{
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	BookService bookService;
	
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
    public BookController(SessionRegistry sessionRegistry) {
        if (sessionRegistry == null) {
            throw new IllegalArgumentException("sessionRegistry cannot be null");
        }
        this.sessionRegistry = sessionRegistry;
    }

    /*************************Function redirectTobookPage************************************/
  	@RequestMapping(value="/book", method=RequestMethod.GET)
      public ModelAndView redirectTobookPage(){
      	logger.debug("--------Enter redirectToConferencePage-------- ");
      	applicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
      	
      	ModelAndView mv=new ModelAndView("book");
      	List<BookForm> bookFormList=new ArrayList<BookForm>();
      	bookFormList= bookService.fetchAllBooks();
  		System.out.println("bookFormList Count: "+bookFormList.size());
  		mv.addObject("bookFormList",bookFormList);
  		mv.addObject(bookFormList);
  		
  		logger.debug("--------End redirectTobookPage-------- ");
      	return mv;
      }

}
