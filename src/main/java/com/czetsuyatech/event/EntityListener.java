/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuyatech.event;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.czetsuyatech.event.qualifier.Created;
import com.czetsuyatech.event.qualifier.Removed;
import com.czetsuyatech.event.qualifier.Updated;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version
 * @since
 */
public class EntityListener {

	@Inject
	@Created
	protected Event<Object> entityCreatedEventProducer;

	@Inject
	@Updated
	protected Event<Object> entityUpdatedEventProducer;

	@Inject
	@Removed
	protected Event<Object> entityRemovedEventProducer;

	@PrePersist
	public void created(Object d) {
		entityCreatedEventProducer.fire(d);
	}

	@PreUpdate
	public void updated(Object d) {
		entityUpdatedEventProducer.fire(d);
	}

	@PreRemove
	public void removed(Object d) {
		entityRemovedEventProducer.fire(d);
	}
}
