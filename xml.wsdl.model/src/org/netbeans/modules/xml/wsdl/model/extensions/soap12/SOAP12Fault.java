/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.xml.wsdl.model.extensions.soap12;

import org.netbeans.modules.xml.wsdl.model.Fault;
import org.netbeans.modules.xml.xam.Reference;

/**
 * Represents the fault element under the wsdl:fault element for SOAP binding
 *
 * @author Sujit Biswas
 */
public interface SOAP12Fault extends SOAP12MessageBase {
    public static final String NAME_PROPERTY = "name";
    /**
     * Set SOAP binding fault name.
     */
    void setName(String name);
    
    /**
     * Return SOAP binding fault name.
     */
    String getName();
 
    /**
     * Set SOAP binding fault using give reference.
     */
    void setFault(Reference<Fault> fault);
    
    /**
     * @return reference to operation fault.
     */
    Reference<Fault> getFault();
}
