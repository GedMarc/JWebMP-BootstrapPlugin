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
