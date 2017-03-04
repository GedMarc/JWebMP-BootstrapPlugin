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

import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.IBSComponentOptions;

/**
 *
 * @author GedMarc
 * @since 18 Jan 2017
 *
 */
public enum BSComponentBadgeOptions implements IBSComponentOptions
{
    /**
     * Base badge class
     */
    Badge,
    /**
     * Default styling
     */
    Badge_Default,
    /**
     * Primary colour styling
     */
    Badge_Primary,
    /**
     * Secondary styling
     */
    Badge_Secondary,
    /**
     * Info styling
     */
    Badge_Info,
    /**
     * Warning styling
     */
    Badge_Warning,
    /**
     * Success styling
     */
    Badge_Success,
    /**
     * Danger styling
     */
    Badge_Danger,
    /**
     * Pill styling (placed before colouring)
     */
    Badge_Pill;

    private BSComponentBadgeOptions()
    {
        //Nothing Needed
    }

    @Override
    public String toString()
    {
        return name().toLowerCase().replace('_', '-');
    }

}
