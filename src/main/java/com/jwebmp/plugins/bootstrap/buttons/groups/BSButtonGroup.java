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
package com.jwebmp.plugins.bootstrap.buttons.groups;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.buttons.toolbars.BSButtonToolbarChildren;

/**
 * Button group
 * <p>
 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style behavior with our buttons plugin.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 01 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Button Groups",
		description = "Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style behavior with our buttons plugin.",
		url = "https://v4-alpha.getbootstrap.com/components/button-group/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSButtonGroup<J extends BSButtonGroup<J>>
		extends Div<BSButtonGroupChildren, BSButtonGroupAttributes, GlobalFeatures, BSButtonGroupEvents, J>
		implements BSButtonToolbarChildren<BSButtonGroupChildren, J>, IBSButtonGroup
{

	private static final long serialVersionUID = 1L;

	/**
	 * Button group
	 * <p>
	 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style behavior with our buttons plugin.
	 *
	 * @param size
	 */
	@SuppressWarnings("")
	public BSButtonGroup(BSComponentButtonGroupSizeOptions size)
	{
		this();
		setSize(size);
	}

	/**
	 * Button group
	 * <p>
	 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style behavior with our buttons plugin.
	 */
	public BSButtonGroup()
	{
		addAttribute(BSButtonGroupAttributes.Role, "group");
		setAriaLabel("Button Group");
		addClass(BSComponentButtonGroupOptions.Btn_Group);
		addAttribute(BSButtonGroupAttributes.Data_Toggle, "buttons");
	}

	/**
	 * Sets the screen reader label for this group
	 *
	 * @param label
	 *
	 * @return
	 */
	@Override
	public final BSButtonGroup setAriaLabel(String label)
	{
		addAttribute(GlobalAttributes.Aria_Label, label);
		return this;
	}

	/**
	 * Sizes
	 * <p>
	 * Fancy larger or smaller buttons? Add .btn-lg or .btn-sm for additional sizes.
	 *
	 * @param size
	 *
	 * @return
	 */
	@Override
	public BSButtonGroup setSize(BSComponentButtonGroupSizeOptions size)
	{
		for (BSComponentButtonGroupSizeOptions value : BSComponentButtonGroupSizeOptions.values())
		{
			removeClass(value.toString());
		}
		addClass(size);
		return this;
	}

	/**
	 * Neater view
	 *
	 * @return
	 */
	public IBSButtonGroup asMe()
	{
		return this;
	}
}
