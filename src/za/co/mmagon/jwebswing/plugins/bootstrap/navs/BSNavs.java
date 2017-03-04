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
package za.co.mmagon.jwebswing.plugins.bootstrap.navs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.BSNavBarChildren;

/**
 * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states. Swap modifier classes to switch between each style.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 17 Jan 2017
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Navs", description = "Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states. Swap modifier classes to switch between each style.",
        url = "https://v4-alpha.getbootstrap.com/components/navs/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSNavs<J extends BSNavs>
        extends Div<BSNavsChildren, BSNavsAttributes, GlobalFeatures, GlobalEvents, J>
        implements BSNavBarChildren, IBSNavs
{

    private static final long serialVersionUID = 1L;
    /**
     * Assign the navigation list
     */
    private BSNavList navigationList;

    /**
     * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states. Swap modifier classes to switch between each style.
     */
    public BSNavs()
    {
        setTag("nav");
        addClass(BSComponentNavsOptions.Nav);
        addAttribute(BSNavsAttributes.Role, "navigation");
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Sets this navigation bar as centered
     *
     * @return
     */
    @Override
    public BSNavs setCentered()
    {
        addClass(BSComponentNavsOptions.Justify_Content_Center);
        return this;
    }

    /**
     * Sets this navigation bar as right aligned
     *
     * @return
     */
    @Override
    public BSNavs setRightAligned()
    {
        addClass(BSComponentNavsOptions.Justify_Content_End);
        return this;
    }

    /**
     * Assigns the navigation list
     *
     * @return
     */
    @Override
    public BSNavList getNavigationList()
    {
        if (this.navigationList == null)
        {
            setNavigationList(new BSNavList());
        }
        return navigationList;
    }

    /**
     * Sets the navigation list accordingly
     *
     * @param navigationList
     */
    @Override
    public void setNavigationList(BSNavList navigationList)
    {
        if (this.navigationList != null)
        {
            getChildren().remove(this.navigationList);
        }
        this.navigationList = navigationList;
        if (this.navigationList != null)
        {
            add(this.navigationList);
        }
    }

    /**
     * A neater version of only my options
     *
     * @return
     */
    public IBSNavs asMe()
    {
        return this;
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
