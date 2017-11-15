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
package za.co.mmagon.jwebswing.plugins.bootstrap.toggle;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.attributes.ButtonAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.LinkAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.BSComponentDropDownOptions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * An implementation of the Bootstrap Toggle Feature
 * <p>
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@SuppressWarnings("unused")
public class BSDropDownToggle<J extends BSDropDownToggle<J>> extends Div<BSToggleChildren, BSToggleAttributes, BSToggleFeatures, BSToggleEvents, J>
{
	
	private static final long serialVersionUID = 1L;
	private static final String ToggleString = "dropdown";

	/**
	 * The title component for this drop down
	 */
	private Component title;
	/**
	 * A list of the contents for this drop down
	 */
	private List contents;
	
	/**
	 * Construct a new toggle item with the given items
	 *
	 * @param titleItem Displays by default, clickable to show the contents
	 * @param contents
	 */
	@SuppressWarnings("unused")
	public BSDropDownToggle(Link titleItem, List contents)
	{
		setTag(titleItem.getTag());
		setTitle(titleItem);
		setContents(contents);
		BootstrapPageConfigurator.setRequired(this, true);
	}
	
	/**
	 * Construct a new toggle item with the given items
	 *
	 * @param titleItem Displays by default, clickable to show the contents
	 * @param contents
	 */
	@SuppressWarnings("unused")
	public BSDropDownToggle(Button titleItem, List contents)
	{
		setTag(titleItem.getTag());
		setTitle(titleItem);
		setContents(contents);
		BootstrapPageConfigurator.setRequired(this, true);
	}
	
	/**
	 * Returns the title component
	 *
	 * @return
	 */
	public ComponentHierarchyBase getTitle()
	{
		return title;
	}
	
	/**
	 * Sets the title
	 *
	 * @param title
	 */
	public final void setTitle(Button title)
	{
		getChildren().remove(this.title);

		this.title = title;
		if (title != null)
		{
			java.util.List tempList = new ArrayList<>(getChildren());
			tempList.add(0, this.title);
			setChildren(new LinkedHashSet<>(tempList));
			this.title.addClass(BSComponentDropDownOptions.Dropdown_Toggle);
			title.addAttribute(ButtonAttributes.Data_Toggle, ToggleString);
			if (contents != null)
			{
				title.addAttribute(ButtonAttributes.Data_Target, contents.getID(true));
			}
		}
	}
	
	/**
	 * Sets the title
	 *
	 * @param title
	 */
	public final void setTitle(Link title)
	{
		getChildren().remove(this.title);
		this.title = title;
		if (title != null)
		{
			java.util.List tempList = new ArrayList<>(getChildren());
			tempList.add(0, this.title);
			setChildren(new LinkedHashSet<>(tempList));
			this.title.addClass(BSComponentDropDownOptions.Dropdown_Toggle);
			title.addAttribute(LinkAttributes.Data_Toggle, ToggleString);
			if (contents != null)
			{
				title.addAttribute(LinkAttributes.Data_Target, contents.getID(true));
			}
		}
	}
	
	/**
	 * Returns the contents
	 *
	 * @return
	 */
	public List getContents()
	{
		return contents;
	}
	
	/**
	 * Sets the contents
	 *
	 * @param contents
	 */
	public final void setContents(List contents)
	{
		this.contents = contents;
		
		if (contents != null)
		{
			contents.addClass(BSComponentDropDownOptions.Dropdown_Menu);
			contents.addClass("");
			title.addAttribute(ButtonAttributes.Data_Toggle, ToggleString);
			title.addAttribute(ButtonAttributes.Data_Target, contents.getID(true));
		}
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSDropDownToggle))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSDropDownToggle<?> that = (BSDropDownToggle<?>) o;
		return Objects.equals(getComponent(), that.getComponent());
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getContents());
	}
}
