/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuyatech.event;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import com.czetsuyatech.event.qualifier.Created;
import com.czetsuyatech.event.qualifier.Removed;
import com.czetsuyatech.event.qualifier.Updated;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version
 * @since
 */
@ApplicationScoped
public class EntityEventObserver {

	private Logger log = Logger.getLogger(EntityEventObserver.class);

	public void onCreate(@Observes @Created Object e) {
		log.info("created " + e);
	}

	public void onUpdate(@Observes @Updated Object e) {
		log.info("updated " + e);
	}

	public void onRemove(@Observes @Removed Object e) {
		log.info("removed " + e);
	}
}
