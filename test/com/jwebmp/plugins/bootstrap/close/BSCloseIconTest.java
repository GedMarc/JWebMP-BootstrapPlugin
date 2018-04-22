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
package com.jwebmp.plugins.bootstrap.close;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSCloseIconTest

{

	public BSCloseIconTest()
	{
	}

	@Test
	public void test()
	{
		BSCloseIcon icon = new BSCloseIcon();
		icon.setID("icon");
		icon.getCloseIcon()
		    .setID("closeIcon");
		System.out.println(icon.toString(true));
		Assertions.assertEquals(
				"<button aria_label=\"Close\" class=\"close\" id=\"icon\" type=\"button\">\n" + "	<span aria_hidden=\"true\" id=\"closeIcon\">&times;</span>\n" + "</button>",
				icon.toString(true));
	}

	@Test
	public void testSetAriaLabel()
	{
		BSCloseIcon icon = new BSCloseIcon();
		icon.setID("icon");
		icon.getCloseIcon()
		    .setID("closeIcon");
		icon.setAriaLabel("aria label");
		System.out.println(icon.toString(true));
		Assertions.assertEquals(
				"<button aria_label=\"aria label\" class=\"close\" id=\"icon\" type=\"button\">\n" + "	<span aria_hidden=\"true\" id=\"closeIcon\">&times;</span>\n" + "</button>",
				icon.toString(true));
	}

	@Test
	public void testGetCloseIcon()
	{
		BSCloseIcon icon = new BSCloseIcon();
		icon.setID("icon");
		icon.getCloseIcon()
		    .setID("closeIcon");
		icon.setAriaLabel("aria label");
		System.out.println(icon.toString(true));
		Assertions.assertEquals(
				"<button aria_label=\"aria label\" class=\"close\" id=\"icon\" type=\"button\">\n" + "	<span aria_hidden=\"true\" id=\"closeIcon\">&times;</span>\n" + "</button>",
				icon.toString(true));
	}

	@Test
	public void testGetCloseIconText()
	{
		BSCloseIcon icon = new BSCloseIcon();
		icon.setID("icon");
		icon.getCloseIcon()
		    .setID("closeIcon");
		icon.setAriaLabel("aria label");
		icon.setCloseIconText("newText");
		System.out.println(icon.toString(true));
		Assertions.assertEquals(
				"<button aria_label=\"aria label\" class=\"close\" id=\"icon\" type=\"button\">\n" + "	<span aria_hidden=\"true\" id=\"closeIcon\">newText</span>\n" + "</button>",
				icon.toString(true));
	}

	@Test
	public void testJSON()
	{
		BSCloseIcon icon = new BSCloseIcon();
		icon.setID("icon");
		icon.getCloseIcon()
		    .setID("closeIcon");
		icon.setAriaLabel("aria label");
		icon.setCloseIconText("newText");
		System.out.println(icon.toString());
		Assertions.assertEquals(
				"<button aria_label=\"aria label\" class=\"close\" id=\"icon\" type=\"button\">\n" + "	<span aria_hidden=\"true\" id=\"closeIcon\">newText</span>\n" + "</button>",
				icon.toString(true));
	}
}
