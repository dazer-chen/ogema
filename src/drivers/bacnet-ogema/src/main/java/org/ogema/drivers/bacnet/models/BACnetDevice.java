/**
 * Copyright 2011-2018 Fraunhofer-Gesellschaft zur Förderung der angewandten Wissenschaften e.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ogema.drivers.bacnet.models;

import org.ogema.core.model.Resource;
import org.ogema.core.model.ResourceList;
import org.ogema.core.model.simple.IntegerResource;
import org.ogema.core.model.simple.StringResource;
import org.ogema.model.prototypes.PhysicalElement;

/**
 *
 * @author jlapp
 */
public interface BACnetDevice extends PhysicalElement {
    
    ObjectIdentifier identifier();
    
    /**
     * @return the system status.
     */    
    IntegerResource systemStatus();
    
    StringResource vendorName();
    
    IntegerResource vendorIdentifier();
    
    StringResource modelName();
    
    StringResource firmwareRevision();
    
    StringResource applicationSoftwareVersion();
    
    StringResource description();
    
    IntegerResource protocolVersion();
    
    IntegerResource protocolRevision();
    
    StringResource protocolServicesSupported();
    
    StringResource protocolObjectTypesSupported();
    
    IntegerResource maxApduLengthAccepted();
    
    IntegerResource segmentationSupported();
    
    IntegerResource apduTimeout();
    
    IntegerResource numberOfApduRetries();
    
    ResourceList<AddressBinding> deviceAddressBinding();
    
    IntegerResource databaseRevision();
    
    ResourceList<Resource> objects();
    
}