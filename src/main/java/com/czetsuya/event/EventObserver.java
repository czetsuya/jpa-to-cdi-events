/**
 * Copyright 2020 - present, Edward P. Legaspi | czetsuya@gmail.com.
 * All rights reserved.
 * 
 * This source code is license under the license found in the 
 * License.md file in the root directory of this source tree.
 */
package com.czetsuya.event;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version
 * @since
 */
@ApplicationScoped
public class EventObserver {

    public void onCreate(@Observes @Created Object e) {
        System.out.println("created " + e);
    }

    public void onUpdate(@Observes @Updated Object e) {
        System.out.println("updated " + e);
    }

    public void onRemove(@Observes @Removed Object e) {
        System.out.println("removed " + e);
    }
}
