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

/**
 *
 * @author GedMarc
 * @since 16 Feb 2017
 * 
 */
public interface IBSButtonGroup 
{

    /**
     * Sets the screen reader label for this group
     *
     * @param label
     *
     * @return
     */
    BSButtonGroup setAriaLabel(String label);

    /**
     * Sizes
     * <p>
     * Fancy larger or smaller buttons? Add .btn-lg or .btn-sm for additional sizes.
     *
     * @param size
     *
     * @return
     */
    BSButtonGroup setSize(BSComponentButtonGroupSizeOptions size);

}
