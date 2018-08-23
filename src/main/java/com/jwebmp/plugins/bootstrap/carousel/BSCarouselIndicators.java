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

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.children.ListChildren;

/**
 * The indicators for the bootstrap carousel
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCarouselIndicators<J extends BSCarouselIndicators<J>>
		extends List<ListChildren, NoAttributes, BSCarouselEvents, J>
		implements BSCarouselChildren<ListChildren, J>
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
		if (!isInitialized() && carousel != null)
		{
			for (int i = 0; i < carousel.getSlides()
			                            .size(); i++)
			{
				BSCarouselIndicatorItem newSlideIndicator = new BSCarouselIndicatorItem(carousel.getID(true), i, i == carousel.getActiveSlide());
				add(newSlideIndicator);
			}
		}
		super.init();
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	/**
	 * Returns the associated carousel
	 *
	 * @return
	 */
	public BSCarousel getCarousel()
	{
		return carousel;
	}
}
