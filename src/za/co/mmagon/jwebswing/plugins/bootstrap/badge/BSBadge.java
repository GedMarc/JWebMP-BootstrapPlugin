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
package za.co.mmagon.jwebswing.plugins.bootstrap.badge;

import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 * With badges
 * <p>
 * Add badges to any list group item to show unread counts, activity, and more with the help of some utilities. Note the justify-content-between utility class and the badge’s placement.
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 17 Jan 2017
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Badge", description = "Add badges to any list group item to show unread counts, activity, and more with the help of some utilities. Note the justify-content-between utility class and the badge’s placement.",
        url = "https://v4-alpha.getbootstrap.com/components/badge/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")

public class BSBadge<J extends BSBadge> extends Span<GlobalChildren, BSBadgeAttributes, J> implements IBSBadge<J>
{

    private static final long serialVersionUID = 1L;

    /**
     * With badges
     * <p>
     * Add badges to any list group item to show unread counts, activity, and more with the help of some utilities. Note the justify-content-between utility class and the badge’s placement.
     *
     * @param asPill
     * @param badgeOptions start with "badge"
     */
    public BSBadge(boolean asPill, BSComponentBadgeOptions... badgeOptions)
    {
        addClass(BSComponentBadgeOptions.Badge);
        if (asPill)
        {
            addClass(BSComponentBadgeOptions.Badge_Pill);
        }
        for (BSComponentBadgeOptions badgeOption : badgeOptions)
        {
            addClass(badgeOption);
        }
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * With badges
     * <p>
     * Add badges to any list group item to show unread counts, activity, and more with the help of some utilities. Note the justify-content-between utility class and the badge’s placement.
     *
     * @param text
     * @param asPill
     * @param badgeOptions start with "badge"
     */
    public BSBadge(String text, boolean asPill, BSComponentBadgeOptions... badgeOptions)
    {
        super(text);
        addClass(BSComponentBadgeOptions.Badge);
        if (asPill)
        {
            addClass(BSComponentBadgeOptions.Badge_Pill);
        }
        for (BSComponentBadgeOptions badgeOption : badgeOptions)
        {
            addClass(badgeOption);
        }
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Neater output
     *
     * @return
     */
    public IBSBadge asMe()
    {
        return this;
    }

    /**
     * Primary colour theme
     *
     * @param applyStyle
     *
     * @return
     */
    @Override
    public J setPrimary(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSComponentBadgeOptions.Badge_Primary);
        }
        else

        {
            removeClass(BSComponentBadgeOptions.Badge_Primary);
        }

        return (J) this;
    }

    /**
     * Default colour theme
     *
     * @param applyStyle
     *
     * @return
     */
    @Override
    public J setDefault(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSComponentBadgeOptions.Badge_Default);
        }
        else

        {
            removeClass(BSComponentBadgeOptions.Badge_Default);
        }

        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     *
     * @return
     */
    @Override
    public J setDanger(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSComponentBadgeOptions.Badge_Danger);
        }
        else

        {
            removeClass(BSComponentBadgeOptions.Badge_Danger);
        }

        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     *
     * @return
     */
    @Override
    public J setInfo(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSComponentBadgeOptions.Badge_Info);
        }
        else
        {
            removeClass(BSComponentBadgeOptions.Badge_Info);
        }

        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     *
     * @return
     */
    @Override
    public J setSuccess(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSComponentBadgeOptions.Badge_Success);
        }
        else
        {
            removeClass(BSComponentBadgeOptions.Badge_Success);
        }
        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     *
     * @return
     */
    @Override
    public J setWarning(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSComponentBadgeOptions.Badge_Warning);
        }
        else
        {
            removeClass(BSComponentBadgeOptions.Badge_Warning);
        }
        return (J) this;
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
