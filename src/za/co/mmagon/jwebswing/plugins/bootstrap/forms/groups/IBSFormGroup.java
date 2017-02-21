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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormHelpText;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormLabel;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSFormSelectInput;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSInput;

/**
 *
 * @author GedMarc
 * @param <T>
 * @param <J>
 * @since 20 Feb 2017
 *
 */
public interface IBSFormGroup<T extends Component, J extends BSFormGroup>
{

    /**
     * Return the help text
     *
     * @return
     */
    BSFormHelpText getHelpText();

    /**
     * Returns the input component
     *
     * @return
     */
    Component getInputComponent();

    /**
     * Returns a label. There must always be a label
     *
     * @return
     */
    BSFormLabel getLabel();

    /**
     * The max length message
     *
     * @return
     */
    T getMaxLengthMessage();

    /**
     * Sets the maximum reached message error
     *
     * @return
     */
    T getMaxMessage();

    /**
     * Returns the minimum length message
     *
     * @return
     */
    T getMinLengthMessage();

    /**
     * Returns the minimum reached message component
     *
     * @return
     */
    T getMinMessage();

    /**
     * Sets the component to be shown when there is a pattern error
     *
     * @return
     */
    T getPatternMessage();

    /**
     * Returns the component to be shown when there is a required error
     *
     * @return
     */
    T getRequiredMessage();

    /**
     * Shows a ticket, warning or cross from bootstrap 4
     *
     * @return
     */
    Boolean getShowControlFeedback();

    /**
     * Sets if this form group has validation attached
     *
     * @return
     */
    boolean isAngularValidation();

    /**
     * If this form group must render as a row
     *
     * @return
     */
    boolean isAsRow();

    /**
     * If this group must render as inline
     *
     * @return
     */
    boolean isInline();

    /**
     * Sets if this form group has validation attached
     *
     * @param angularValidation
     *
     * @return
     */
    BSFormGroup setAngularValidation(boolean angularValidation);

    /**
     * If this group must render as a row
     *
     * @param asRow
     *
     * @return
     */
    J setAsRow(boolean asRow);

    /**
     * Sets the help text
     *
     * @param helpText
     * @return
     */
    J setHelpText(BSFormHelpText helpText);

    /**
     * If this group must render as inline
     *
     * @param inline
     *
     * @return
     */
    BSFormGroup setInline(boolean inline);

    /**
     * Sets the input component
     *
     * @param inputComponent
     * @return
     */
    J setInputComponent(BSInput inputComponent);

    /**
     * Sets the input component
     *
     * @param inputComponent
     * @return
     */
    J setInputComponent(BSFormSelectInput inputComponent);

    /**
     * Sets the label to the given label
     *
     * @param label
     * @return
     */
    J setLabel(BSFormLabel label);

    /**
     * The max length message
     *
     * @param maxLengthMessage
     *
     * @return
     */
    J setMaxLengthMessage(T maxLengthMessage);

    /**
     * Sets the maximum reached message error
     *
     * @param maxMessage
     *
     * @return
     */
    J setMaxMessage(T maxMessage);

    /**
     * Sets the minimum length message
     *
     * @param minLengthMessage
     *
     * @return
     */
    J setMinLengthMessage(T minLengthMessage);

    /**
     * Sets the minimum reached message
     *
     * @param minMessage
     *
     * @return
     */
    J setMinMessage(T minMessage);

    /**
     * Sets the component to display when there is a pattern message
     *
     * @param patternMessage
     *
     * @return
     */
    J setPatternMessage(T patternMessage);

    /**
     * Sets the component to be shown when there is a required error
     *
     * @param requiredMessage
     *
     * @return
     */
    J setRequiredMessage(T requiredMessage);

    /**
     * Shows a ticket, warning or cross from bootstrap 4
     *
     * @param showControlFeedback
     *
     * @return
     */
    J setShowControlFeedback(Boolean showControlFeedback);

}
