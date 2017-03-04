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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets;

import java.util.List;
import za.co.mmagon.jwebswing.base.html.Span;

/**
 *
 * @author GedMarc
 * @since 20 Feb 2017
 * 
 */
public interface IBSFormInputGroup 
{

    /**
     *
     * @return
     */
    List<Span> getInputGroupAddons();

    /**
     * Sets the input group addons to the right
     *
     * @return
     */
    List<Span> getInputGroupAddonsRight();

    /**
     * The input group addons
     *
     * @param inputGroupAddons
     *
     * @return
     */
    BSFormInputGroup setInputGroupAddons(List<Span> inputGroupAddons);

    /**
     * Sets the input group addons to the right
     *
     * @param inputGroupAddonsRight
     *
     * @return
     */
    BSFormInputGroup setInputGroupAddonsRight(List<Span> inputGroupAddonsRight);

}
