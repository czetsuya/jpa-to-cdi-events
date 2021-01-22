/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuyatech.business.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.czetsuyatech.data.entity.Book;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version
 * @since
 */
public class BookService {

	@PersistenceContext
	private EntityManager em;

	public void create(Book book) {
		em.persist(book);
	}

	public Book update(Book book) {
		return em.merge(book);
	}

	public void delete(Book book) {
		em.remove(book);
	}

	public void flush() {
		em.flush();
	}
}
