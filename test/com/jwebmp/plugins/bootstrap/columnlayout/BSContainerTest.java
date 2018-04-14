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
package com.jwebmp.plugins.bootstrap.columnlayout;

import com.jwebmp.BaseTestClass;
import com.jwebmp.plugins.bootstrap.containers.BSContainer;
import com.jwebmp.plugins.bootstrap.containers.BSContainerType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSContainerTest
		extends BaseTestClass
{

	public BSContainerTest()
	{

	}

	@Test
	public void testNewInstance()
	{
		BSContainer.newInstance(BSContainerType.Container);
	}

	@Test
	public void testContainer()
	{
		BSContainer b = new BSContainer();
		b.setID("id");
		System.out.println(b.toString(true));
		Assertions.assertEquals("<div class=\"container-fluid\" id=\"id\"></div>", b.toString(true));

		b.setContainerType(BSContainerType.Container);
		System.out.println(b.toString(true));
		Assertions.assertEquals("<div class=\"container\" id=\"id\"></div>", b.toString(true));
		soutDivider();
	}

}
