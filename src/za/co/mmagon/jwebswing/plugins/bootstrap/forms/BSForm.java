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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * Forms
 * <p>
 * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 14 Jan 2017
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Forms", description = "Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.",
                      url = "https://v4-alpha.getbootstrap.com/components/forms/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSForm<J extends BSForm> extends Div<BSFormChildren, BSFormAttributes, GlobalFeatures, BSFormEvents, J>
{

    private static final long serialVersionUID = 1L;

    /**
     * Forms
     * <p>
     * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
     */
    public BSForm()
    {
        setTag("form");
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Pre configures the item with a name
     */
    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            addAttribute(GlobalAttributes.Name, getID());
        }
        super.preConfigure();
    }

    /**
     * Configures a component as the submit button for this component
     *
     * @param component
     *
     * @return
     */
    public ComponentHierarchyBase addSubmitButton(ComponentHierarchyBase component)
    {
        component.addAttribute(AngularAttributes.ngDisabled, getID() + ".$invalid || jw.isLoading");
        component.addAttribute(GlobalAttributes.Type, "submit");
        return component;
    }
}
