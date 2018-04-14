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

import com.jwebmp.BaseTestClass;
import com.jwebmp.plugins.bootstrap.buttons.BSButton;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonPrimaryOutline;
import com.jwebmp.plugins.bootstrap.dropdown.menu.BSDropDownMenuItem;
import com.jwebmp.plugins.bootstrap.dropdown.menu.BSDropDownMenuItemDivider;
import com.jwebmp.plugins.bootstrap.dropdown.menu.BSDropDownMenuItemHeader;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSDropDownTest
		extends BaseTestClass
{

	public BSDropDownTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BSDropDown drop = new BSDropDown();
		drop.getDropdownMenu()
		    .add(new BSDropDownMenuItem("menu item"));
		drop.getDropdownMenu()
		    .add(new BSDropDownMenuItemDivider());
		drop.getDropdownMenu()
		    .add(new BSDropDownMenuItemHeader("Text Yes"));
		System.out.println(drop.toString(true));
	}

	@Test
	public void testSingleDropdown()
	{
		BSDropDown drop = new BSDropDown();
		drop.setDropdownButton(new BSButtonPrimaryOutline());
		System.out.println(drop.toString(true));
	}

	@Test
	public void testSplitButton()
	{
		BSButton actionButton = new BSButton("action");
		BSDropDownSplitButton splitButton = new BSDropDownSplitButton(actionButton);

		System.out.println(splitButton.toString(true));
	}

	@Test
	public void testDropupButton()
	{
		BSDropUp up = new BSDropUp();
		System.out.println(up.toString(true));
	}
}
