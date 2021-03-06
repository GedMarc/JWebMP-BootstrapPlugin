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
package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.navbar.toggler.BSNavBarTogglerSizes;

/**
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 13 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Navbar",
		description = "The navbar is a wrapper that positions branding, navigation, and other elements in a concise header. It’s easily extensible and, thanks to our Collapse plugin, can easily integrate responsive behaviors.",
		url = "https://v4-alpha.getbootstrap.com/components/navbar/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSNavBar<J extends BSNavBar<J>>
		extends Div<BSNavBarChildren, BSNavBarAttributes, GlobalFeatures, BSNavBarEvents, J>
		implements IBSNavBar
{


	/**
	 * Navbar
	 * <p>
	 * The navbar is a wrapper that positions branding, navigation, and other elements in a concise header. It’s easily extensible and, thanks to our Collapse plugin, can easily
	 * integrate responsive
	 * behaviors.
	 *
	 * @param navBarTogglerSize
	 * @param colourSchemes
	 */
	public BSNavBar(BSNavBarTogglerSizes navBarTogglerSize, BSNavBarColourSchemes... colourSchemes)
	{
		setTag("nav");
		addClass(BSComponentNavBarOptions.Navbar);
		addAttribute(BSNavBarAttributes.Role, "navigation");
		if (navBarTogglerSize != null)
		{
			addClass(navBarTogglerSize);
		}
		if (colourSchemes != null)
		{
			for (BSNavBarColourSchemes colourScheme : colourSchemes)
			{
				addClass(colourScheme);
			}
		}

	}

	/**
	 * Sets this navbar's positioning
	 *
	 * @param position
	 *
	 * @return
	 */
	@Override
	public BSNavBar setPositioning(BSNavBarPositioning position)
	{
		addClass(position);
		return this;
	}
}
