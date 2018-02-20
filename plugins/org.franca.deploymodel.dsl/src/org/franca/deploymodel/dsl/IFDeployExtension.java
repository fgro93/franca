/*******************************************************************************
 * Copyright (c) 2018 itemis AG (http://www.itemis.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.franca.deploymodel.dsl;

import java.util.Collection;

/**
 * TODO: Document deployment extensions.
 * 
 * @author Klaus Birken (itemis AG)
 *
 */
public interface IFDeployExtension {

	public String getShortDescription();
	
	public Collection<String> getHosts();
	
	class Root {
		private String name;
		
		public Root(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
	}
	
	public Collection<Root> getRoots();
}
