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
package za.co.mmagon.jwebswing.plugins.bootstrap.breadcrumbs;

import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentDefaultOptions;

/**
 * A particular crumb
 *
 * @author GedMarc
 * @param <J>
 * @since 31 Dec 2016
 * @version 1.0
 *
 */
public class BSBreadcrumb<J extends BSBreadcrumb> extends ListItem<J>
        implements BSBreadcrumbsChildren, IBSBreadcrumb<J>
{

    private static final long serialVersionUID = 1L;

    /**
     * The actual link for the crumb
     */
    private Link crumbLink;

    /**
     * Constructs a particular crumb
     */
    public BSBreadcrumb()
    {
        addClass(BSComponentBreadcrumbOptions.Breadcrumb_Item);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Construct with a link and text to show
     *
     * @param crumbLink
     */
    @SuppressWarnings("")
    public BSBreadcrumb(Link crumbLink)
    {
        this();
        setCrumbLink(crumbLink);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Neater display
     *
     * @return
     */
    public IBSBreadcrumb asMe()
    {
        return this;
    }

    /**
     * Returns the crumb link, never null
     *
     * @return
     */
    @Override
    public Link getCrumbLink()
    {
        if (crumbLink == null)
        {
            setCrumbLink(new Link("#"));
        }
        return crumbLink;
    }

    /**
     * Sets the given crumb link
     *
     * @param crumbLink
     */
    @Override
    public J setCrumbLink(Link crumbLink)
    {
        if (this.crumbLink != null)
        {
            remove(this.crumbLink);
            this.crumbLink = null;
        }
        this.crumbLink = crumbLink;
        if (this.crumbLink != null)
        {
            add(this.crumbLink);
        }
        return (J) this;
    }

    /**
     * Sets this crumb to display as active
     *
     * @param active
     * @return
     */
    @Override
    public J setActive(boolean active)
    {
        if (active)
        {
            addClass(BSComponentDefaultOptions.Active);
        }
        else
        {
            removeClass(BSComponentDefaultOptions.Active);
        }
        return (J) this;
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
