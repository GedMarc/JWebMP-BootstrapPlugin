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

import com.jwebmp.plugins.bootstrap.buttons.BSButton;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonChildren;

import java.io.Serializable;

/**
 * @param <J>
 * @param <I>
 *
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSButtonGroupLabel<J extends BSButtonGroupLabel<J, I>, I extends BSButtonChildren & IBSButtonGroupInput & Serializable>
		extends BSButton<J>
		implements BSButtonGroupChildren<BSButtonChildren, J>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The group button input for the label
	 */
	private transient I input;

	/**
	 * Construct a new button group label item for an input component
	 *
	 * @param input
	 */
	public BSButtonGroupLabel(I input)
	{
		setTag("label");
		add(input);
		setRenderTextBeforeChildren(false);
		this.input = input;
	}

	/**
	 * Construct a new button group label item for an input component
	 *
	 * @param text
	 * @param input
	 */
	public BSButtonGroupLabel(String text, I input)
	{
		super(text);
		setTag("label");
		add(input);
		setRenderTextBeforeChildren(false);
		this.input = input;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	/**
	 * Returns the associated input component if any exists
	 *
	 * @return
	 */
	public I getInput()
	{
		return input;
	}

	/**
	 * Sets the associated input component if any exists
	 *
	 * @param input
	 */
	public void setInput(I input)
	{
		this.input = input;
	}
}
