/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap.breadcrumbs;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * @param <J>
 *
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSBreadCrumbLink<J extends BSBreadCrumbLink<J>>
		extends Link<J>
{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * A new default crumb link
	 */
	public BSBreadCrumbLink()
	{
		BootstrapPageConfigurator.setRequired(this, true);
	}
	
	/**
	 * A new default crumb link
	 *
	 * @param directToAddress
	 */
	public BSBreadCrumbLink(String directToAddress)
	{
		super(directToAddress);
		BootstrapPageConfigurator.setRequired(this, true);
	}
	
	/**
	 * A new default crumb link
	 *
	 * @param directToAddress
	 * @param targetFrameName
	 */
	public BSBreadCrumbLink(String directToAddress, String targetFrameName)
	{
		super(directToAddress, targetFrameName);
		BootstrapPageConfigurator.setRequired(this, true);
	}
	
	/**
	 * A new default crumb link
	 *
	 * @param directToAddress
	 * @param targetFrameName
	 * @param text
	 */
	public BSBreadCrumbLink(String directToAddress, String targetFrameName, String text)
	{
		super(directToAddress, targetFrameName, text);
		BootstrapPageConfigurator.setRequired(this, true);
	}
	
	/**
	 * A new default crumb link
	 *
	 * @param directToAddress
	 * @param targetFrameName
	 * @param component
	 */
	public BSBreadCrumbLink(String directToAddress, String targetFrameName, ComponentHierarchyBase component)
	{
		super(directToAddress, targetFrameName, component);
		BootstrapPageConfigurator.setRequired(this, true);
	}
	
}
