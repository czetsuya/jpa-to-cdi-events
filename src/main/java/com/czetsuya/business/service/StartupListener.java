/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuya.business.service;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import com.czetsuya.data.entity.Book;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version
 * @since
 */
@Singleton
@Startup
public class StartupListener {

    @Inject
    private BookService bookService;

    @PostConstruct
    public void createUpdateRemove() {
        System.out.println("Running tests. Check the logs...");

        Book book = new Book();
        book.setName("Mahouka Koukou");
        bookService.create(book);

        book.setName("Gate Jietai");
        bookService.update(book);

        bookService.delete(book);
    }
}
