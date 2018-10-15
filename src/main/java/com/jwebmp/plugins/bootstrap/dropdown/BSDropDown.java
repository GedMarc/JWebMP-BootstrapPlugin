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
package com.jwebmp.plugins.bootstrap.dropdown;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonAttributes;
import com.jwebmp.plugins.bootstrap.buttons.groups.BSButtonGroupAttributes;
import com.jwebmp.plugins.bootstrap.dropdown.menu.BSDropDownMenu;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;

import java.util.Objects;

/**
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included Bootstrap dropdown JavaScript plugin. They’re
 * toggled by clicking,
 * not by hovering; this is an intentional design decision.
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 13 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Dropdown",
		description = "Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included Bootstrap dropdown JavaScript plugin. They’re toggled by clicking, not by hovering; this is an intentional design decision.",
		url = "https://v4-alpha.getbootstrap.com/components/dropdowns/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSDropDown<J extends BSDropDown<J>>
		extends Div<BSDropDownChildren, BSDropDownAttributes, GlobalFeatures, BSDropDownEvents, J>
		implements IBSDropDown<J>
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
	 * Construct a new drop down
	 *
	 * @param link
	 */
	@SuppressWarnings("")
	public BSDropDown(BSDropDownLink link)
	{
		this();
		setDropdownButton(link);

	}

	/**
	 * Construct a new bootstrap drop down
	 */
	@SuppressWarnings("")
	public BSDropDown()
	{
		addClass(BSComponentDropDownOptions.Dropdown);

	}

	/**
	 * Constructs a new bootstrap drop down with the given button
	 *
	 * @param button
	 */
	@SuppressWarnings("")
	public BSDropDown(BSDropDownButton button)
	{
		this();
		setDropdownButton(button);

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
	 *
	 * @return
	 */
	public J setNoCaret(boolean noCaret)
	{
		if (noCaret)
		{
			getDropdownButton().addClass("no-caret");
		}
		else
		{
			getDropdownButton().removeClass("no-caret");
		}

		return (J) this;
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
	 * @param dropdownButton
	 *
	 * @return
	 */
	@Override
	public final J setDropdownButton(Component dropdownButton)
	{
		this.dropdownButton = dropdownButton;
		if (dropdownButton != null)
		{
			dropdownButton.addClass(BSComponentDropDownOptions.Dropdown_Toggle);
		}
		return (J) this;
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
		dropdownMenu = menu;
		if (menu != null)
		{
			menu.addAttribute(BSButtonAttributes.Role.toString(), "menu");
		}
		return this;
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

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSDropDown))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSDropDown<?> that = (BSDropDown<?>) o;
		return Objects.equals(getDropdownButton(), that.getDropdownButton()) && Objects.equals(getDropdownMenu(), that.getDropdownMenu());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getDropdownButton(), getDropdownMenu());
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getDropdownButton().addAttribute(BSButtonGroupAttributes.Role.toString(), "button");
			add((BSDropDownChildren) getDropdownButton());
			add(getDropdownMenu());

			getDropdownMenu().addAttribute(GlobalAttributes.Aria_LabelledBy.toString(), getDropdownButton().getID());
			getDropdownButton().addAttribute(ButtonAttributes.Data_Target.toString(), getDropdownMenu().getID());

			if (Link.class.isAssignableFrom(getDropdownButton().getClass()))
			{
				addClass(BSDefaultOptions.Show);
			}
		}
		super.preConfigure();
	}
}
