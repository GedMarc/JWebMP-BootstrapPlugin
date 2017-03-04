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

import java.util.ArrayList;
import java.util.List;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentColoursOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentDefaultOptions;

/**
 * Carousel
 * <p>
 * A slideshow component for cycling through elements—images or slides of text—like a carousel.
 * <p>
 * In browsers where the Page Visibility API is supported, the carousel will avoid sliding when the webpage is not visible to the user (such as when the browser tab is inactive, the browser window is
 * minimized, etc.). Nested carousels are not supported.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 01 Jan 2017
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Carousel", description = " slideshow component for cycling through elements—images or slides of text—like a carousel.",
        url = "https://v4-alpha.getbootstrap.com/components/carousel/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSCarousel<J extends BSCarousel> extends Div<BSCarouselChildren, BSCarouselAttributes, BSCarouselFeatures, BSCarouselEvents, J> implements IBSCarousel<J>
{

    private static final long serialVersionUID = 1L;
    private BSCarouselFeature feature;

    /**
     * Determines the active slide
     */
    private int activeSlide;
    /**
     * The list of slides that gets rendered
     */
    private List<BSCarouselItem> slides;
    /**
     * The actual carousel slides displaying div
     */
    private BSCarouselSlides carouselSlides;
    /**
     * The previous link
     */
    private BSCarouselControl previousLink;
    /**
     * The next link
     */
    private BSCarouselControl nextLink;
    /**
     * Whether or not this carousel will show indicators
     */
    private boolean indicators;

    /**
     * Carousel
     * <p>
     * A slideshow component for cycling through elements—images or slides of text—like a carousel.
     * <p>
     * In browsers where the Page Visibility API is supported, the carousel will avoid sliding when the webpage is not visible to the user (such as when the browser tab is inactive, the browser window
     * is minimized, etc.). Nested carousels are not supported.
     */
    public BSCarousel()
    {
        addFeature(getFeature());
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Neater representation
     *
     * @return
     */
    public IBSCarousel asMe()
    {
        return this;
    }

    /**
     * Returns the java script feature associated
     *
     * @return
     */
    public final BSCarouselFeature getFeature()
    {
        if (feature == null)
        {
            feature = new BSCarouselFeature(this);
        }
        return feature;
    }

    /**
     * Returns any javascript options available
     *
     * @return
     */
    @Override
    public BSCarouselOptions getOptions()
    {
        return getFeature().getOptions();
    }

    /**
     * The active slide
     *
     * @return
     */
    @Override
    public int getActiveSlide()
    {
        return activeSlide;
    }

    /**
     * Sets the active slide
     *
     * @param activeSlide
     *
     * @return
     */
    @Override
    public BSCarousel setActiveSlide(int activeSlide)
    {
        this.activeSlide = activeSlide;
        return this;
    }

    /**
     * Returns the list of slides currently associated
     *
     * @return
     */
    @Override
    public List<BSCarouselItem> getSlides()
    {
        if (slides == null)
        {
            setSlides(new ArrayList<>());
        }
        return slides;
    }

    /**
     * Sets the list of slides currently associated
     *
     * @param slides
     *
     * @return
     */
    @Override
    public BSCarousel setSlides(List<BSCarouselItem> slides)
    {
        this.slides = slides;
        return this;
    }

    /**
     * Returns the carousel slides
     *
     * @return
     */
    @Override
    public BSCarouselSlides getCarouselSlides()
    {
        if (carouselSlides == null)
        {
            setCarouselSlides(new BSCarouselSlides());
        }
        return carouselSlides;
    }

    /**
     * Sets the carousel slides
     *
     * @param carouselSlides
     *
     * @return
     */
    @Override
    public J setCarouselSlides(BSCarouselSlides carouselSlides)
    {
        this.carouselSlides = carouselSlides;
        return (J) this;
    }

    /**
     * Returns the previous link
     *
     * @return
     */
    @Override
    public BSCarouselControl getPreviousLink()
    {
        if (previousLink == null)
        {
            setPreviousLink(new BSCarouselControl(this, true));
        }
        return previousLink;
    }

    /**
     * Set's the previous link
     *
     * @param previousLink
     *
     * @return
     */
    @Override
    public J setPreviousLink(BSCarouselControl previousLink)
    {
        getChildren().remove(this.previousLink);
        this.previousLink = previousLink;
        if (this.previousLink != null)
        {
            if (BootstrapPageConfigurator.isBootstrap4())
            {
                previousLink.addClass(BSComponentCarouselOptions.Carousel_Control_Prev);
            }
            else
            {
                previousLink.addClass("left");
                previousLink.addClass(BSComponentCarouselOptions.Carousel_Control);
            }

            previousLink.addAttribute("role", "button");
            previousLink.addAttribute("data-slide", "prev");

            Span iconSpan = new Span();
            iconSpan.addAttribute(GlobalAttributes.Aria_Hidden, "true");
            if (BootstrapPageConfigurator.isBootstrap4())
            {
                iconSpan.addClass(BSComponentCarouselOptions.Carousel_Control_Prev_Icon);
            }
            else
            {
                iconSpan.addClass(BSComponentCarouselOptions.Icon_Next);
            }

            Span readerFriendly = new Span("Previous");
            readerFriendly.addClass(BSComponentColoursOptions.Sr_Only);
            previousLink.add(iconSpan);
            previousLink.add(readerFriendly);
        }
        return (J) this;
    }

    /**
     * Returns the next link
     *
     * @return
     */
    @Override
    public BSCarouselControl getNextLink()
    {
        if (nextLink == null)
        {
            setNextLink(new BSCarouselControl(this, false));
        }
        return nextLink;
    }

    /**
     * The data-ride="carousel" attribute is used to mark a carousel as animating starting at page load. It cannot be used in combination with (redundant and unnecessary) explicit JavaScript
     * initialization of the same carousel.
     *
     * @param startAnimationOnLoad
     *
     * @return
     */
    @Override
    public J setAnimateOnLoad(boolean startAnimationOnLoad)
    {
        if (startAnimationOnLoad)
        {
            addAttribute("data-ride", "carousel");
        }
        else
        {
            getAttributesCustom().remove("data-ride");
        }
        return (J) this;
    }

    /**
     * Sets the time in milli's
     *
     * @param interval
     *
     * @return
     */
    @Override
    public J setInterval(int interval)
    {
        addAttribute("data-interval", interval + "");
        return (J) this;
    }

    /**
     * Whether or not to respond to keyboard actions
     *
     * @param keyboard
     *
     * @return
     */
    @Override
    public J setKeyboard(boolean keyboard)
    {
        addAttribute("data-keyboard", keyboard + "");
        return (J) this;
    }

    /**
     * If set to "hover", pauses the cycling of the carousel on mouse-enter and resumes the cycling of the carousel on mouse-leave. If set to null, hovering over the carousel won't pause it.
     *
     * @param pause
     *
     * @return
     */
    @Override
    public J setPause(boolean pause)
    {
        addAttribute("data-pause", pause ? "hover" : "" + "null");
        return (J) this;
    }

    /**
     * Whether the carousel should cycle continuously or have hard stops.
     *
     * @param wrap
     *
     * @return
     */
    @Override
    public J setWrap(boolean wrap)
    {
        addAttribute("data-wrap", wrap + "");
        return (J) this;
    }

    /**
     * Sets the next link
     *
     * @param nextLink
     *
     * @return
     */
    @Override
    public J setNextLink(BSCarouselControl nextLink)
    {
        getChildren().remove(this.nextLink);
        this.nextLink = nextLink;
        if (this.nextLink != null)
        {
            if (BootstrapPageConfigurator.isBootstrap4())
            {
                nextLink.addClass(BSComponentCarouselOptions.Carousel_Control_Next);
            }
            else
            {
                nextLink.addClass("right");
                nextLink.addClass(BSComponentCarouselOptions.Carousel_Control);
            }

            nextLink.addAttribute("role", "button");
            nextLink.addAttribute("data-slide", "next");

            Span iconSpan = new Span();
            iconSpan.addAttribute(GlobalAttributes.Aria_Hidden, "true");
            if (BootstrapPageConfigurator.isBootstrap4())
            {

                iconSpan.addClass(BSComponentCarouselOptions.Carousel_Control_Next_Icon);
            }
            else
            {
                iconSpan.addClass(BSComponentCarouselOptions.Icon_Next);
            }

            Span readerFriendly = new Span("Next");
            readerFriendly.addClass(BSComponentColoursOptions.Sr_Only);
            nextLink.add(iconSpan);
            nextLink.add(readerFriendly);
        }
        return (J) this;
    }

    /**
     * Whether or not this carousel shows indicators
     *
     * @return
     */
    @Override
    public boolean isIndicators()
    {
        return indicators;
    }

    /**
     * Whether or not this carousel shows indicators
     *
     * @param indicators
     *
     * @return
     */
    @Override
    public J setIndicators(boolean indicators)
    {
        this.indicators = indicators;
        return (J) this;
    }

    @Override
    public void init()
    {
        if (!isInitialized())
        {
            BSCarouselIndicators indications = new BSCarouselIndicators(this);
            indications.init();
            add(indications);
            add(getCarouselSlides());

            BSCarouselItem activeItem;
            if (!getSlides().isEmpty())
            {
                activeItem = getSlides().get(getActiveSlide());
                activeItem.addClass(BSComponentDefaultOptions.Active);
            }
            for (BSCarouselItem slide : getSlides())
            {
                getCarouselSlides().add(slide);
            }

            add(getPreviousLink());
            add(getNextLink());

        }
        super.init();
    }
}
