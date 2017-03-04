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
package za.co.mmagon.jwebswing.plugins.bootstrap.accordion;

import za.co.mmagon.jwebswing.base.html.H5;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCardChildren;

/**
 *
 * @author GedMarc
 * @since 20 Feb 2017
 *
 */
public class BSAccordionHeader extends H5<BSAccordionHeader>
        implements BSCardChildren
{

    private static final long serialVersionUID = 1L;
    private BSAccordionHeaderLink accordionHeaderLink;

    /**
     * An accordion header for the component
     */
    public BSAccordionHeader()
    {
        this(null);
    }

    /**
     * An accordion header for the component
     *
     * @param text
     */
    public BSAccordionHeader(String text)
    {
        super(text);
        addClass("mb-0");
    }

    /**
     * Gets the current link
     *
     * @return
     */
    public BSAccordionHeaderLink getAccordionHeaderLink()
    {
        if (accordionHeaderLink == null)
        {
            setAccordionHeaderLink(new BSAccordionHeaderLink());
        }
        return accordionHeaderLink;
    }

    /**
     * Sets the link
     *
     * @param accordionHeaderLink
     */
    public void setAccordionHeaderLink(BSAccordionHeaderLink accordionHeaderLink)
    {
        if (this.accordionHeaderLink != null)
        {
            getChildren().remove(this.accordionHeaderLink);
        }
        this.accordionHeaderLink = accordionHeaderLink;
        if (this.accordionHeaderLink != null)
        {
            add(this.accordionHeaderLink);
        }
    }

}
