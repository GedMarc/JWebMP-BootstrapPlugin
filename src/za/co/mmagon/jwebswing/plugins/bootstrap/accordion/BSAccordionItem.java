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

import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCard;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCardHeader;
import za.co.mmagon.jwebswing.plugins.bootstrap.collapse.BSCollapse;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentDefaultOptions;

/**
 * A specific item for the Accordion, built as a card
 *
 * @author GedMarc
 * @since 20 Feb 2017
 *
 */
public class BSAccordionItem extends BSCard implements BSAccordionChildren
{

    private static final long serialVersionUID = 1L;

    private BSAccordionHeader accordionHeader;
    private BSAccordionCollapsingContent accordionCollapsingContent;

    private BSCardHeader cardHeader;

    private boolean active;

    public BSAccordionItem()
    {
    }

    public BSAccordionHeader getAccordionHeader()
    {
        if (accordionHeader == null)
        {
            accordionHeader = new BSAccordionHeader();
        }
        return accordionHeader;
    }

    public void setAccordionHeader(BSAccordionHeader accordionHeader)
    {
        this.accordionHeader = accordionHeader;
    }

    public BSAccordionCollapsingContent getAccordionCollapsingContent()
    {
        if (accordionCollapsingContent == null)
        {
            accordionCollapsingContent = new BSAccordionCollapsingContent();
        }
        return accordionCollapsingContent;
    }

    public void setAccordionCollapsingContent(BSAccordionCollapsingContent accordionCollapsingContent)
    {
        this.accordionCollapsingContent = accordionCollapsingContent;
    }

    public BSCardHeader getCardHeader()
    {
        if (cardHeader == null)
        {
            setCardHeader(new BSCardHeader());
        }
        return cardHeader;
    }

    public void setCardHeader(BSCardHeader cardHeader)
    {
        this.cardHeader = cardHeader;
        this.cardHeader.addAttribute(BSAccordionAttributes.Role.toString(), "tab");
        cardHeader.add(getAccordionHeader());
    }

    /**
     * If this accordion item is active or not
     *
     * @return
     */
    public boolean isActive()
    {
        return active;
    }

    /**
     * if this accordion item is active or not
     *
     * @param active
     */
    public void setActive(boolean active)
    {
        this.active = active;
        if (isActive())
        {
            getAccordionHeader().getAccordionHeaderLink().addAttribute(GlobalAttributes.Aria_Expanded, "true");

            getAccordionHeader().getAccordionHeaderLink().removeClass(BSComponentDefaultOptions.Collapsed);
            getAccordionCollapsingContent().addClass(BSComponentDefaultOptions.Show);
        }
        else
        {
            getAccordionHeader().getAccordionHeaderLink().addAttribute(GlobalAttributes.Aria_Expanded, "false");

            getAccordionCollapsingContent().removeClass(BSComponentDefaultOptions.Show);
            getAccordionHeader().getAccordionHeaderLink().addClass(BSComponentDefaultOptions.Collapsed);
        }
    }

    @Override
    public void init()
    {
        if (!isInitialized())
        {
            add(getCardHeader());
            add(getAccordionCollapsingContent());

            getAccordionCollapsingContent().getClasses().add(0, "collapse");

            getAccordionCollapsingContent().addAttribute(BSAccordionAttributes.Role, "tabpanel");
            getAccordionCollapsingContent().addAttribute(GlobalAttributes.Aria_LabelledBy, getCardHeader().getID());
            new BSCollapse(getAccordionHeader().getAccordionHeaderLink(), getAccordionCollapsingContent().getAccordionContent(), true);

        }
        super.init();
    }

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {

        }
        super.preConfigure();
    }

}
