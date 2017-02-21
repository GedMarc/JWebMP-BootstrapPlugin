/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package za.co.mmagon.jwebswing.plugins.bootstrap.dropdown;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.menu.BSDropDownMenu;

/**
 *
 * @author GedMarc
 * @since 20 Feb 2017
 * 
 */
public interface IBSDropDown<J extends BSDropDown> 
{

    /**
     * Returns the drop down button
     *
     * @return
     */
    Component getDropdownButton();

    /**
     * Returns the current dropdownMenu or a new one
     *
     * @return
     */
    BSDropDownMenu getDropdownMenu();

    /**
     * Sets the drop down dropdownMenu button
     *
     * @param <T> bs drop down children type
     * @param dropdownButton
     *
     * @return
     */
    J setDropdownButton(Component dropdownButton);

    /**
     * Sets the dropdownMenu
     *
     * @param menu
     *
     * @return
     */
    BSDropDown setMenu(BSDropDownMenu menu);

}
