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

package za.co.mmagon.jwebswing.plugins.bootstrap.navbar.toggler;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.bootstrap.navbar.BSNavBarChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.navs.BSNavs;

/**
 *
 * @author GedMarc
 * @since 21 Feb 2017
 *
 */
public interface IBSNavBarToggler
{

    /**
     * Nav
     * <p>
     * Navbar navigation links build on our .nav options with their own modifier class and require the use of toggler classes for proper responsive styling.
     * <p>
     * Navigation in navbars will also grow to occupy as much horizontal space as possible to keep your navbar contents securely aligned.
     * <p>
     * Active states—with .active—to indicate the current page can be applied directly to .nav-links or their immediate parent .nav-items.
     *
     * @param <T>
     * @param navs
     *
     * @return
     */
    <T extends Div & BSNavBarChildren> T createCollapsingDiv(BSNavs navs);

    String getIconClass();

    void preConfigure();

    void setIconClass(String iconClass);

}
