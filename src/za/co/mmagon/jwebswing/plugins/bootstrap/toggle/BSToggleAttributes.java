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
package za.co.mmagon.jwebswing.plugins.bootstrap.toggle;

import za.co.mmagon.jwebswing.base.html.interfaces.AttributeDefinitions;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;

/**
 * @author GedMarc
 */
public enum BSToggleAttributes implements AttributeDefinitions
{
	Data_Toggle,
	Data_Target,
	Visibility;

	private boolean isKeyword;

	BSToggleAttributes()
	{
	}

	@Override
	public String toString()
	{
		return name().toLowerCase().replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

	@Override
	public boolean isKeyword()
	{
		return isKeyword;
	}
}
