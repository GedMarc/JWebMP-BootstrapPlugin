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

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.core.utilities.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;

/**
 * A particular crumb
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public class BSBreadcrumb<J extends BSBreadcrumb<J>>
		extends ListItem<J>
		implements BSBreadcrumbsChildren<ListItemChildren, J>, IBSBreadcrumb<J>
{


	/**
	 * The actual link for the crumb
	 */
	private Link crumbLink;

	/**
	 * Construct with a link and text to show
	 *
	 * @param crumbLink
	 */
	@SuppressWarnings("")
	public BSBreadcrumb(Link crumbLink)
	{
		this();
		setCrumbLink(crumbLink);

	}

	/**
	 * Constructs a particular crumb
	 */
	public BSBreadcrumb()
	{
		addClass(BSComponentBreadcrumbOptions.Breadcrumb_Item);

	}

	/**
	 * Neater display
	 *
	 * @return
	 */
	public IBSBreadcrumb asMe()
	{
		return this;
	}

	/**
	 * Returns the crumb link, never null
	 *
	 * @return
	 */
	@Override
	public Link getCrumbLink()
	{
		if (crumbLink == null)
		{
			setCrumbLink(new Link(StaticStrings.STRING_HASH));
		}
		return crumbLink;
	}

	/**
	 * Sets the given crumb link
	 *
	 * @param crumbLink
	 */
	@Override
	public J setCrumbLink(Link crumbLink)
	{
		if (this.crumbLink != null)
		{
			remove(this.crumbLink);
			this.crumbLink = null;
		}
		this.crumbLink = crumbLink;
		if (this.crumbLink != null)
		{
			add(this.crumbLink);
		}
		return (J) this;
	}

	/**
	 * Sets this crumb to display as active
	 *
	 * @param active
	 *
	 * @return
	 */
	@Override
	public J setActive(boolean active)
	{
		if (active)
		{
			addClass(BSDefaultOptions.Active);
		}
		else
		{
			removeClass(BSDefaultOptions.Active);
		}
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 79 * hash + (getID().hashCode());
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		return super.equals(obj);
	}
}
