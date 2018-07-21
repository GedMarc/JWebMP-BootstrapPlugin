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
package com.jwebmp.plugins.bootstrap.carousel;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.plugins.bootstrap.options.BSColoursOptions;

/**
 * @param <J>
 *
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSCarouselNavigationLink<J extends BSCarouselNavigationLink<J>>
		extends Link<J>
{

	private static final long serialVersionUID = 1L;

	public BSCarouselNavigationLink(boolean isPrevious)
	{
		if (isPrevious)
		{
			addClass("left");
			addClass(BSComponentCarouselOptions.Carousel_Control);

			addAttribute("role", "button");
			addAttribute("data-slide", "prev");

			Span iconSpan = new Span();
			iconSpan.addAttribute(GlobalAttributes.Aria_Hidden, "true");
			iconSpan.addClass("icon-next");

			Span readerFriendly = new Span("Previous");
			readerFriendly.addClass(BSColoursOptions.Sr_Only);

			add(iconSpan);
			add(readerFriendly);
		}
		else
		{
			addClass("right");
			addClass(BSComponentCarouselOptions.Carousel_Control);

			addAttribute("role", "button");
			addAttribute("data-slide", "next");

			Span iconSpan = new Span();
			iconSpan.addAttribute(GlobalAttributes.Aria_Hidden, "true");
			iconSpan.addClass("icon-next");

			Span readerFriendly = new Span("Next");
			readerFriendly.addClass(BSColoursOptions.Sr_Only);

			add(iconSpan);
			add(readerFriendly);
		}
	}

}
