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
package com.jwebmp.plugins.bootstrap.navbar.toggler;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.jwebmp.utilities.StaticStrings.STRING_SPACE;

/**
 * @author GedMarc
 * @since 21 Jan 2017
 */
public enum BSNavBarTogglerSizes
		implements IBSComponentOptions
{
	/**
	 * Navbars require a wrapping .navbar with .navbar-toggleable-* for responsive collapsing and color scheme classes.
	 */
	Navbar_Toggleable_XS,
	/**
	 * Navbars require a wrapping .navbar with .navbar-toggleable-* for responsive collapsing and color scheme classes.
	 */
	Navbar_Toggleable_SM,
	/**
	 * Navbars require a wrapping .navbar with .navbar-toggleable-* for responsive collapsing and color scheme classes.
	 */
	Navbar_Toggleable_MD,
	/**
	 * Navbars require a wrapping .navbar with .navbar-toggleable-* for responsive collapsing and color scheme classes.
	 */
	Navbar_Toggleable_LG,
	/**
	 * Navbars require a wrapping .navbar with .navbar-toggleable-* for responsive collapsing and color scheme classes.
	 */
	Navbar_Toggleable_XL,;

	BSNavBarTogglerSizes()
	{ //Nothing Needed
	}

	@JsonValue
	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replaceAll("\\$", STRING_SPACE)
		             .replaceAll("_", "-");
	}
}
