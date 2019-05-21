/*
 * Copyright (c) 2012, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.jersey.client.spi;

import org.glassfish.jersey.client.ClientResponse;

/**
 * Asynchronous connector response processing callback contract.
 *
 * @author Marek Potociar (marek.potociar at oracle.com)
 */
public interface AsyncConnectorCallback {

    /**
     * Invoked when a response for the asynchronously invoked request is available.
     *
     * @param response asynchronously received client response.
     */
    public void response(ClientResponse response);

    /**
     * Invoked in case the asynchronous request invocation failed.
     *
     * @param failure cause of the asynchronous request invocation failure.
     */
    public void failure(Throwable failure);
}