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
package za.co.mmagon.jwebswing.plugins.bootstrap.dropdown;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.attributes.ButtonAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapReferencePool;
import za.co.mmagon.jwebswing.plugins.bootstrap.buttons.BSButtonAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap.buttons.groups.BSButtonGroupAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentDefaultOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.menu.BSDropDownMenu;

/**
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included Bootstrap dropdown JavaScript plugin. They’re toggled by clicking,
 * not by hovering; this is an intentional design decision.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 13 Jan 2017
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Dropdown", description = "Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included Bootstrap dropdown JavaScript plugin. They’re toggled by clicking, not by hovering; this is an intentional design decision.",
                      url = "https://v4-alpha.getbootstrap.com/components/dropdowns/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSDropDown<J extends BSDropDown>
        extends Div<BSDropDownChildren, BSDropDownAttributes, GlobalFeatures, BSDropDownEvents, J> implements IBSDropDown<J>
{

    private static final long serialVersionUID = 1L;

    /**
     * The button for the drop down,
     */
    private Component dropdownButton;

    /**
     * The dropdownMenu for this drop down
     */
    private BSDropDownMenu dropdownMenu;

    /**
     * Construct a new bootstrap drop down
     */
    public BSDropDown()
    {
        addClass(BSComponentDropDownOptions.Dropdown);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Construct a new drop down
     *
     * @param link
     */
    public BSDropDown(BSDropDownLink link)
    {
        this();
        setDropdownButton(link);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Constructs a new bootstrap drop down with the given button
     *
     * @param button
     */
    public BSDropDown(BSDropDownButton button)
    {
        this();
        setDropdownButton(button);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Neater view on the matter
     *
     * @return
     */
    public IBSDropDown asMe()
    {
        return this;
    }

    /**
     * Sets no Cart on the item
     *
     * @param noCaret
     * @return
     */
    public J setNoCaret(boolean noCaret)
    {
        if (noCaret)
        {
            getDropdownButton().addClass("no-caret");
            if (BootstrapPageConfigurator.isBootstrap4())
            {
                addCssReference(BootstrapReferencePool.Bootstrap4DropDownReference.getCssReference());
            }
        }
        else
        {
            getDropdownButton().removeClass("no-caret");
            if (BootstrapPageConfigurator.isBootstrap4())
            {
                getCssReferences().remove(BootstrapReferencePool.Bootstrap4DropDownReference.getCssReference());
            }
        }

        return (J) this;
    }

    /**
     * Returns the current dropdownMenu or a new one
     *
     * @return
     */
    @Override
    public BSDropDownMenu getDropdownMenu()
    {
        if (dropdownMenu == null)
        {
            setMenu(new BSDropDownMenu());
        }
        return dropdownMenu;
    }

    /**
     * Sets the dropdownMenu
     *
     * @param menu
     *
     * @return
     */
    @Override
    public BSDropDown setMenu(BSDropDownMenu menu)
    {
        this.dropdownMenu = menu;
        if (menu != null)
        {
            menu.addAttribute(BSButtonAttributes.Role.toString(), "menu");
        }
        return this;
    }

    /**
     * Returns the drop down button
     *
     * @return
     */
    @Override
    public Component getDropdownButton()
    {
        if (dropdownButton == null)
        {
            setDropdownButton(new BSDropDownLink());
        }
        return dropdownButton;
    }

    /**
     * Sets the drop down dropdownMenu button
     *
     * @param <T>            bs drop down children type
     * @param dropdownButton
     *
     * @return
     */
    @Override
    public final J setDropdownButton(Component dropdownButton)
    {
        this.dropdownButton = (Component) dropdownButton;
        if (dropdownButton != null)
        {
            dropdownButton.addClass(BSComponentDropDownOptions.Dropdown_Toggle);
        }
        return (J) this;
    }

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            getDropdownButton().addAttribute(BSButtonGroupAttributes.Role.toString(), "button");
            add((BSDropDownChildren) getDropdownButton());
            add((BSDropDownChildren) getDropdownMenu());

            getDropdownMenu().addAttribute(GlobalAttributes.Aria_LabelledBy.toString(), getDropdownButton().getID());
            getDropdownButton().addAttribute(ButtonAttributes.Data_Target.toString(), getDropdownMenu().getID());

            if (Link.class.isAssignableFrom(getDropdownButton().getClass()))
            {
                addClass(BSComponentDefaultOptions.Show);
            }
        }
        super.preConfigure();
    }

}
