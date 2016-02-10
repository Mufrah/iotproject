package com.iot.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.dao.TblbookDAO;
import com.iot.formdata.BookForm;
import com.iot.pojo.Tblbook;
import com.iot.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

	@Autowired
	TblbookDAO tblbookDAO;
	
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.JournalService#fetchAllJournals()
	 */
	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.BookService#fetchAllBooks()
	 */
	public List<BookForm> fetchAllBooks(){
		logger.debug("-------Enter fetchAllBooks----------");
		List<Tblbook> tblbookList=new ArrayList<Tblbook>();
		List<BookForm> bookFormList= new ArrayList<BookForm>();
		tblbookList=tblbookDAO.findAll();
		System.out.println("tblbookList Count: "+tblbookList.size());
		
		for (Iterator iterator = tblbookList.iterator(); iterator.hasNext();) {
			Tblbook tblbook = (Tblbook) iterator.next();
			BookForm form = new BookForm();
			form.setIntbookid(tblbook.getIntbookid());
			form.setTxtbookname(tblbook.getTxtbookname());
			form.setTxtbookurl(tblbook.getTxtbookurl());
			form.setTxtbookprice(tblbook.getTxtbookprice());
			form.setTxtbookauthor(tblbook.getTxtbookauthor());
			form.setTxtpublishername(tblbook.getTxtpublishername());
			form.setTxtpublishdate(tblbook.getTxtpublishdate());;
			bookFormList.add(form);
		}
		logger.debug("--------End fetchAllBooks-------- ");
    	
		return bookFormList;
		
	}

}
