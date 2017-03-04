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
package za.co.mmagon.jwebswing.plugins.bootstrap.jumbotron;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * Jumbotron
 * <p>
 * A lightweight, flexible component that can optionally extend the entire viewport to showcase key marketing messages on your site.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 18 Jan 2017
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Jumbotron", description = "A lightweight, flexible component that can optionally extend the entire viewport to showcase key marketing messages on your site.",
        url = "https://v4-alpha.getbootstrap.com/components/jumbotron/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSJumbotron<J extends BSJumbotron>
        extends Div<GlobalChildren, BSJumbotronAttributes, GlobalFeatures, GlobalEvents, J>
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new instance
     * <p>
     */
    public BSJumbotron()
    {
        this((String) null);
    }

    /**
     * Constructs a new instance
     *
     * @param text
     */
    public BSJumbotron(String text)
    {
        super(text);
        addClass(BSComponentJumbotronOptions.Jumbotron);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Constructs a new instance
     *
     * @param jumbotronType
     */
    public BSJumbotron(BSComponentJumbotronOptions... jumbotronType)
    {
        this((String) null);
        for (BSComponentJumbotronOptions bSComponentJumbotronOptions : jumbotronType)
        {
            addClass(bSComponentJumbotronOptions);
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 79 * hash + (this.getID().hashCode());
        return hash;
    }

}
