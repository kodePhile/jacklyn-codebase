/*
 * Copyright 2018-2020 The Code Department.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.tcdng.jacklyn.workflow;

import com.tcdng.jacklyn.workflow.business.AbstractWfItemEnrichmentPolicy;
import com.tcdng.jacklyn.workflow.data.FlowingWfItem.ReaderWriter;
import com.tcdng.unify.core.UnifyException;
import com.tcdng.unify.core.annotation.Component;

/**
 * Test customer enrichment policy.
 * 
 * @author Lateef Ojulari
 * @since 1.0
 */
@Component("testcustomer-enrichmentpolicy")
public class TestCustomerEnrichmentPolicy extends AbstractWfItemEnrichmentPolicy {

    @Override
    public void enrich(ReaderWriter readerWriter) throws UnifyException {
        // Enrich workflow item
        String firstName = readerWriter.read(String.class, "firstName");
        String lastName = readerWriter.read(String.class, "lastName");
        readerWriter.write("fullName", firstName + " " + lastName);
        readerWriter.write("accountNo", "0123456789");
    }

}
