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
package org.netbeans.modules.maven.model.pom;

import java.util.List;


/**
 *
 * @author mkleint
 */
public interface PluginExecution extends IdPOMComponent {

//  <!--xs:complexType name="PluginExecution">
//    <xs:all>
//      <xs:element name="id" minOccurs="0" type="xs:string" default="default">
//      <xs:element name="phase" minOccurs="0" type="xs:string">
//      <xs:element name="goals" minOccurs="0">
//            <xs:element name="goal" minOccurs="0" maxOccurs="unbounded" type="xs:string"/>
//      <xs:element name="inherited" minOccurs="0" type="xs:string">
//      <xs:element name="configuration" minOccurs="0">
//            <xs:any minOccurs="0" maxOccurs="unbounded" processContents="skip"/>
//    </xs:all>
//  </xs:complexType-->


    /**
     * POM RELATED PROPERTY
     * @return
     */
    String getPhase();
    void setPhase(String phase);
    /**
     * POM RELATED PROPERTY
     * @return
     */
    Boolean isInherited();
    void setInherited(Boolean inherited);

    /**
     * POM RELATED PROPERTY
     * @return
     */
    List<String> getGoals();
    void addGoal(String goal);
    void removeGoal(String goal);

    /**
     * POM RELATED PROPERTY
     * @return
     */
    Configuration getConfiguration();
    void setConfiguration(Configuration config);

}
