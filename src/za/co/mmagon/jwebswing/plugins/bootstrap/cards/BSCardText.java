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
package za.co.mmagon.jwebswing.plugins.bootstrap.cards;

import za.co.mmagon.jwebswing.base.html.Paragraph;

/**
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 15 Feb 2017
 *
 */
public class BSCardText<J extends BSCardText> extends Paragraph<J>
        implements BSCardChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * Standard paragraph format for card text
     */
    public BSCardText()
    {
        addClass(BSComponentCardOptions.Card_Text);
    }

    /**
     * Standard paragraph format for card text
     *
     * @param text
     */
    public BSCardText(String text)
    {
        super(text);
        addClass(BSComponentCardOptions.Card_Text);
    }

}
