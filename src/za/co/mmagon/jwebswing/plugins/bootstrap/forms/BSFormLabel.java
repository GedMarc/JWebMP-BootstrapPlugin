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

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroupChildren;

/**
 * A label that can be used in a bootstrap form
 *
 * @param <J>
 *
 * @author GedMarc
 * @since 20 Feb 2017
 */
public class BSFormLabel<J extends BSFormLabel<J>>
		extends Label<J>
		implements BSFormGroupChildren
{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructs a new label for a bootstrap form
	 */
	public BSFormLabel()
	{
		this(null);
	}
	
	/**
	 * Constructs a new label for a bootstrap form
	 *
	 * @param label
	 */
	public BSFormLabel(String label)
	{
		this(label, null);
	}
	
	/**
	 * Constructs a new label for a bootstrap form
	 *
	 * @param label
	 * @param forInputComponent
	 */
	public BSFormLabel(String label, Input forInputComponent)
	{
		super(label, forInputComponent);
		addClass(BSComponentFormOptions.Col_Form_Label);
		addClass("control-label");
	}

}
