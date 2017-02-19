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
package za.co.mmagon.jwebswing.plugins.bootstrap.buttons;

/**
 *
 * @author GedMarc
 * @param <J>
 * @since 16 Feb 2017
 *
 */
public interface IBSButton<J extends BSButton>
{

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
    J setDangerOutline(boolean applyStyle);

    /**
     * Disabled state
     * <p>
     * Make buttons look inactive by adding the disabled boolean attribute to any button element.
     * <p>
     * Heads up! IE9 and below render disabled buttons with gray, shadowed text that we can’t override.
     * <p>
     * Disabled buttons using the a element behave a bit different:
     * <p>
     * a's don’t support the disabled attribute, so you must add the .disabled class to make it visually appear disabled. Some future-friendly styles are included to disable all pointer-events on
     * anchor buttons. In browsers which support that property, you won’t see the disabled cursor at all. Disabled buttons should include the aria-disabled="true" attribute to indicate the state of
     * the element to assistive technologies.
     * <p>
     * <p>
     * <p>
     * Link functionality caveat
     * <p>
     * The .disabled class uses pointer-events: none to try to disable the link functionality of as, but that CSS property is not yet standardized. In addition, even in browsers that do support
     * pointer-events: none, keyboard navigation remains unaffected, meaning that sighted keyboard users and users of assistive technologies will still be able to activate these links. So to be safe,
     * add a tabindex="-1" attribute on these links (to prevent them from receiving keyboard focus) and use custom JavaScript to disable their functionality.
     *
     * @param disabled
     *
     * @return
     */
    BSButton setDisabled(boolean disabled);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setInfo(boolean applyStyle);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setInfoOutline(boolean applyStyle);

    /**
     * Sets the style as link
     *
     * @param applyStyle
     * @return
     */
    J setLink(boolean applyStyle);

    /**
     * Buttons will appear pressed (with a darker background, darker border, and inset shadow) when active.
     * <p>
     * There’s no need to add a class to buttons as they use a pseudo-class. However, you can still force the same active appearance with .active (and include the aria-pressed="true" attribute) should
     * you need to replicate the state programmatically.
     *
     * @param pressed
     *
     * @return
     */
    BSButton setPressed(boolean pressed);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setPrimary(boolean applyStyle);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setPrimaryOutline(boolean applyStyle);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setSecondary(boolean applyStyle);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setSecondaryOutline(boolean applyStyle);

    /**
     * Sizes
     * <p>
     * Fancy larger or smaller buttons? Add .btn-lg or .btn-sm for additional sizes.
     *
     * @param size
     *
     * @return
     */
    BSButton setSize(BSComponentButtonSizeOptions size);

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
    J setSuccessOutline(boolean applyStyle);

    /**
     * Button plugin Do more with buttons. Control button states or create groups of buttons for more components like toolbars.
     *
     * Toggle states Add data-toggle="button" to toggle a button’s active state. If you’re pre-toggling a button, you must manually add the .active class
     *
     * @param toggle
     * @return
     */
    J setToggle(boolean toggle);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setWarning(boolean applyStyle);

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    J setWarningOutline(boolean applyStyle);

}
