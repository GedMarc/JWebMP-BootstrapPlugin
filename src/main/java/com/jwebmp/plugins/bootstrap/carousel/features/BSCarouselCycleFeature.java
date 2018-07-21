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
package com.jwebmp.plugins.bootstrap.carousel.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.bootstrap.carousel.BSCarousel;
import com.jwebmp.plugins.bootstrap.carousel.BSCarouselFeatures;
import com.jwebmp.plugins.bootstrap.carousel.BSCarouselOptions;

/**
 * Cycles through the carousel items from left to right.
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
@SuppressWarnings("unused")
public class BSCarouselCycleFeature<J extends BSCarouselCycleFeature<J>>
		extends Feature<BSCarouselOptions, J>
		implements BSCarouselFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;
	/**
	 * The method name to call
	 */
	private static final String methodName = "cycle";

	/**
	 * Constructs a new Carousel Feature - Cycle
	 * <p>
	 *
	 * @param forComponent
	 */
	public BSCarouselCycleFeature(BSCarousel forComponent)
	{
		super("BSCarouselCycleFeature");
		setComponent(forComponent);
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "carousel('";
		requiredString += methodName;
		requiredString += "');" + getNewLine();
		addQuery(requiredString);
	}
}
