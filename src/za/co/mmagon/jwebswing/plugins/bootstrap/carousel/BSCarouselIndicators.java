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
package za.co.mmagon.jwebswing.plugins.bootstrap.carousel;

import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.children.ListChildren;

/**
 * The indicators for the bootstrap carousel
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCarouselIndicators extends List<ListChildren, NoAttributes, BSCarouselEvents, BSCarouselIndicators> implements BSCarouselChildren
{
	
	private static final long serialVersionUID = 1L;
	private final BSCarousel carousel;
	
	/**
	 * The indicators for the bootstrap carousel
	 *
	 * @param carousel
	 */
	public BSCarouselIndicators(BSCarousel carousel)
	{
		super(true);
		this.carousel = carousel;
		addClass(BSComponentCarouselOptions.Carousel_Indicators);
	}
	
	/**
	 *
	 */
	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (this.carousel != null)
			{
				for (int i = 0; i < carousel.getSlides().size(); i++)
				{
					//BSCarouselItem slide = (BSCarouselItem) carousel.getSlides().get(i);
					BSCarouselIndicatorItem newSlideIndicator = new BSCarouselIndicatorItem(carousel.getID(true), i, i == carousel.getActiveSlide());
					add(newSlideIndicator);
				}
			}
		}
		super.init();
	}
	
}
