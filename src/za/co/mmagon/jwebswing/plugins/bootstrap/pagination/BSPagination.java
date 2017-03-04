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
package za.co.mmagon.jwebswing.plugins.bootstrap.pagination;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * Pagination
 * <p>
 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page approach to long lists of content improves general performance, such
 * as in search results or inboxes.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 17 Jan 2017
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Pagination", description = "Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page approach to long lists of content improves general performance, such as in search results or inboxes.",
        url = "https://v4-alpha.getbootstrap.com/components/pagination/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSPagination<J extends BSPagination>
        extends Div<BSPaginationChildren, BSPaginationAttributes, GlobalFeatures, GlobalEvents, J> implements IBSPagination
{

    private static final long serialVersionUID = 1L;

    /**
     * The actual list for the pagination
     */
    private BSPaginationList pageList;

    /**
     * Pagination
     * <p>
     * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page approach to long lists of content improves general performance,
     * such as in search results or inboxes.
     * <p>
     */
    public BSPagination()
    {
        setTag("nav");
        addAttribute(GlobalAttributes.Aria_Label, "bootstrap pagination");
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Pagination
     * <p>
     * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page approach to long lists of content improves general performance,
     * such as in search results or inboxes.
     *
     * @param sizing Fancy larger or smaller pagination? Add .pagination-lg or .pagination-sm for additional sizes.
     */
    public BSPagination(BSComponentPaginationSizingOptions sizing)
    {
        this();
        getPageList().addClass(sizing);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Pagination
     * <p>
     * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page approach to long lists of content improves general performance,
     * such as in search results or inboxes.
     *
     * @param alignment Change the alignment of pagination components with flexbox utilities.
     */
    public BSPagination(BSComponentPaginationAlignmentOptions alignment)
    {
        this();
        getPageList().addClass(alignment);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Pagination
     * <p>
     * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page approach to long lists of content improves general performance,
     * such as in search results or inboxes.
     *
     * @param alignment Change the alignment of pagination components with flexbox utilities.
     * @param sizing    Fancy larger or smaller pagination? Add .pagination-lg or .pagination-sm for additional sizes.
     */
    public BSPagination(BSComponentPaginationSizingOptions sizing, BSComponentPaginationAlignmentOptions alignment)
    {
        this();
        getPageList().addClass(sizing);
        getPageList().addClass(alignment);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Creates a new pagination button link.
     * <p>
     * Use .getParent() to access the list item object
     *
     * @param ariaLabel
     *
     * @return
     */
    @Override
    public BSPaginationLink createPageLink(String ariaLabel)
    {
        BSPageinationListItem listItem = new BSPageinationListItem();
        BSPaginationLink newLink = new BSPaginationLink(ariaLabel);

        listItem.add(newLink);
        getPageList().add(listItem);
        return newLink;

    }

    /**
     * A neater view
     *
     * @return
     */
    public IBSPagination asMe()
    {
        return this;
    }

    /**
     * The actual list for the pagination
     *
     * @return
     */
    @Override
    public final BSPaginationList getPageList()
    {
        if (this.pageList == null)
        {
            setPageList(new BSPaginationList());
        }
        return pageList;
    }

    /**
     * The actual list for the pagination
     *
     * @param pageList
     */
    @Override
    public void setPageList(BSPaginationList pageList)
    {
        if (this.pageList != null)
        {
            getChildren().remove(this.pageList);
        }
        this.pageList = pageList;
        if (this.pageList != null)
        {
            add(this.pageList);
        }
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
