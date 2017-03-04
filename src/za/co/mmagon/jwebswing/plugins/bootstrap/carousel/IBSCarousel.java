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

import java.util.List;

/**
 *
 * @author GedMarc
 * @since 20 Feb 2017
 * 
 */
public interface IBSCarousel<J extends BSCarousel> 
{

    /**
     * The active slide
     *
     * @return
     */
    int getActiveSlide();

    /**
     * Returns the carousel slides
     *
     * @return
     */
    BSCarouselSlides getCarouselSlides();

    /**
     * Returns the next link
     *
     * @return
     */
    BSCarouselControl getNextLink();

    /**
     * Returns the previous link
     *
     * @return
     */
    BSCarouselControl getPreviousLink();

    /**
     * Returns the list of slides currently associated
     *
     * @return
     */
    List<BSCarouselItem> getSlides();

    /**
     * Whether or not this carousel shows indicators
     *
     * @return
     */
    boolean isIndicators();

    /**
     * Sets the active slide
     *
     * @param activeSlide
     *
     * @return
     */
    BSCarousel setActiveSlide(int activeSlide);

    /**
     * The data-ride="carousel" attribute is used to mark a carousel as animating starting at page load. It cannot be used in combination with (redundant and unnecessary) explicit JavaScript
     * initialization of the same carousel.
     *
     * @param startAnimationOnLoad
     *
     * @return
     */
    J setAnimateOnLoad(boolean startAnimationOnLoad);

    /**
     * Sets the carousel slides
     *
     * @param carouselSlides
     *
     * @return
     */
    J setCarouselSlides(BSCarouselSlides carouselSlides);

    /**
     * Whether or not this carousel shows indicators
     *
     * @param indicators
     *
     * @return
     */
    J setIndicators(boolean indicators);

    /**
     * Sets the time in milli's
     *
     * @param interval
     *
     * @return
     */
    J setInterval(int interval);

    /**
     * Whether or not to respond to keyboard actions
     *
     * @param keyboard
     *
     * @return
     */
    J setKeyboard(boolean keyboard);

    /**
     * Sets the next link
     *
     * @param nextLink
     *
     * @return
     */
    J setNextLink(BSCarouselControl nextLink);

    /**
     * If set to "hover", pauses the cycling of the carousel on mouse-enter and resumes the cycling of the carousel on mouse-leave. If set to null, hovering over the carousel won't pause it.
     *
     * @param pause
     *
     * @return
     */
    J setPause(boolean pause);

    /**
     * Set's the previous link
     *
     * @param previousLink
     *
     * @return
     */
    J setPreviousLink(BSCarouselControl previousLink);

    /**
     * Sets the list of slides currently associated
     *
     * @param slides
     *
     * @return
     */
    BSCarousel setSlides(List<BSCarouselItem> slides);

    /**
     * Whether the carousel should cycle continuously or have hard stops.
     *
     * @param wrap
     *
     * @return
     */
    J setWrap(boolean wrap);

}
