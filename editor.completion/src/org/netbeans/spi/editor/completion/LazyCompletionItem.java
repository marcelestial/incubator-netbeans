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

package org.netbeans.spi.editor.completion;

/**
 * The interface representing a completion item with lazy initialization
 *
 * @author Dusan Balek
 */

public interface LazyCompletionItem extends CompletionItem {

    /**
     * Gets invoked when a completion item is going to be displayed in the popup.
     * Returning <code>true</code> means that the item was successfuly initialized
     * and it should be displayed in the result list.
     */
    boolean accept ();
}
