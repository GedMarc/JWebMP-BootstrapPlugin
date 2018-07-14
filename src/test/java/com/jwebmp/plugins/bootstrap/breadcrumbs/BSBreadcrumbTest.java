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
package com.jwebmp.plugins.bootstrap.breadcrumbs;

import org.junit.jupiter.api.Test;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * @author GedMarc
 */
public class BSBreadcrumbTest
{

	public BSBreadcrumbTest()
	{
	}

	@Test
	public void testGetCrumbLink()
	{
		BSBreadcrumb crumbs = new BSBreadcrumb();
		System.out.println(crumbs.toString(true));
	}

	@Test
	public void testSetCrumbLink()
	{
		BSBreadcrumb crumbs = new BSBreadcrumb(new BSBreadCrumbLink(STRING_HASH));
		System.out.println(crumbs.toString(true));

		crumbs.setActive(true);

		System.out.println(crumbs.toString(true));
	}

}
