/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuyatech.data.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.czetsuyatech.event.EntityListener;

import lombok.Data;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version
 * @since
 */
@Entity
@Data
@EntityListeners(EntityListener.class)
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
}
