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
package za.co.mmagon.jwebswing.plugins.bootstrap.cards.parts;

import za.co.mmagon.jwebswing.base.html.HeaderText;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCardChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSComponentCardOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSColoursOptions;

/**
 * Subtitles are used by adding a .card-subtitle to an h* tag.
 * <p>
 * If the .card-title and the .card-subtitle items are placed in a .card-block item, the card title and subtitle are aligned nicely.
 * <p>
 * The multiple content types can be easily combined to create the card you need. See below for an example.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardSubtitle extends HeaderText implements BSCardChildren
{

	private static final long serialVersionUID = 1L;

	/**
	 * Subtitles are used by adding a .card-subtitle to an h* tag.
	 * <p>
	 * If the .card-title and the .card-subtitle items are placed in a .card-block item, the card title and subtitle are aligned nicely.
	 * <p>
	 * The multiple content types can be easily combined to create the card you need. See below for an example.
	 */
	public BSCardSubtitle()
	{
		this(HeaderTypes.H6, "");
	}

	/**
	 * Subtitles are used by adding a .card-subtitle to an h* tag.
	 * <p>
	 * If the .card-title and the .card-subtitle items are placed in a .card-block item, the card title and subtitle are aligned nicely.
	 * <p>
	 * The multiple content types can be easily combined to create the card you need. See below for an example.
	 *
	 * @param headerType
	 * @param text
	 */
	public BSCardSubtitle(HeaderTypes headerType, String text)
	{
		super(headerType, text);
		addClass(BSComponentCardOptions.Card_Subtitle);
		addClass("mb-2");
		addClass(BSColoursOptions.Text_Muted);
	}

}