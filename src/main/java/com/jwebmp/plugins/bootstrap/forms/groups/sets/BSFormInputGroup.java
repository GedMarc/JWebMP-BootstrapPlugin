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
package com.jwebmp.plugins.bootstrap.forms.groups.sets;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap.dropdown.menu.BSDropDownMenuChildren;
import com.jwebmp.plugins.bootstrap.forms.controls.BSFormSelectInput;
import com.jwebmp.plugins.bootstrap.forms.controls.BSFormTextAreaInput;
import com.jwebmp.plugins.bootstrap.forms.controls.BSFormTextInput;
import com.jwebmp.plugins.bootstrap.forms.controls.BSInput;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroupChildren;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/**
 * Input group
 * <p>
 * Easily extend form controls by adding text, buttons, or button groups on either side of textual inputs.
 *
 * @author GedMarc
 * @since 18 Jan 2017
 */
public class BSFormInputGroup<J extends BSFormInputGroup<J>>
		extends DivSimple<J>
		implements BSFormGroupChildren<IComponentHierarchyBase, J>, BSFormSetChildren<IComponentHierarchyBase, J>, BSDropDownMenuChildren<IComponentHierarchyBase, J>, IBSFormInputGroup
{

	private static final long serialVersionUID = 1L;
	/**
	 * The input group addons
	 */
	private List<Span> inputGroupAddons;
	/**
	 * The input group addons
	 */
	private List<Span> inputGroupAddonsRight;

	private Input input;

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual input's.
	 *
	 * @param input
	 * @param size
	 */
	public BSFormInputGroup(Input input, BSComponentInputGroupOptions... size)
	{
		this.input = input;
		addClass(BSComponentInputGroupOptions.Input_Group);
		if (size != null && size.length > 0)
		{
			for (BSComponentInputGroupOptions bSComponentInputGroupOptions : size)
			{
				addClass(bSComponentInputGroupOptions);
			}
		}
	}

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual input's.
	 *
	 * @param input
	 * @param size
	 */
	public BSFormInputGroup(BSInput input, BSComponentInputGroupOptions... size)
	{
		this.input = input;
		addClass(BSComponentInputGroupOptions.Input_Group);
		if (size != null && size.length > 0)
		{
			for (BSComponentInputGroupOptions bSComponentInputGroupOptions : size)
			{
				addClass(bSComponentInputGroupOptions);
			}
		}
	}

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual input's.
	 *
	 * @param input
	 * @param size
	 */
	public BSFormInputGroup(BSFormSelectInput input, BSComponentInputGroupOptions... size)
	{
		this.input = input;
		addClass(BSComponentInputGroupOptions.Input_Group);
		if (size != null && size.length > 0)
		{
			for (BSComponentInputGroupOptions bSComponentInputGroupOptions : size)
			{
				addClass(bSComponentInputGroupOptions);
			}
		}
	}

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual input's.
	 *
	 * @param input
	 * @param size
	 */
	public BSFormInputGroup(BSFormTextAreaInput input, BSComponentInputGroupOptions... size)
	{
		this.input = input;
		addClass(BSComponentInputGroupOptions.Input_Group);
		if (size != null && size.length > 0)
		{
			for (BSComponentInputGroupOptions bSComponentInputGroupOptions : size)
			{
				addClass(bSComponentInputGroupOptions);
			}
		}
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			getInputGroupAddons().forEach(inputGroupAddon ->
			                              {
				                              inputGroupAddon.addClass(BSComponentInputGroupOptions.Input_Group_Addon);
				                              List tempList = new ArrayList<>(getChildren());
				                              tempList.add(0, inputGroupAddon);
				                              setChildren(new LinkedHashSet(tempList));
			                              });
			if (getInput() == null)
			{
				setInput(new BSFormTextInput());
			}
			add(getInput());
			getInputGroupAddonsRight().forEach(inputGroupAddon ->
			                                   {
				                                   inputGroupAddon.addClass(BSComponentInputGroupOptions.Input_Group_Addon);
				                                   add(inputGroupAddon);
			                                   });
		}
		super.init();
	}

	/**
	 * @return
	 */
	@Override
	public List<Span> getInputGroupAddons()
	{
		if (inputGroupAddons == null)
		{
			setInputGroupAddons(new ArrayList<>());
		}
		return inputGroupAddons;
	}

	/**
	 * The input group addons
	 *
	 * @param inputGroupAddons
	 *
	 * @return
	 */
	@Override
	public BSFormInputGroup setInputGroupAddons(List<Span> inputGroupAddons)
	{
		this.inputGroupAddons = inputGroupAddons;
		return this;
	}

	/**
	 * Sets the input group addons to the right
	 *
	 * @return
	 */
	@Override
	public List<Span> getInputGroupAddonsRight()
	{
		if (inputGroupAddonsRight == null)
		{
			setInputGroupAddonsRight(new ArrayList());
		}
		return inputGroupAddonsRight;
	}

	/**
	 * Sets the input group addons to the right
	 *
	 * @param inputGroupAddonsRight
	 *
	 * @return
	 */
	@Override
	public BSFormInputGroup setInputGroupAddonsRight(List<Span> inputGroupAddonsRight)
	{
		this.inputGroupAddonsRight = inputGroupAddonsRight;
		return this;
	}

	/**
	 * Gets the input component
	 *
	 * @return
	 */

	public Input getInput()
	{
		return input;
	}

	/**
	 * Sets the input component
	 *
	 * @param input
	 */
	public J setInput(Input input)
	{
		this.input = input;
		if (this.input != null)
		{
			this.input.addClass("form-control");
		}
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSFormInputGroup))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSFormInputGroup<?> that = (BSFormInputGroup<?>) o;
		return Objects.equals(getInputGroupAddons(), that.getInputGroupAddons()) && Objects.equals(getInputGroupAddonsRight(), that.getInputGroupAddonsRight()) && Objects.equals(
				getInput(), that.getInput());
	}
}
