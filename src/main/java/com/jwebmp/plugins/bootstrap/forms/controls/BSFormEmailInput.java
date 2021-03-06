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
package com.jwebmp.plugins.bootstrap.forms.controls;

import com.jwebmp.core.base.angular.AngularAttributes;
import com.jwebmp.core.base.html.attributes.InputTypes;
import com.jwebmp.core.utilities.regex.RegularExpressionsDTO;

/**
 * A default email input for bootstrap
 *
 * @author GedMarc
 * @since 15 Jan 2017
 */
public class BSFormEmailInput<J extends BSFormEmailInput<J>>
		extends BSInput<J>
{


	/**
	 * A default email input for bootstrap
	 */
	public BSFormEmailInput()
	{
		setInputType(InputTypes.Email);
		addAttribute(AngularAttributes.ngPattern.getAttributeName(), "regex.emailField");
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			getPage().getBody()
			         .addDto("regex", new RegularExpressionsDTO());
		}
		super.init();
	}

}
