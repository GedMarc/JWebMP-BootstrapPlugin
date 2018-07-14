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

import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.ListItem;
import org.junit.jupiter.api.Test;

public class BSTabsTest

{
	@Test
	public void testBSTabs()
	{
		BSTabs tab = new BSTabs();
		System.out.println(tab.toString(true));

		//tab.asMe().

	}

	@Test
	public void testBSTabsContent()
	{
		BSTabs tabs = new BSTabs();
		BSTab tab = new BSTab(new ListItem(), new Div());
		BSTab tab1 = new BSTab(new ListItem(), new Div());
		BSTab tab2 = new BSTab(new ListItem(), new Div());

		tab.setActive(true);

		tabs.getTabs()
		    .add(tab);
		tabs.getTabs()
		    .add(tab1);
		tabs.getTabs()
		    .add(tab2);

		System.out.println(tabs.toString(true));

		//tab.asMe().

	}
}
