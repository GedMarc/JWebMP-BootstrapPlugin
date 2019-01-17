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
package com.jwebmp.plugins.bootstrap.alerts.events;

import com.jwebmp.core.FileTemplates;
import com.jwebmp.core.base.angular.directives.AngularDirectiveBase;
import com.jwebmp.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * Maps to the angular function of right click
 *
 * @author GedMarc
 * @since 25 Jun 2016
 */
public class BSAlertClosedEventDirective
		extends AngularDirectiveBase<BSAlertClosedEventDirective>
{
	/**
	 * Constructs a new right click directive based on the angular object passed in
	 */
	public BSAlertClosedEventDirective()
	{
		super("ngBSAlertClosedEventDirective");
	}

	/**
	 * Renders the right click directive from the JavaScript file
	 *
	 * @return
	 */
	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(BSAlertClosedEventDirective.class, "BSAlertClosedEvent.min.js", "BSAlertClosedEvent.min.js")
		                    .toString();
	}

	@Override
	public boolean enabled()
	{
		return BootstrapPageConfigurator.isEnabled();
	}
}
