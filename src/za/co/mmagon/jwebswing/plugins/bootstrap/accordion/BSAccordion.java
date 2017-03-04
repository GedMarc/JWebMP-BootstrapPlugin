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

import java.util.ArrayList;
import java.util.List;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.LinkAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * Extend the default collapse behavior to create an accordion.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Accordion", description = "Extend the default collapse behavior to create an accordion.",
        url = "https://v4-alpha.getbootstrap.com/components/collapse/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSAccordion<J extends BSAccordion> extends Div<BSAccordionChildren, BSAccordionAttributes, GlobalFeatures, BSAccordionEvents, J>
{

    private static final long serialVersionUID = 1L;
    /**
     * All the accordion items
     */
    private List<BSAccordionItem> accordionItems;
    /**
     * The active item
     */
    private int activeItem = 0;

    /**
     * Extend the default collapse behavior to create an accordion.
     */
    @SuppressWarnings("")
    public BSAccordion()
    {
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
        addAttribute(BSAccordionAttributes.Role, "tablist");
        addAttribute(BSAccordionAttributes.Aria_Multiselectable, "true");
    }

    /**
     * Returns the list of accordion items
     *
     * @return
     */
    public List<BSAccordionItem> getAccordionItems()
    {
        if (this.accordionItems == null)
        {
            setAccordionItems(new ArrayList<>());
        }
        return accordionItems;
    }

    @Override
    public J add(BSAccordionChildren newChild)
    {
        getAccordionItems().add((BSAccordionItem) newChild);
        return super.add(newChild);
    }

    /**
     * Sets the list of accordion items
     *
     * @param accordionItems
     */
    public void setAccordionItems(List<BSAccordionItem> accordionItems)
    {
        this.accordionItems = accordionItems;
        getChildren().clear();
        setConfigured(false);
    }

    /**
     * Sets the active accordion item
     *
     * @return
     */
    public int getActiveItem()
    {
        return activeItem;
    }

    /**
     * Sets the active accordion item
     *
     * @param activeItem
     */
    public void setActiveItem(int activeItem)
    {
        this.activeItem = activeItem;
    }

    @Override
    public void init()
    {
        if (!isInitialized())
        {
            for (int i = 0; i < getAccordionItems().size(); i++)
            {
                BSAccordionItem next = getAccordionItems().get(i);
                next.getAccordionHeader().getAccordionHeaderLink().addAttribute("data-parent", getID(true));
                next.getAccordionHeader().getAccordionHeaderLink().addAttribute(LinkAttributes.HRef, next.getAccordionCollapsingContent().getID(true));
                if (i == getActiveItem())
                {
                    next.setActive(true);
                }
                else
                {
                    next.setActive(false);
                }
            }

        }
        super.init();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 79 * hash + (this.getID().hashCode());
        return hash;
    }
}
