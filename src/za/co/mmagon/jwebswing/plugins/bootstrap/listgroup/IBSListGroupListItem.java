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
package za.co.mmagon.jwebswing.plugins.bootstrap.listgroup;

/**
 *
 * @author GedMarc
 * @param <J>
 *
 * @since 21 Feb 2017
 *
 */
public interface IBSListGroupListItem<J extends BSListGroupListItem>
{

    /**
     * Active items Add .active to a .list-group-item to indicate the current active selection.
     *
     * @return
     */
    J setActive();

    /**
     * Contextual classes Use contextual classes to style list items with a stateful background and color.
     *
     * @return
     */
    J setDanger();

    /**
     * Disabled items Add .disabled to a .list-group-item to make it appear disabled. Note that some elements with .disabled will also require custom JavaScript to fully disable their click events
     * (e.g., links).
     *
     * @return
     */
    J setDisabled();

    /**
     * Contextual classes Use contextual classes to style list items with a stateful background and color.
     *
     * @return
     */
    J setInfo();

    /**
     * Contextual classes Use contextual classes to style list items with a stateful background and color.
     *
     * @return
     */
    J setSuccess();

    /**
     * Contextual classes Use contextual classes to style list items with a stateful background and color.
     *
     * @return
     */
    J setWarning();

}
