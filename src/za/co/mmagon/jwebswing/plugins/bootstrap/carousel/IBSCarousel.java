/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
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
