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
package app.beans;

import javax.ejb.LocalBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Not sure @ApplicationScoped is all that useful since the injection will be
 * performed just once, the first time this bean is injected, but we include it
 * for completeness.
 */
@LocalBean
@ApplicationScoped
@Named("AppScopedLocalEJB")
public class AppScopedLocalEJB extends AbstractScopedBean {

}
