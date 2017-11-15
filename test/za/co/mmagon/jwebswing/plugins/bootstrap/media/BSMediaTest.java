/*
 * Copyright (C) 2016 GedMarc
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
package za.co.mmagon.jwebswing.plugins.bootstrap.media;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * @author GedMarc
 */
public class BSMediaTest extends BaseTestClass
{
	
	public BSMediaTest()
	{
	}
	
	@Test
	public void testNothing()
	{
		BSMedia media = new BSMedia();
		media.setID("media");
		System.out.println(media.toString(true));
		Assertions.assertEquals("<div class=\"media\" id=\"media\"></div>", media.toString(true));
	}
	
	@Test
	public void testNothingPage()
	{
		Page p = getInstance();
		BootstrapPageConfigurator bpc = new BootstrapPageConfigurator();
		bpc.configure(p);
		BSMedia media = new BSMedia();
		media.setID("media");

		media.getMediaBody().setID("mbody");
		media.getMediaLink().setID("mlink");
		media.getMediaComponent().setID("mcomp");
		media.getMediaHeader().setID("mheader");

		p.getBody().add(media);
		System.out.println(p.toString(true));
		Assertions.assertEquals("<!DOCTYPE html>\n" +
				                        "<html>\n" +
				                        "\t<head>\n" +
				                        "\t\t<meta charset=\"utf-16\">\n" +
				                        "\t\t<meta content=\"IE=Edge\" http-equiv=\"X-UA-Compatible\">\n" +
				                        "\t\t<meta content=\"width=device-width, initial-scale=1, maximum-scale=1,user-scalable=no\" name=\"viewport\">\n" +
				                        "\t\t<link href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
				                        "\t</head>\n" +
				                        "\t<body id=\"body\">\n" +
				                        "\t\t<div class=\"media\" id=\"media\">\n" +
				                        "\t\t\t<div class=\"media-body\" id=\"mbody\">\n" +
				                        "\t\t\t\t<H4 class=\"media-heading\" id=\"mheader\"></H4>\n" +
				                        "\t\t\t</div>\n" +
				                        "\t\t\t<a class=\"media-left\" href=\"#\" id=\"mlink\">\n" +
				                        "\t\t\t\t<div class=\"media-object\" id=\"mcomp\"></div>\n" +
				                        "\t\t\t</a>\n" +
				                        "\t\t</div>\n" +
				                        "\t\t<!-- Priority [First] Values -->\n" +
				                        "\t\t<script src=\"bower_components/jquery-3/dist/jquery.min.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<!-- Priority [Second] Values -->\n" +
				                        "\t\t<script src=\"bower_components/jquery-migrate/jquery-migrate.min.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<!-- Priority [Third] Values -->\n" +
				                        "\t\t<script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n" +
				                        "\t\t<script src=\"bower_components/bootstrap-validator/dist/validator.js\" type=\"text/javascript\"></script>\n" +
				                        "\t</body>\n" +
				                        "</html>", p.toString(true));
	}
	
	@Test
	public void testGetMediaLink()
	{
		BSMedia media = new BSMedia();
		media.setID("media");
		media.getMediaLink().setID("link");
		System.out.println(media.toString(true));
		Assertions.assertEquals("<div class=\"media\" id=\"media\">\n"
				                    + "	<a class=\"media-left\" href=\"#\" id=\"link\"></a>\n"
				                    + "</div>", media.toString(true));
	}
	
	@Test
	public void testGetMediaBody()
	{
		BSMedia media = new BSMedia();
		media.setID("media");
		media.getMediaBody().setID("body");
		System.out.println(media.toString(true));
		Assertions.assertEquals("<div class=\"media\" id=\"media\">\n"
				                    + "	<div class=\"media-body\" id=\"body\"></div>\n"
				                    + "</div>", media.toString(true));
	}
	
	@Test
	public void testGetMediaHeader()
	{
		BSMedia media = new BSMedia();
		media.setID("media");
		media.getMediaHeader().setID("header");
		
		media.getMediaBody().setID("body");
		
		System.out.println(media.toString(true));
		Assertions.assertEquals("<div class=\"media\" id=\"media\">\n"
				                    + "	<div class=\"media-body\" id=\"body\">\n"
				                        + "		<H4 class=\"media-heading\" id=\"header\"></H4>\n"
				                    + "	</div>\n"
				                    + "</div>", media.toString(true));
		
	}
	
	@Test
	public void testGetMediaComponent()
	{
		BSMedia media = new BSMedia();
		media.setID("media");
		media.getMediaComponent().setID("object");
		media.getMediaLink().setID("link");
		
		System.out.println(media.toString(true));
		Assertions.assertEquals("<div class=\"media\" id=\"media\">\n"
				                    + "	<a class=\"media-left\" href=\"#\" id=\"link\">\n"
				                    + "		<div class=\"media-object\" id=\"object\"></div>\n"
				                    + "	</a>\n"
				                    + "</div>", media.toString(true));
	}
	
}
