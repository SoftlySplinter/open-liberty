/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.beanvalidation.fat.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.ibm.ws.beanvalidation.fat.FATSuite;

import componenttest.topology.impl.LibertyServerFactory;

/**
 * All Bean Validation tests for the 2.0 feature level.
 */
public class BasicValidation20Test extends BasicValidation11CommonTest {

    @BeforeClass
    public static void setUp() throws Exception {
        bvalVersion = 20;

        server = LibertyServerFactory.getLibertyServer("com.ibm.ws.beanvalidation_2.0.fat");

        FATSuite.createAndExportCommonWARs(server);

        server.addInstalledAppForValidation(FATSuite.DEFAULT_BEAN_VALIDATION10);
        server.addInstalledAppForValidation(FATSuite.DEFAULT_BEAN_VALIDATION11);
        server.addInstalledAppForValidation(FATSuite.BEAN_VALIDATION10);
        server.addInstalledAppForValidation(FATSuite.BEAN_VALIDATION11);
        server.startServer(BasicValidation20Test.class.getSimpleName() + ".log");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        server.stopServer();
    }

}
