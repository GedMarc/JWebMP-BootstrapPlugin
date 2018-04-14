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
package com.jwebmp.plugins.bootstrap.media;

import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;
import com.jwebmp.utilities.StaticStrings;

import static com.jwebmp.utilities.StaticStrings.CHAR_DASH;

/**
 * The media object is an abstract element used as the basis for building more complex and repetitive components (like blog comments, Tweets, etc).
 * <p>
 * Included is support for left and right aligned content, content alignment options, nesting, and more.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSComponentMediaOptions
		implements IBSComponentOptions
{
	/**
	 * Denotes this as a bootstrap media object
	 */
	Media,
	/**
	 * Aligns in the media object to the left
	 */
	Media_Left,
	/**
	 * Aligns in the media object to the right
	 */
	Media_Right,
	/**
	 * Aligns in the media object to the heading
	 */
	Media_Heading,
	/**
	 * Aligns to the media object in the body
	 */
	Media_Body,
	/**
	 * Marks the object displayed as the media object
	 */
	Media_Object;

	BSComponentMediaOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
