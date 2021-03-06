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
package com.jwebmp.plugins.bootstrap.dropdown.menu;

import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.utilities.StaticStrings;
import com.jwebmp.plugins.bootstrap.dropdown.BSComponentDropDownOptions;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;

import java.util.Objects;

/**
 * A Drop Down Menu Item
 *
 * @author GedMarc
 * @since 14 Jan 2017
 */
public class BSDropDownMenuItem
		extends Link
		implements BSDropDownMenuChildren
{


	/**
	 * The class string for the icon
	 */
	private String iconClass;

	public BSDropDownMenuItem()
	{
		this("");
	}

	/**
	 * Construct a new drop down menu item
	 *
	 * @param text
	 */
	public BSDropDownMenuItem(String text)
	{
		addClass(BSComponentDropDownOptions.Dropdown_Item);
		setText(text);
		addAttribute(LinkAttributes.HRef, StaticStrings.STRING_HASH);
	}

	/**
	 * Construct a new menu item with the given iconClass and text
	 *
	 * @param iconClass
	 * @param text
	 */
	public BSDropDownMenuItem(String iconClass, String text)
	{
		this(text);
		this.iconClass = iconClass;
	}

	public BSDropDownMenuItem setDisabled()
	{
		addClass(BSDefaultOptions.Disabled);
		return this;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{

			Italic i = new Italic();
			if (iconClass != null && !iconClass.isEmpty())
			{
				i.addClass(iconClass);
			}
			setText(i.toString(true) + getText(getCurrentTabIndents()).toString());
		}
		super.preConfigure();
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getIconClass());
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	/**
	 * Sets the icon class
	 *
	 * @return
	 */
	public String getIconClass()
	{
		return iconClass;
	}

	/**
	 * Sets the icon to the given class
	 *
	 * @param iconClass
	 *
	 * @return
	 */
	public BSDropDownMenuItem setIconClass(String iconClass)
	{
		this.iconClass = iconClass;
		return this;
	}
}
