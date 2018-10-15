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
package com.jwebmp.plugins.bootstrap.listgroup;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * List group
 * <p>
 * List groups are a flexible and powerful component for displaying a series of content. List group items can be modified and extended to support just about any content within.
 * They can also be used
 * as navigation with the right modifier class.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap ListGroup",
		description = "List groups are a flexible and powerful component for displaying a series of content. List group items can be modified and extended to support just about any content within. They can also be used as navigation with the right modifier class.",
		url = "https://v4-alpha.getbootstrap.com/components/list-group/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSListGroup
		extends Div<BSListGroupChildren, BSListGroupAttributes, GlobalFeatures, BSListGroupEvents, BSListGroup>
{

	private static final long serialVersionUID = 1L;

	/**
	 * List group
	 * <p>
	 * List groups are a flexible and powerful component for displaying a series of content. List group items can be modified and extended to support just about any content within.
	 * They can also be
	 * used as navigation with the right modifier class.
	 */
	public BSListGroup()
	{
		setTag("ul");
		addClass(BSComponentListGroupOptions.List_Group);

	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
