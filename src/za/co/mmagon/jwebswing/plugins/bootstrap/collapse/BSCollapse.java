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
package za.co.mmagon.jwebswing.plugins.bootstrap.collapse;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.LinkAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentDefaultOptions;

/**
 * Collapse
 * <p>
 * The Bootstrap collapse plugin allows you to toggle content on your pages with a few classes thanks to some helpful JavaScript.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Collapse", description = "The Bootstrap collapse plugin allows you to toggle content on your pages with a few classes thanks to some helpful JavaScript.",
                      url = "https://v4-alpha.getbootstrap.com/components/collapse/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSCollapse
{

    private static final long serialVersionUID = 1L;

    /**
     * Apply a collapse to given components
     *
     * @param linkController
     * @param display
     * @param hideOnStart
     */
    public BSCollapse(Link linkController, ComponentHierarchyBase display, boolean hideOnStart)
    {
        if (display != null)
        {
            display.addClass("collapse");
            if (!hideOnStart)
            {
                if (!BootstrapPageConfigurator.isBootstrap4())
                {
                    display.addClass(BSComponentDefaultOptions.In);
                }
                else
                {
                    display.addClass(BSComponentDefaultOptions.Show);
                }
            }
            linkController.addAttribute("aria-controls", display.getID());
            linkController.addAttribute(LinkAttributes.Data_Target.toString(), display.getID(true));
        }

        linkController.addAttribute(LinkAttributes.Data_Toggle, "collapse");
        linkController.addAttribute(GlobalAttributes.Aria_Expanded, Boolean.toString(!hideOnStart));

    }

    /**
     * Apply a collapse to given components
     *
     * @param buttonController
     * @param display
     * @param hideOnStart
     */
    public BSCollapse(Button buttonController, ComponentHierarchyBase display, boolean hideOnStart)
    {
        if (display != null)
        {
            display.addClass("collapse");
            if (!hideOnStart)
            {
                display.addClass("in");
            }

            buttonController.addAttribute("aria-controls", display.getID());
            buttonController.addAttribute("data-target", display.getID(true));
        }

        buttonController.addAttribute("data-toggle", "collapse");
        buttonController.addAttribute("aria-expanded", Boolean.toString(!hideOnStart));
    }
}
