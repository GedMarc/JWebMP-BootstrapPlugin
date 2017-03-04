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
 * Cycles to the next item.
 *
 * @author MMagon
 * @since 2013/01/16
 * @version 1.0
 */
public class BSCarouselNextFeature extends Feature<BSCarouselOptions, BSCarouselNextFeature>
        implements BSCarouselFeatures, GlobalFeatures
{

    private static final long serialVersionUID = 1L;
    /**
     * The method name to call
     */
    private final String methodName = "next";

    /**
     * Cycles to the next item.
     * <p>
     * @param forComponent
     */
    public BSCarouselNextFeature(BSCarousel forComponent)
    {
        super("BSCarouselNextFeature");
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
