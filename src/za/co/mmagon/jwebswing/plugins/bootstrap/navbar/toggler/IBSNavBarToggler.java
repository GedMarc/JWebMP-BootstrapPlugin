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

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.BSNavBarChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.navs.BSNavs;

/**
 *
 * @author GedMarc
 * @since 21 Feb 2017
 *
 */
public interface IBSNavBarToggler
{

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
    <T extends Div & BSNavBarChildren> T createCollapsingDiv(BSNavs navs);

    String getIconClass();

    void preConfigure();

    void setIconClass(String iconClass);

}
