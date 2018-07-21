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

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;

/**
 * Optional captions
 * <p>
 * Add captions to your slides easily with the .carousel-caption element within any .carousel-item. Place just about any optional HTML within there and it will be automatically
 * aligned and formatted.
 *
 * @author GedMarc
 * @since 4th Jan 2017
 */
public class BSCarouselCaption
		extends Div<GlobalChildren, NoAttributes, GlobalFeatures, GlobalEvents, BSCarouselCaption>
{

	/**
	 * Optional captions
	 * <p>
	 * Add captions to your slides easily with the .carousel-caption element within any .carousel-item. Place just about any optional HTML within there and it will be automatically
	 * aligned and
	 * formatted.
	 */
	public BSCarouselCaption()
	{
	}

	/**
	 * Optional captions
	 * <p>
	 * Add captions to your slides easily with the .carousel-caption element within any .carousel-item. Place just about any optional HTML within there and it will be automatically
	 * aligned and
	 * formatted.
	 *
	 * @param text
	 */
	public BSCarouselCaption(String text)
	{
		super(text);
	}

}
