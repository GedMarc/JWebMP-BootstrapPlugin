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
package za.co.mmagon.jwebswing.plugins.bootstrap.navbar.toggler;

import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.attributes.ButtonAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.BSComponentNavBarOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.BSNavBarChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.navs.BSComponentNavsOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.navs.BSNavs;

/**
 *
 * @author GedMarc
 * @since 21 Jan 2017
 *
 */
public class BSNavBarToggler extends Button implements BSNavBarChildren, IBSNavBarToggler
{

    private static final long serialVersionUID = 1L;

    /**
     * The specified screen reader aria label to apply when creating the div
     */
    private static String ARIA_LABEL = "Toggle Navigation";

    private String iconClass = BSComponentNavBarOptions.Navbar_Toggler_Icon.toString();

    /**
     * Creates 2 new accessible objects for the nav bar
     *
     * @param togglerAlignment
     */
    public BSNavBarToggler(BSNavBarTogglerAlignments togglerAlignment)
    {
        addClass(BSComponentNavBarOptions.Navbar_Toggler);
        addClass(togglerAlignment);
    }

    /**
     * Nav
     * <p>
     * Navbar navigation links build on our .nav options with their own modifier class and require the use of toggler classes for proper responsive styling.
     * <p>
     * Navigation in navbars will also grow to occupy as much horizontal space as possible to keep your navbar contents securely aligned.
     * <p>
     * Active states—with .active—to indicate the current page can be applied directly to .nav-links or their immediate parent .nav-items.
     *
     * @param <T>
     * @param navs
     *
     * @return
     */
    @Override
    public <T extends Div & BSNavBarChildren> T createCollapsingDiv(BSNavs navs)
    {
        navs.removeClass(BSComponentNavsOptions.Nav);
        navs.addClass(BSComponentNavsOptions.Navbar_Nav);

        BSNavBarTogglerDiv div = new BSNavBarTogglerDiv();
        div.add(navs);

        addAttribute(ButtonAttributes.Data_Toggle, "collapse");
        addAttribute(ButtonAttributes.Data_Target, div.getID(true));
        addAttribute(GlobalAttributes.Aria_Controls, div.getID());
        addAttribute(GlobalAttributes.Aria_Expanded, "false");
        addAttribute(GlobalAttributes.Aria_Label, ARIA_LABEL);
        addAttribute(GlobalAttributes.Type, "button");

        BootstrapPageConfigurator.setBootstrapRequired(this, true);

        return (T) div;
    }

    /**
     * A neater view
     *
     * @return
     */
    public IBSNavBarToggler asMe()
    {
        return this;
    }

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            Span iconSpan = new Span();
            iconSpan.addClass(getIconClass());
            add(iconSpan);
        }
        super.preConfigure();
    }

    @Override
    public String getIconClass()
    {
        return iconClass;
    }

    @Override
    public void setIconClass(String iconClass)
    {
        this.iconClass = iconClass;
    }

    /**
     * Gets the screen reader aria label
     *
     * @return
     */
    public static String getARIA_LABEL()
    {
        return ARIA_LABEL;
    }

    /**
     * sets the screen reader aria label
     *
     * @param ARIA_LABEL
     */
    public static void setARIA_LABEL(String ARIA_LABEL)
    {
        BSNavBarToggler.ARIA_LABEL = ARIA_LABEL;
    }

}
