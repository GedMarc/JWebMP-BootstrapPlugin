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
