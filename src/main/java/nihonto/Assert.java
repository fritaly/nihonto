/*
 * Copyright (c) 2020 Workday
 * All Rights Reserved
 *
 * This software is protected by copyright and other intellectual
 * property rights and by international treaties. Any unauthorised
 * reproduction or distribution of this software or any portion
 * thereof is strictly prohibited.
 */
package nihonto;

class Assert {

    static void notNull(Object object, String name) {
        if (object == null) {
            throw new IllegalArgumentException(String.format("The given %s is null", name));
        }
    }

    static void notBlank(String string, String name) {
        if ((string == null) || string.trim().isEmpty()) {
            throw new IllegalArgumentException(String.format("The given %s is blank", name));
        }
    }
}