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

/**
 * Cycles the carousel to a particular frame (0 based, similar to an array).
 *
 * @author MMagon
 * @since 2013/01/16
 * @version 1.0
 */
public class BSCarouselSlideToNumberFeature extends Feature<BSCarouselOptions, BSCarouselSlideToNumberFeature>
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
     * @param forComponent
     */
    public BSCarouselSlideToNumberFeature(BSCarousel forComponent)
    {
        super("BSCarouselPauseFeature");
        setComponent(forComponent);
    }

    public String getSlideNumber()
    {
        return methodName;
    }

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
}
