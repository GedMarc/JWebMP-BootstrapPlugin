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
package com.jwebmp.plugins.bootstrap.forms;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.angular.AngularAttributes;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Forms
 * <p>
 * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 14 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Forms",
		description = "Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.",
		url = "https://v4-alpha.getbootstrap.com/components/forms/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSForm<J extends BSForm<J>>
		extends Div<BSFormChildren, BSFormAttributes, GlobalFeatures, BSFormEvents, J>
{


	/**
	 * Forms
	 * <p>
	 * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
	 */
	public BSForm()
	{
		setTag("form");

		addAttribute("role", "form");
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
		component.addStyle("cursor:pointer");
		return component;
	}

}
