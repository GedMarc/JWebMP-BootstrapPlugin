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
package za.co.mmagon.jwebswing.plugins.bootstrap.carousel.features;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.bootstrap.carousel.BSCarousel;
import za.co.mmagon.jwebswing.plugins.bootstrap.carousel.BSCarouselFeatures;
import za.co.mmagon.jwebswing.plugins.bootstrap.carousel.BSCarouselOptions;

import java.util.Objects;

/**
 * Cycles the carousel to a particular frame (0 based, similar to an array).
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class BSCarouselSlideToNumberFeature<J extends BSCarouselSlideToNumberFeature<J>> extends Feature<BSCarouselOptions, J>
		implements BSCarouselFeatures, GlobalFeatures
{
	
	private static final long serialVersionUID = 1L;
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
	 * @param methodName
	 */
	public void setSlideNumber(String methodName)
	{
		this.methodName = methodName;
	}
	
	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "carousel(";
		requiredString += methodName;
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSCarouselSlideToNumberFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSCarouselSlideToNumberFeature<?> that = (BSCarouselSlideToNumberFeature<?>) o;
		return Objects.equals(getComponent(), that.getComponent());
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), methodName);
	}
}
