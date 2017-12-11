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
package za.co.mmagon.jwebswing.plugins.bootstrap.containers;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSWidthOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.IBSComponentOptions;

/**
 * Shortcut for writing column Div's and spans for bootstrap
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 10, 2016
 */
public class BSColumn extends Div
{

	private static final long serialVersionUID = 1L;

	/**
	 * Supply a list of column options for this div
	 *
	 * @param columnOptions
	 */
	public BSColumn(IBSComponentOptions... columnOptions)
	{
		if (columnOptions != null)
		{
			for (IBSComponentOptions columnOption : columnOptions)
			{
				addClass(columnOption.toString());
			}
		}
		BootstrapPageConfigurator.setRequired(this, true);
	}

	/**
	 * Constructs a new instance with the given column options
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	public static BSColumn newInstance(IBSComponentOptions... columnOptions)
	{
		if (columnOptions == null || columnOptions.length < 1)
		{
			columnOptions = new IBSComponentOptions[]{BSWidthOptions.col_md_6};
		}
		return new BSColumn(columnOptions);
	}

	@Override
	public boolean equals(Object obj)
	{
		return false;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
