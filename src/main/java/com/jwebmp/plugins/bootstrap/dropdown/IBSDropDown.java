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
package com.jwebmp.plugins.bootstrap.dropdown;

import com.jwebmp.core.Component;
import com.jwebmp.plugins.bootstrap.dropdown.menu.BSDropDownMenu;

/**
 * @author GedMarc
 * @since 20 Feb 2017
 */
public interface IBSDropDown<J extends BSDropDown>
{

	/**
	 * Returns the drop down button
	 *
	 * @return
	 */
	Component getDropdownButton();

	/**
	 * Returns the current dropdownMenu or a new one
	 *
	 * @return
	 */
	BSDropDownMenu getDropdownMenu();

	/**
	 * Sets the drop down dropdownMenu button
	 *
	 * @param dropdownButton
	 *
	 * @return
	 */
	J setDropdownButton(Component dropdownButton);

	/**
	 * Sets the dropdownMenu
	 *
	 * @param menu
	 *
	 * @return
	 */
	BSDropDown setMenu(BSDropDownMenu menu);

}
