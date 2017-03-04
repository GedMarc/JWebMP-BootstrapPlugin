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
package za.co.mmagon.jwebswing.plugins.bootstrap.alerts;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;

/**
 *
 * @author GedMarc
 * @param <J>
 * @since 16 Feb 2017
 *
 */
public interface IBSAlert<J extends BSAlert>
{

    /**
     * Adds the link styling for an alert to any component
     *
     * @param <T>
     * @param component
     * @return
     */
    <T extends ComponentHierarchyBase> T addLinkStyle(T component);

    /**
     * Creates and adds dismiss button assigned to this alert
     *
     * @return
     */
    BSAlertDismissButton createDismissButton();

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setDanger(boolean applyStyle);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setInfo(boolean applyStyle);

    /**
     * Sets the style as link
     *
     * @param applyStyle
     * @return
     */
    J setLink(boolean applyStyle);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setSuccess(boolean applyStyle);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setWarning(boolean applyStyle);

}
