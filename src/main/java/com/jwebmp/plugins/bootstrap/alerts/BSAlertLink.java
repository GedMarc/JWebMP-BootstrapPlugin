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
package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.html.Link;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Highlights text in an alert appropriately
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public class BSAlertLink
		extends Link
{


	public BSAlertLink()
	{
		super(STRING_HASH);
		addClass(BSComponentAlertOptions.Alert_Link);
	}
}
