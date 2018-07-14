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
package com.jwebmp.plugins.bootstrap.modal;

import com.jwebmp.Component;
import com.jwebmp.Feature;
import com.jwebmp.base.html.interfaces.GlobalFeatures;

import java.util.Objects;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class BSModalFeature
		extends Feature<BSModalOptions, BSModalFeature>
		implements BSModalFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;
	/**
	 * The options for the modal
	 */
	private BSModalOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public BSModalFeature(Component forComponent)
	{
		super("BSModalFeature");
		setComponent(forComponent);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getOptions());
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSModalFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSModalFeature that = (BSModalFeature) o;
		return Objects.equals(getOptions(), that.getOptions());
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public BSModalOptions getOptions()
	{
		if (options == null)
		{
			options = new BSModalOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		//Nothing Needed
	}
}
