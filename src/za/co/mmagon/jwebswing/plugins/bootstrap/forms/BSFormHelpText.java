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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms;

import za.co.mmagon.jwebswing.base.html.SmallText;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentDefaultOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSComponentFormGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroupChildren;

/**
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 20 Feb 2017
 *
 */
public class BSFormHelpText<J extends BSFormHelpText> extends SmallText<J>
        implements BSFormGroupChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * A new block style help text for a bootstrap form
     *
     * @param text
     */
    public BSFormHelpText(String text)
    {
        super(text);
        addClass(BSComponentDefaultOptions.Text_Muted);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * A blank help text entry for the form
     */
    public BSFormHelpText()
    {
        this(null);
    }

    /**
     * Sets this help text as inline
     *
     * @param inline
     *
     * @return
     */
    public J setInline(boolean inline)
    {
        if (inline)
        {
            addClass(BSComponentFormGroupOptions.Form_Text);
        }
        else
        {
            removeClass(BSComponentFormGroupOptions.Form_Text);
        }
        return (J) this;
    }
}
