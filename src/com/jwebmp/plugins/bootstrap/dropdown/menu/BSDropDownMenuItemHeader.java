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
package com.jwebmp.plugins.bootstrap.dropdown.menu;

import com.jwebmp.base.html.attributes.LinkAttributes;
import com.jwebmp.plugins.bootstrap.dropdown.BSComponentDropDownOptions;

/**
 * Menu headers
 * <p>
 * Add a header to label sections of actions in any dropdown menu.
 *
 * @author GedMarc
 * @since 14 Jan 2017
 */
public class BSDropDownMenuItemHeader
		extends BSDropDownMenuItem
{

	private static final long serialVersionUID = 1L;

	/**
	 * Menu headers
	 * <p>
	 * Add a header to label sections of actions in any dropdown menu.
	 *
	 * @param text
	 */
	public BSDropDownMenuItemHeader(String text)
	{
		this(null, text);
	}

	/**
	 * Menu headers
	 * <p>
	 * Add a header to label sections of actions in any dropdown menu.
	 *
	 * @param iconClass
	 * @param text
	 */
	public BSDropDownMenuItemHeader(String iconClass, String text)
	{
		super(iconClass, text);
		setRenderTextBeforeChildren(false);
		setup();
	}

	/**
	 * Sets tag to h6 and applies classes
	 */
	private void setup()
	{
		setTag("h6");
		addClass(BSComponentDropDownOptions.Dropdown_Header);
		removeClass(BSComponentDropDownOptions.Dropdown_Item.toString());
		getAttributes().remove(LinkAttributes.HRef.toString());
	}
}
