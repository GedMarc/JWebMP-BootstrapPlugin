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
package za.co.mmagon.jwebswing.plugins.bootstrap.buttons.toolbars;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * Button toolbar
 * <p>
 * Combine sets of button groups into button toolbars for more complex components.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Toolbar", description = "Combine sets of button groups into button toolbars for more complex components. Use utility classes as needed to space out groups, buttons, and more.",
        url = "https://v4-alpha.getbootstrap.com/components/button-group/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSButtonToolbar extends Div<BSButtonToolbarChildren, BSButtonToolbarAttributes, GlobalFeatures, BSButtonToolbarEvents, BSButtonToolbar> implements IBSButtonToolbar
{

    private static final long serialVersionUID = 1L;

    /**
     * Button toolbar
     * <p>
     * Combine sets of button groups into button toolbar for more complex components.
     */
    public BSButtonToolbar()
    {
        addAttribute(BSButtonToolbarAttributes.Role, "toolbar");
        setAriaLabel("Button Toolbar");
        addClass(BSComponentButtonToolbarOptions.Btn_Toolbar);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Neater representation
     *
     * @return
     */
    public IBSButtonToolbar asMe()
    {
        return this;
    }

    /**
     * Sets the screen reader label for this group
     *
     * @param label
     *
     * @return
     */
    @Override
    public final BSButtonToolbar setAriaLabel(String label)
    {
        addAttribute(GlobalAttributes.Aria_Label, label);
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
