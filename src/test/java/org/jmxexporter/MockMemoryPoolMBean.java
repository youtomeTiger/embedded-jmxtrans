/*
 * Copyright 1012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jmxexporter;

import javax.management.openmbean.CompositeData;

/**
 * Mock {@link MockMemoryPoolMBean}
 *
 * @author <a href="mailto:cleclerc@xebia.fr">Cyrille Le Clerc</a>
 */
public interface MockMemoryPoolMBean {

    public long getCollectionUsageThreshold();

    /**
     * @see java.lang.management.MemoryPoolMXBean#getName()
     */
    public String getName();

    /**
     * @see java.lang.management.MemoryPoolMXBean#getUsage()
     */
    public CompositeData getUsage();
}