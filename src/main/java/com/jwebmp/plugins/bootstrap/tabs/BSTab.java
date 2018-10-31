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

package com.jwebmp.plugins.bootstrap.tabs;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.ListItem;

/**
 * A tab specific to Bootstrap 4
 */
public class BSTab<J extends BSTab>

{


	/**
	 * The tab header item
	 */
	private ListItem tabHeader;
	/**
	 * The actual tab content to be displayd
	 */
	private Div tabContent;
	/**
	 * If this tab is active
	 */
	private boolean active;

	/**
	 * Construct a blank tab
	 */
	public BSTab()
	{
	}

	/**
	 * Construct a new tab with the given items
	 *
	 * @param tabHeader
	 * 		The header of the tab
	 * @param tabContent
	 * 		The content of the tab
	 */
	public BSTab(ListItem tabHeader, Div tabContent)
	{
		this.tabHeader = tabHeader;
		this.tabContent = tabContent;
	}

	/**
	 * Returns the list item. Nullable
	 *
	 * @return
	 */
	public ListItem getTabHeader()
	{
		return tabHeader;
	}

	/**
	 * Sets the tab header
	 *
	 * @param tabHeader
	 */
	public void setTabHeader(ListItem tabHeader)
	{
		this.tabHeader = tabHeader;
	}

	/**
	 * Gets the tab content. Nullable
	 *
	 * @return
	 */
	public Div getTabContent()
	{
		return tabContent;
	}

	/**
	 * Sets the tab content
	 *
	 * @param tabContent
	 */
	public void setTabContent(Div tabContent)
	{
		this.tabContent = tabContent;
	}

	/**
	 * If this tab is set as active
	 *
	 * @return
	 */
	public boolean isActive()
	{
		return active;
	}

	/**
	 * Sets this tab as active (try only have one per tab set)
	 *
	 * @param active
	 *
	 * @return
	 */
	public J setActive(boolean active)
	{
		this.active = active;
		return (J) this;
	}
}
