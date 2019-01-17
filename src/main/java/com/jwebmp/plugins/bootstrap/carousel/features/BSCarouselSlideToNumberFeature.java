/*
 * Copyright (C) 2017 GedMarc
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
import com.jwebmp.plugins.bootstrap.carousel.BSCarouselOptions;

/**
 * Cycles the carousel to a particular frame (0 based, similar to an array).
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class BSCarouselSlideToNumberFeature<J extends BSCarouselSlideToNumberFeature<J>>
		extends Feature<GlobalFeatures, BSCarouselOptions, J>
{


	/**
	 * The method name to call
	 */
	private String methodName = "0";

	/**
	 * Cycles the carousel to a particular frame (0 based, similar to an array).
	 * <p>
	 *
	 * @param forComponent
	 */
	public BSCarouselSlideToNumberFeature(BSCarousel forComponent)
	{
		super("BSCarouselPauseFeature");
		setComponent(forComponent);
	}

	/**
	 * Sets the slide number
	 *
	 * @return
	 */
	public String getSlideNumber()
	{
		return methodName;
	}

	/**
	 * Sets the slide number
	 *
	 * @param methodName
	 */
	public void setSlideNumber(String methodName)
	{
		this.methodName = methodName;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "carousel(";
		requiredString += methodName;
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}
}
