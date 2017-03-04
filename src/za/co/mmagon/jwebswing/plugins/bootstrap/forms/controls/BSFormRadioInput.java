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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls;

import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.InputTypes;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSComponentFormGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets.BSFormCheckInput;

/**
 *
 * @author GedMarc
 * @since 18 Jan 2017
 *
 */
public class BSFormRadioInput extends BSFormCheckInput
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new Radio Input
     *
     * @param groupName
     */
    public BSFormRadioInput(String groupName)
    {
        super(InputTypes.Radio);
        addClass(BSComponentFormGroupOptions.Form_Check_Input);
        addAttribute(GlobalAttributes.Name, groupName);
        removeClass("form-control");
    }

    /**
     * Sets this radio item as checked
     *
     * @return
     */
    public BSFormRadioInput setChecked()
    {
        addAttribute("checked", null);
        return this;
    }

    /**
     * Sets this radio item disabled
     *
     * @return
     */
    public BSFormRadioInput setDisabled()
    {
        addAttribute("disabled", null);
        return this;
    }
}
