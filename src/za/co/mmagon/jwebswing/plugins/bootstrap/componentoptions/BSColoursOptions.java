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
package za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions;

import za.co.mmagon.jwebswing.utilities.StaticStrings;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;

/**
 * Colors
 * <p>
 * Convey meaning through color with a handful of emphasis utility classes. These may also be applied to links and will darken on hover just like our default link styles.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSColoursOptions implements IBSComponentOptions
{
	/**
	 * Text styled with class "text_muted"
	 */
	Text_Muted,
	/**
	 * Text styled with class "text_primary"
	 */
	Text_Primary,
	/**
	 * Text styled with class "text_success"
	 */
	Text_Success,
	/**
	 * Text styled with class "text_info"
	 */
	Text_Info,
	/**
	 * Text styled with class "text_warning"
	 */
	Text_Warning,
	/**
	 * Text styled with class "text_danger"
	 */
	Text_Danger,
	/**
	 * Text marked as white
	 */
	Text_White,
	/**
	 * Hides colours on screen readers Using color to add meaning only provides a visual indication, which will not be conveyed to users of assistive technologies – such as screen readers. Ensure that
	 * information denoted by the color is either obvious from the content itself (e.g. the visible text), or is included through alternative means, such as additional text hidden with the .sr-only
	 * class.
	 */
	Sr_Only,
	/**
	 * Combine with sr_only to show the element again when it is focused (eg by a keyboard_only user)
	 */
	Sr_Only_Focusable,;

	@Override
	public String toString()
	{
		return name().toLowerCase().replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
