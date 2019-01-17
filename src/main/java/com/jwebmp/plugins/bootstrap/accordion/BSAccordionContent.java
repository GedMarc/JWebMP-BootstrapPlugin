/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.htmlbuilder.css.tables.TableBorderCollapse;
import com.jwebmp.plugins.bootstrap.panel.BSPanel;
import com.jwebmp.plugins.bootstrap.panel.BSPanelThemes;

/**
 * @author GedMarc
 * @since 20 Feb 2017
 */
public class BSAccordionContent<J extends BSAccordionContent<J>>
		extends BSPanel<J>
{


	/**
	 * Constructs a new instance of the BS Accordion Content
	 */
	public BSAccordionContent()
	{
		super(BSPanelThemes.Default);
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			removeClass(TableBorderCollapse.Collapse);
		}
		super.init();

	}

}
