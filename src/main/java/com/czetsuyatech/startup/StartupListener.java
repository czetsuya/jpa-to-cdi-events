/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuyatech.startup;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.czetsuyatech.business.service.BookService;
import com.czetsuyatech.data.entity.Book;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version
 * @since
 */
@Singleton
@Startup
public class StartupListener {

	private Logger log = Logger.getLogger(StartupListener.class);

	@Inject
	private BookService bookService;

	@PostConstruct
	public void createUpdateRemove() {
		log.info("Running tests. Check the logs...");

		Book book = new Book();

		book.setName("Mahouka Koukou");
		bookService.create(book);

		book.setName("Gate Jietai");
		book = bookService.update(book);
		// commit the update
		bookService.flush();

		bookService.delete(book);
	}
}
