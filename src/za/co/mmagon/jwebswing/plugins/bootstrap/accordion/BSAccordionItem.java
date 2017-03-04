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
