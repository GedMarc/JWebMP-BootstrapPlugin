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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups;

import java.util.logging.Level;
import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.TextArea;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentColoursOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.componentoptions.BSComponentDefaultOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.*;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSFormSelectInput;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSInput;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets.BSFormInputGroup;
import za.co.mmagon.logger.LogFactory;

/**
 * An implementation of
 * <p>
 * @author Marc Magon
 * @param <T> Is a component and a valid form group child
 * @param <J>
 *
 * @since 17 Jan 2017
 * @version 1.0
 */
public class BSFormGroup<T extends Component, J extends BSFormGroup> extends Div<BSFormGroupChildren, BSFormGroupAttributes, GlobalFeatures, GlobalEvents, J>
        implements BSFormChildren, IBSFormGroup<T, J>
{

    private static final Logger log = LogFactory.getLog("BSFormGroup");

    private static final long serialVersionUID = 1L;
    /**
     * The class name applied to the group when there is an error
     */
    public static String ERROR_CLASS = "has-error";
    /**
     * The class name applied to the group when there is a warning
     */
    public static String WARNING_CLASS = "has-warning";
    /**
     * The class anme applied to the group when there is success
     */
    public static String SUCCESS_CLASS = "has-success";

    /**
     * The class name applied to the group when there is an error
     */
    public static String ERROR_CLASS_FEEDBACK = "form-control-danger";
    /**
     * The class name applied to the group when there is a warning
     */
    public static String WARNING_CLASS_FEEDBACK = "form-control-warning";
    /**
     * The class anme applied to the group when there is success
     */
    public static String SUCCESS_CLASS_FEEDBACK = "form-control-success";

    /**
     * The label
     */
    private BSFormLabel label;
    /**
     * The label help text
     */
    private BSFormHelpText helpText;
    /**
     * The input component for the form group
     */
    private Component inputComponent;
    /**
     * If this group is shown as a row
     */
    private boolean asRow;
    /**
     * If this group is shown as inline
     */
    private boolean inline;
    /**
     * If angular validation is enabled
     */
    private boolean angularValidation;
    /**
     * The actual required message
     */
    private T requiredMessage;
    /**
     * The actual pattern message
     */
    private T patternMessage;
    /**
     * The minimum error message
     */
    private T minMessage;
    /**
     * The maximum error message
     */
    private T maxMessage;
    /**
     * The minimum length for a text field
     */
    private T minLengthMessage;
    /**
     * The maximum length for a message
     */
    private T maxLengthMessage;
    /**
     * Shows a ticket, warning or cross from bootstrap 4
     */
    private Boolean showControlFeedback;

    public BSFormGroup()
    {
    }

    /**
     * Constructs a new instance
     *
     * @param label
     * @param inputComponent
     * @param helpText
     */
    public BSFormGroup(BSFormLabel label, BSInput inputComponent, String helpText)
    {
        this.label = label;
        this.inputComponent = inputComponent;
        this.helpText = new BSFormHelpText(helpText);
        addClass(BSComponentFormGroupOptions.Form_Group);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Constructs a new instance
     *
     * @param label
     * @param inputComponent
     * @param helpText
     */
    public BSFormGroup(BSFormLabel label, BSFormSelectInput inputComponent, String helpText)
    {
        this.label = label;
        this.inputComponent = inputComponent;
        this.helpText = new BSFormHelpText(helpText);
        addClass(BSComponentFormGroupOptions.Form_Group);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Constructs a new instance
     *
     * @param label
     * @param inputComponent
     * @param helpText
     */
    public BSFormGroup(BSFormLabel label, TextArea inputComponent, String helpText)
    {
        this.label = label;
        this.inputComponent = inputComponent;
        this.helpText = new BSFormHelpText(helpText);
        addClass(BSComponentFormGroupOptions.Form_Group);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * Constructs a new instance
     *
     * @param label
     * @param inputComponent
     * @param helpText
     */
    public BSFormGroup(BSFormLabel label, BSFormInputGroup inputComponent, String helpText)
    {
        this.label = label;
        this.inputComponent = inputComponent;
        this.helpText = new BSFormHelpText(helpText);
        addClass(BSComponentFormGroupOptions.Form_Group);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
    }

    /**
     * A neater representation
     *
     * @return
     */
    public IBSFormGroup asMe()
    {
        return this;
    }

    /**
     * Returns a label. There must always be a label
     *
     * @return
     */
    @Override
    public BSFormLabel getLabel()
    {
        if (label == null)
        {
            setLabel(new BSFormLabel("Component Label"));
            label.addClass(BSComponentColoursOptions.Sr_Only);
        }
        return label;
    }

    /**
     * Sets the label to the given label
     *
     * @param label
     *
     * @return
     */
    @Override
    public J setLabel(BSFormLabel label)
    {
        this.label = label;
        return (J) this;
    }

    /**
     * Return the help text
     *
     * @return
     */
    @Override
    public BSFormHelpText getHelpText()
    {
        if (helpText == null)
        {
//            helpText = new BSFormHelpText();
        }
        return helpText;
    }

    /**
     * Sets the help text
     *
     * @param helpText
     *
     * @return
     */
    @Override
    public J setHelpText(BSFormHelpText helpText)
    {
        this.helpText = helpText;
        return (J) this;
    }

    /**
     * Returns the input component
     *
     * @return
     */
    @Override
    public Component getInputComponent()
    {
        if (inputComponent == null)
        {
            //setInputComponent(new BSInput(InputTypes.Text));
        }
        return inputComponent;
    }

    /**
     * Sets the input component
     *
     * @param inputComponent
     *
     * @return
     */
    @Override
    public J setInputComponent(BSInput inputComponent)
    {
        this.inputComponent = inputComponent;
        return (J) this;
    }

    /**
     * Sets the input component
     *
     * @param inputComponent
     *
     * @return
     */
    @Override
    public J setInputComponent(BSFormSelectInput inputComponent)
    {
        this.inputComponent = inputComponent;
        return (J) this;
    }

    /**
     * Adds all the necessary items
     */
    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            if (isAsRow())
            {
                addClass(BSComponentDefaultOptions.Row);
                getLabel().addClass("col-2");
                getInputComponent().addClass("col-10");
            }

            if (getLabel().getParent() == null)
            {
                getLabel().setForInputComponent(getInputComponent());
                add(getLabel());
            }

            if (!(getInputComponent() == null))
            {
                if (getInputComponent().getParent() == null)
                {
                    add((BSFormGroupChildren) getInputComponent());
                }
                if (getHelpText() != null)
                {
                    getInputComponent().addAttribute(GlobalAttributes.Aria_Describedby, getHelpText().getID());
                }
            }

            if (isAngularValidation())
            {
                AngularPageConfigurator.setRequired(this, true);
                BSForm referencedForm = findParent(BSForm.class);
                if (referencedForm == null)
                {
                    log.log(Level.SEVERE, "Unable to map angular, hierarchy doesn't seem to be built right. Expecting a BSForm as a parent somewhere");
                    referencedForm = new BSForm();
                    referencedForm.setID("InvalidForm");
                }

                if (BSFormInline.class.isAssignableFrom(referencedForm.getClass()))
                {
                    setInline(true);
                }

                referencedForm.addAttribute("novalidate", null);
                referencedForm.setTag("ng-form");

                String formName = referencedForm.getID();
                String fieldName = "'" + (getInputComponent() == null ? "" : getInputComponent().getID()) + "'";

                addAttribute(AngularAttributes.ngClass, formName + "[" + fieldName + "].$valid && !" + formName + "[" + fieldName + "].$pristine "
                             + "? '" + SUCCESS_CLASS + "' : " + formName + "[" + fieldName + "].$pristine ? '' : " + " '" + ERROR_CLASS + "'");

                if (getShowControlFeedback() != null && getShowControlFeedback())
                {
                    if (getInputComponent() != null)
                    {
                        getInputComponent().addAttribute(AngularAttributes.ngClass, formName + "[" + fieldName + "].$valid && !" + formName + "[" + fieldName + "].$pristine "
                                                         + "? '" + SUCCESS_CLASS_FEEDBACK + "' : " + formName + "[" + fieldName + "].$pristine ? '' : " + " '" + ERROR_CLASS_FEEDBACK + "'");
                    }
                }

                if (getRequiredMessage() != null)
                {
                    getRequiredMessage().addAttribute(AngularAttributes.ngShow, "" + formName + "[" + fieldName + "].$error.required && !" + formName + "[" + fieldName + "].$pristine");
                    if (!isInline())
                    {
                        getRequiredMessage().addClass(BSComponentFormGroupOptions.Form_Text);
                        getRequiredMessage().addClass(BSComponentFormGroupOptions.Form_Control_Feedback);
                    }

                    getChildren().add(getRequiredMessage());
                }

                if (getPatternMessage() != null)
                {
                    getPatternMessage().addAttribute(AngularAttributes.ngShow, "" + formName + "[" + fieldName + "].$error.pattern && !" + formName + "[" + fieldName + "].$pristine");
                    if (!isInline())
                    {
                        getPatternMessage().addClass(BSComponentFormGroupOptions.Form_Text);
                        getPatternMessage().addClass(BSComponentFormGroupOptions.Form_Control_Feedback);
                    }

                    getChildren().add(getPatternMessage());
                }

                if (getMinMessage() != null)
                {
                    getMinMessage().addAttribute(AngularAttributes.ngShow, "" + formName + "[" + fieldName + "].$error.min && !" + formName + "[" + fieldName + "].$pristine");
                    if (!isInline())
                    {
                        getMinMessage().addClass(BSComponentFormGroupOptions.Form_Text);
                        getMinMessage().addClass(BSComponentFormGroupOptions.Form_Control_Feedback);
                    }

                    getChildren().add(getMinMessage());
                }

                if (getMinLengthMessage() != null)
                {
                    getMinLengthMessage().addAttribute(AngularAttributes.ngShow, "" + formName + "[" + fieldName + "].$error.minlength && !" + formName + "[" + fieldName + "].$pristine");
                    if (!isInline())
                    {
                        getMinLengthMessage().addClass(BSComponentFormGroupOptions.Form_Text);
                        getMinLengthMessage().addClass(BSComponentFormGroupOptions.Form_Control_Feedback);
                    }

                    getChildren().add(getMinLengthMessage());
                }

                if (getMaxMessage() != null)
                {
                    getMaxMessage().addAttribute(AngularAttributes.ngShow, "" + formName + "[" + fieldName + "].$error.max && !" + formName + "[" + fieldName + "].$pristine");
                    if (!isInline())
                    {
                        getMaxMessage().addClass(BSComponentFormGroupOptions.Form_Text);
                        getMaxMessage().addClass(BSComponentFormGroupOptions.Form_Control_Feedback);
                    }

                    getChildren().add(getMaxMessage());
                }

                if (getMaxLengthMessage() != null)
                {
                    getMaxLengthMessage().addAttribute(AngularAttributes.ngShow, "" + formName + "[" + fieldName + "].$error.max && !" + formName + "[" + fieldName + "].$pristine");
                    if (!isInline())
                    {
                        getMaxLengthMessage().addClass(BSComponentFormGroupOptions.Form_Text);
                        getMaxLengthMessage().addClass(BSComponentFormGroupOptions.Form_Control_Feedback);
                    }
                    getChildren().add(getMaxLengthMessage());
                }
            }

            if (!isInline())
            {
                if (getHelpText() != null)
                {
                    getHelpText().setInline(true);
                }
            }
            if (getHelpText() != null)
            {
                add(getHelpText());
            }
        }
        super.preConfigure();
    }

    /**
     * If this form group must render as a row
     *
     * @return
     */
    @Override
    public boolean isAsRow()
    {
        return asRow;
    }

    /**
     * If this group must render as a row
     *
     * @param asRow
     *
     * @return
     */
    @Override
    public J setAsRow(boolean asRow)
    {
        this.asRow = asRow;
        return (J) this;
    }

    /**
     * If this group must render as inline
     *
     * @return
     */
    @Override
    public boolean isInline()
    {
        return inline;
    }

    /**
     * If this group must render as inline
     *
     * @param inline
     *
     * @return
     */
    @Override
    public BSFormGroup setInline(boolean inline)
    {
        this.inline = inline;
        return this;
    }

    /**
     * Sets if this form group has validation attached
     *
     * @return
     */
    @Override
    public boolean isAngularValidation()
    {
        return angularValidation;
    }

    /**
     * Sets if this form group has validation attached
     *
     * @param angularValidation
     *
     * @return
     */
    @Override
    public BSFormGroup setAngularValidation(boolean angularValidation)
    {
        this.angularValidation = angularValidation;
        return this;
    }

    /**
     * Returns the component to be shown when there is a required error
     *
     * @return
     */
    @Override
    public T getRequiredMessage()
    {
        return requiredMessage;
    }

    /**
     * Sets the component to be shown when there is a required error
     *
     * @param requiredMessage
     *
     * @return
     */
    @Override
    public J setRequiredMessage(T requiredMessage)
    {
        setAngularValidation(true);
        this.requiredMessage = requiredMessage;
        return (J) this;
    }

    /**
     * Sets the component to be shown when there is a pattern error
     *
     * @return
     */
    @Override
    public T getPatternMessage()
    {
        return patternMessage;
    }

    /**
     * Sets the component to display when there is a pattern message
     *
     * @param patternMessage
     *
     * @return
     */
    @Override
    public J setPatternMessage(T patternMessage)
    {
        setAngularValidation(true);
        this.patternMessage = patternMessage;
        return (J) this;
    }

    /**
     * Returns the minimum reached message component
     *
     * @return
     */
    @Override
    public T getMinMessage()
    {
        return minMessage;
    }

    /**
     * Sets the minimum reached message
     *
     * @param minMessage
     *
     * @return
     */
    @Override
    public J setMinMessage(T minMessage)
    {
        setAngularValidation(true);
        this.minMessage = minMessage;
        return (J) this;
    }

    /**
     * Sets the maximum reached message error
     *
     * @return
     */
    @Override
    public T getMaxMessage()
    {
        return maxMessage;
    }

    /**
     * Sets the maximum reached message error
     *
     * @param maxMessage
     *
     * @return
     */
    @Override
    public J setMaxMessage(T maxMessage)
    {
        setAngularValidation(true);
        this.maxMessage = maxMessage;
        return (J) this;
    }

    /**
     * Returns the minimum length message
     *
     * @return
     */
    @Override
    public T getMinLengthMessage()
    {
        return minLengthMessage;
    }

    /**
     * Sets the minimum length message
     *
     * @param minLengthMessage
     *
     * @return
     */
    @Override
    public J setMinLengthMessage(T minLengthMessage)
    {
        setAngularValidation(true);
        this.minLengthMessage = minLengthMessage;
        return (J) this;
    }

    /**
     * The max length message
     *
     * @return
     */
    @Override
    public T getMaxLengthMessage()
    {
        return maxLengthMessage;
    }

    /**
     * The max length message
     *
     * @param maxLengthMessage
     *
     * @return
     */
    @Override
    public J setMaxLengthMessage(T maxLengthMessage)
    {
        setAngularValidation(true);
        this.maxLengthMessage = maxLengthMessage;
        return (J) this;
    }

    /**
     * Shows a ticket, warning or cross from bootstrap 4
     *
     * @return
     */
    @Override
    public Boolean getShowControlFeedback()
    {
        return showControlFeedback;
    }

    /**
     * Shows a ticket, warning or cross from bootstrap 4
     *
     * @param showControlFeedback
     *
     * @return
     */
    @Override
    public J setShowControlFeedback(Boolean showControlFeedback)
    {
        setAngularValidation(true);
        this.showControlFeedback = showControlFeedback;
        return (J) this;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 79 * hash + (this.getID().hashCode());
        return hash;
    }

}
