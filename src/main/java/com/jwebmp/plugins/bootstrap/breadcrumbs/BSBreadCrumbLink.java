/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.bootstrap.breadcrumbs;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Link;

/**
 * @param <J>
 *
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSBreadCrumbLink<J extends BSBreadCrumbLink<J>>
		extends Link<J>
{


	/**
	 * A new default crumb link
	 */
	public BSBreadCrumbLink()
	{

	}

	/**
	 * A new default crumb link
	 *
	 * @param directToAddress
	 */
	public BSBreadCrumbLink(String directToAddress)
	{
		super(directToAddress);

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

	}

}
