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
package com.jwebmp.plugins.bootstrap;

import com.jwebmp.BaseTestClass;
import com.jwebmp.Page;
import org.junit.jupiter.api.Assertions;

/**
 * @author GedMarc
 */
public class BootstrapPageConfiguratorTest
		extends BaseTestClass
{
	public BootstrapPageConfiguratorTest()
	{
	}

	@org.junit.jupiter.api.Test
	public void testPageConfiguration()
	{
		Page p = getInstance();
		BootstrapPageConfigurator bpc = new BootstrapPageConfigurator();
		System.out.println(p.toString(true));
		Assertions.assertTrue(p.toString(true)
		                       .contains(
				                       "<!DOCTYPE html>\n" + "<html>\n" + "\t<head>\n" + "\t\t<meta charset=\"utf-16\">\n" + "\t\t<meta content=\"IE=Edge\" http-equiv=\"X-UA-Compatible\">\n" + "\t\t<meta content=\"width=device-width, initial-scale=1, maximum-scale=1,user-scalable=no\" name=\"viewport\">\n" + "\t\t<link href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" + "\t</head>\n" + "\t<body id=\"body\">\n" + "\t\t<script src=\"bower_components/jquery-3/dist/jquery.min.js\" type=\"text/javascript\"></script>\n" + "\t\t<script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\" type=\"text/javascript\"></script>"));
	}

}
