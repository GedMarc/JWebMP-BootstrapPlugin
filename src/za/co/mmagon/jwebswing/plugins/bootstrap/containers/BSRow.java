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
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroupChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSDefaultOptions;

/**
 * Rows are horizontal groups of columns that ensure your columns are lined up properly.
 * <p>
 * Content should be placed within columns, and only columns may be immediate children of rows.
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 7, 2016
 */
public class BSRow<J extends BSRow<J>> extends Div<GlobalChildren, NoAttributes, GlobalFeatures, GlobalEvents, BSRow<J>> implements BSFormChildren, BSFormGroupChildren
{

	private static final long serialVersionUID = 1L;

	/**
	 * Rows are horizontal groups of columns that ensure your columns are lined up properly.
	 * <p>
	 * Content should be placed within columns, and only columns may be immediate children of rows.
	 */
	public BSRow()
	{
		addClass(BSDefaultOptions.Row);
		BootstrapPageConfigurator.setRequired(this, true);
	}
}
