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
package za.co.mmagon.jwebswing.plugins.bootstrap.buttons.groups;

import za.co.mmagon.jwebswing.plugins.bootstrap.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap.buttons.BSButtonChildren;

/**
 *
 * @author GedMarc
 * @param <J>
 * @param <I>
 * @since 16 Feb 2017
 *
 */
public class BSButtonGroupLabel<J extends BSButtonGroupLabel, I extends BSButtonChildren & IBSButtonGroupInput> extends BSButton<J>
        implements BSButtonGroupChildren
{

    private static final long serialVersionUID = 1L;

    private I input;

    /**
     * Construct a new button group label item for an input component
     *
     * @param input
     */
    public BSButtonGroupLabel(I input)
    {
        setTag("label");
        add(input);
        setRenderTextBeforeChildren(false);
        this.input = input;
    }

    /**
     * Construct a new button group label item for an input component
     *
     * @param text
     * @param input
     */
    public BSButtonGroupLabel(String text, I input)
    {
        super(text);
        setTag("label");
        add(input);
        setRenderTextBeforeChildren(false);
        this.input = input;
    }

    /**
     * Returns the associated input component if any exists
     *
     * @return
     */
    public I getInput()
    {
        return input;
    }

    /**
     * Sets the associated input component if any exists
     *
     * @param input
     */
    public void setInput(I input)
    {
        this.input = input;
    }

}
