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
