package com.iot.service;

import java.util.List;

import com.iot.formdata.BookForm;

public interface BookService {

	/* (non-Javadoc)
	 * @see com.iot.serviceimpl.JournalService#fetchAllJournals()
	 */
	public abstract List<BookForm> fetchAllBooks();

}