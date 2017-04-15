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
package za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.menu;

import za.co.mmagon.jwebswing.base.html.Italic;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.attributes.LinkAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentDefaultOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.BSComponentDropDownOptions;

/**
 * A Drop Down Menu Item
 *
 * @author GedMarc
 * @since 14 Jan 2017
 *
 */
public class BSDropDownMenuItem extends Link implements BSDropDownMenuChildren
{

    private static final long serialVersionUID = 1L;
    private String iconClass;

    public BSDropDownMenuItem()
    {
        this("");
    }

    /**
     * Construct a new drop down menu item
     *
     * @param text
     */
    public BSDropDownMenuItem(String text)
    {
        addClass(BSComponentDropDownOptions.Dropdown_Item);
        setText(text);
        addAttribute(LinkAttributes.HRef, "#");
    }

    /**
     * Construct a new menu item with the given iconClass and text
     *
     * @param iconClass
     * @param text
     */
    public BSDropDownMenuItem(String iconClass, String text)
    {
        this(text);
        this.iconClass = iconClass;
    }

    public BSDropDownMenuItem setDisabled()
    {
        addClass(BSComponentDefaultOptions.Disabled);
        return this;
    }

    /**
     * Sets the icon class
     *
     * @return
     */
    public String getIconClass()
    {
        return iconClass;
    }

    /**
     * Sets the icon to the given class
     *
     * @param iconClass
     *
     * @return
     */
    public BSDropDownMenuItem setIconClass(String iconClass)
    {
        this.iconClass = iconClass;
        return this;
    }

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {

            Italic i = new Italic();
            if (iconClass != null && !iconClass.isEmpty())
            {
                i.addClass(iconClass);
            }
            setText(i.toString(true) + getText(getCurrentTabIndents()).toString());
        }
        super.preConfigure();
    }

}
